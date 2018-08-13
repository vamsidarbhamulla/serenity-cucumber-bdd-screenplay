package utils;

import cucumber.api.DataTable;
import utils.exceptions.TableConverterException;

import java.util.*;
/***
 * This is a util class that converts Cucumber Data Table into a flat linked hash map.
 * In an ideal project it's better to use plain old java object for each type of data specific model
 * A simple example would be to create a seperate Login Model object with userName and Password data fields
 * ***/
public class ConvertCucumberDataTable {

    private final List<List<String>> dataTable;
    private final Map<String, String> flatMap;
    private final List<String> tableHeader;

    public static Map<String, String> toMap(DataTable dataTable) {
        return new ConvertCucumberDataTable(dataTable).convertToMap();
    }

    private ConvertCucumberDataTable(DataTable dataTable) {
        this.dataTable = dataTable.raw();
        this.tableHeader = this.dataTable.get(0);
        this.flatMap = new LinkedHashMap<>();
    }

    private  Map<String, String> convertToMap() {
        if(this.dataTable.size() == 2) { // in case of only one single data row
            addOnlySingleRowDataToMap();
            return Collections.unmodifiableMap(flatMap);
        }

        Iterator iter = this.dataTable.iterator();
        int rowCnt = 0;
        while(iter.hasNext()) {
            List<String> row = (List)iter.next();
            validRowCheck(row);
            addRowDataToMap(rowCnt, row);
            rowCnt++;
        }

        return Collections.unmodifiableMap(flatMap);
    }

    private void addOnlySingleRowDataToMap() {
        List<String> firstDataRow = this.dataTable.get(1); //
        for( int colCnt=0; colCnt < tableHeader.size(); colCnt++) {
            String key = tableHeader.get(colCnt);
            String value = firstDataRow.get(colCnt);
            flatMap.put(key, value);
        }
    }

    private void addRowDataToMap(int rowCnt, List<String> row) {
        for( int colCnt=0; colCnt < tableHeader.size(); colCnt++) {
            String key = tableHeader.get(colCnt) + "[" + rowCnt + "]";
            String value = row.get(colCnt);
            flatMap.put(key, value);
        }
    }

    private void validRowCheck(List<String> row) {
        if (row.size() != tableHeader.size()) {
            throw new TableConverterException("A DataTable record has missing column data");
        }
    }


}
