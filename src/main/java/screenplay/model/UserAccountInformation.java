package screenplay.model;

public class UserAccountInformation {

    private final String title;

    public UserAccountInformation(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("{title='%s'}", title);
    }
}
