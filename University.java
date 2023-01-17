package deitelChapters.chapter8;

public enum University {
    UNILAG("university of lagos", "lagos"),
    UNIBEN("university of Benin", "Benin"),
    UNICAL("university of Calabar", "calabar");

    private String  name;
    private final String state;

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }


    University(String name, String state) {
        this.name = name;
        this.state = state;
    }
}
