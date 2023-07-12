package day5;

public class Teacher extends Person {

    private String school;
    private String[] subjects;
    private double salary;

    public Teacher(String name, String gender, int ID, String school, String[] subjects, double salary) {
        super(name, gender, ID);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
