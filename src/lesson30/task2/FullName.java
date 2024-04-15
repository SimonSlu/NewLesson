package lesson30.task2;

public class FullName {
    private String familyName;
    private String name;
    private String surname;

    public FullName(String familyName, String name, String surname) {
        this.familyName = familyName;
        this.name = name;
        this.surname = surname;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "FullName "  + familyName + " " +
                  name + " " +
                  surname;
    }
}
