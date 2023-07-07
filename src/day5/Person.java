package day5;

public class Person {
    private String name;
    private String gender;
    private int ID;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Person(String name, String gender, int ID) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
    }
}
