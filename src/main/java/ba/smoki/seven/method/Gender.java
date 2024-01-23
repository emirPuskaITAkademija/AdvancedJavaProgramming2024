package ba.smoki.seven.method;

public enum Gender {
    MALE("muški"),
    FEMALE("ženski"),
    UNKNOWN("nepoznato");

    private String name;

    private Gender(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
