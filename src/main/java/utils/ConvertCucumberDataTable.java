package utils;

import cucumber.api.DataTable;
import utils.exceptions.TableConverterException;

import java.util.*;
/***
 * This is a util class that converts Cucumber Data Table into a flat linked hash map.
 *
 * Example 1: Cucumber Data Table data:
 *  *       | username                              | password |
 *  *       | carla_the_online_customer@getnada.com | password |
 * For the above data table the Linked Hash map (flat map object) named credentials looks like below
 *  credentials map size = 2
 *  credentials map values : in this format "key" -> "value"
 * "username" -> "carla_the_online_customer@getnada.com"
 * "password" -> "password"
 *
 * Example 2: Cucumber Data Table data:
 *       | username                              | password |
 *       | carla_the_online_customer@getnada.com | password |
 *       | adam_the_web_admin@mailinator.com     | password |
 * For the above data table the Linked Hash map (flat map object) named credentials looks like below
 *  credentials map size = 4
 *  credentials map values : in this format "key" -> "value"
 * "username[0]" -> "carla_the_online_customer@getnada.com"
 * "password[0]" -> "password"
 * "username[1]" -> "adam_the_web_admin@mailinator.com"
 * "password[1]" -> "password"
 *
 * In an ideal project it's better to use plain old java object for each type of data specific model.
 * A simple example would be to create a seperate Login Model object with userName and Password data fields.
 * ***/
public class ConvertCucumberDataTable {

    private final List<List<String>> rows;
    private final Map<String, String> flatMap;
    private final List<String> headers;

    public static Map<String, String> toMap(DataTable dataTable) {
        return new ConvertCucumberDataTable(dataTable).convertToMap();
    }

    private ConvertCucumberDataTable(DataTable dataTable) {
        this.rows = dataTable.raw();
        this.headers = this.rows.get(0);
        this.flatMap = new LinkedHashMap<>();
    }

    private  Map<String, String> convertToMap() {
        if(this.rows.size() < 2){
            throw new TableConverterException("A DataTable should have atleast one header and one data row");
        }
        if(this.rows.size() == 2) { // in case of only header followed by one single data row
            addOnlySingleRowDataToMap();
            return Collections.unmodifiableMap(flatMap);
        }

        Iterator iter = this.rows.iterator();
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
        List<String> singleDataRow = this.rows.get(1); // extract the last or second row from data table in case of single data row
        validRowCheck(singleDataRow);
        for(int colCnt = 0; colCnt < headers.size(); colCnt++) {
            String key = headers.get(colCnt);
            String value = singleDataRow.get(colCnt);
            flatMap.put(key, value);
        }
    }

    private void addRowDataToMap(int rowCnt, List<String> row) {
        for(int colCnt = 0; colCnt < headers.size(); colCnt++) {
            String key = headers.get(colCnt) + "[" + rowCnt + "]";
            String value = row.get(colCnt);
            flatMap.put(key, value);
        }
    }

    private void validRowCheck(List<String> row) {
        if (row.size() != headers.size()) {
            throw new TableConverterException("A DataTable record has missing column data");
        }
    }


}
