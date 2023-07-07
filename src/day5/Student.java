package day5;

public class Student extends Person {

    private int clas;
    private int numberInClass;
    private double[] grade;

    public int getClas() {
        return clas;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public double[] getGrade() {
        return grade;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public void setNumberInClass(int numberInClass) {
        this.numberInClass = numberInClass;
    }

    public void setGrade(double[] grade) {
        this.grade = grade;
    }

    public Student(String name, String gender, int ID, int clas, int numberInClass, double[] grade) {
        super(name, gender, ID);
        this.clas = clas;
        this.numberInClass = numberInClass;
        this.grade = grade;
    }
}
