package ba.smoki.four;

public enum Gender {
    MALE("MALE", "")  //Gender MALE = new Gender("MALE", "");
    , FEMALE("FEMALE", "Važniji spol"); // Gender FEMALE = new Gender("FEMALE", "Važniji spol");


    private String name;
    private String description;

    Gender(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
