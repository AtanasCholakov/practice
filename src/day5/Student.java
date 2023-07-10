package day5;

import java.util.List;

public class Student extends Person {

    private int clas;
    private int numberInClass;
    private List<gradeForSubject> gradesForSubject;

    public int getClas() {
        return clas;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public List<gradeForSubject> getGradesForSubject() {
        return gradesForSubject;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public void setNumberInClass(int numberInClass) {
        this.numberInClass = numberInClass;
    }

    public void setGradesForSubject(List<gradeForSubject> gradesForSubject) {
        this.gradesForSubject = gradesForSubject;
    }

    public Student(String name, String gender, int ID, int clas, int numberInClass, List<gradeForSubject> gradesForSubject) {
        super(name, gender, ID);
        this.clas = clas;
        this.numberInClass = numberInClass;
        this.gradesForSubject = gradesForSubject;
    }
}
