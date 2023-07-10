package day5;

public class gradeForSubject {
    private String subject;
    private double grades;

    public String getSubject() {
        return subject;
    }

    public double getGrades() {
        return grades;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public gradeForSubject(String subject, double grades) {
        this.subject = subject;
        this.grades = grades;
    }
}
