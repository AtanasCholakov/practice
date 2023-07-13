package day5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class main2 {

    public static void printInformation(List dataBase) {
        for (int i = 0; i < dataBase.size(); i++) {
            System.out.println("User " + (i + 1));
            if (dataBase.get(i) instanceof Student) {
                System.out.println("Name: " + ((Student) dataBase.get(i)).getName());
                System.out.println("Gender: " + ((Student) dataBase.get(i)).getGender());
                System.out.println("ID: " + ((Student) dataBase.get(i)).getID());
                System.out.println("Class: " + ((Student) dataBase.get(i)).getClas());
                System.out.println("NumberInClass: " + ((Student) dataBase.get(i)).getNumberInClass() + "\n");
            } else {
                System.out.println("Name: " + ((Teacher) dataBase.get(i)).getName());
                System.out.println("Gender: " + ((Teacher) dataBase.get(i)).getGender());
                System.out.println("ID: " + ((Teacher) dataBase.get(i)).getID());
                System.out.println("School: " + ((Teacher) dataBase.get(i)).getSchool());
                System.out.println("Salary: " + ((Teacher) dataBase.get(i)).getSalary() + "\n");
            }

        }
    }

    public static String highestStudentGrade(List dataBase, String subjectName) {
        double highestGrade = 2;
        String studentName = "";
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                for (int j = 0; j < ((Student) dataBase.get(i)).getGradesForSubject().size(); j++) {
                    if (((Student) dataBase.get(i)).getGradesForSubject().get(j).getSubject() == subjectName) {
                        if (highestGrade < ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades()) {
                            highestGrade = ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades();
                            studentName = ((Student) dataBase.get(i)).getName();
                        }
                    }
                }

            }
        }
        return studentName;
    }

    public static String lowestStudentGrade(List dataBase, String subjectName) {
        double lowestGrade = 6;
        String studentName = "";
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                for (int j = 0; j < ((Student) dataBase.get(i)).getGradesForSubject().size(); j++) {
                    if (((Student) dataBase.get(i)).getGradesForSubject().get(j).getSubject() == subjectName) {
                        if (lowestGrade > ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades()) {
                            lowestGrade = ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades();
                            studentName = ((Student) dataBase.get(i)).getName();
                        }
                    }
                }

            }
        }
        return studentName;
    }

    public static double averageSalary(List dataBase) {
        DecimalFormat df = new DecimalFormat("#.##");
        double salarySum = 0;
        int divider = 0;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Teacher) {
                salarySum += ((Teacher) dataBase.get(i)).getSalary();
                divider++;
            }
        }
        return Math.round((salarySum / divider) * 100) / 100.0;
    }

    public static double averageGradeOfStudent(List dataBase, String studentName) {
        double gradeSum = 0;
        int divider = 0;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                if (((Student) dataBase.get(i)).getName() == studentName) {
                    for (int j = 0; j < ((Student) dataBase.get(i)).getGradesForSubject().size(); j++) {
                        gradeSum += ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades();
                        divider++;
                    }
                }
            }
        }
        return Math.round((gradeSum / divider) * 100) / 100;
    }

    public static double averageGradeOfClass(List dataBase) {
        DecimalFormat df = new DecimalFormat("#.##");
        double gradeSum = 0;
        int divider = 0;
        double avgGrade = 0;
        int divider2 = 0;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                for (int j = 0; j < ((Student) dataBase.get(i)).getGradesForSubject().size(); j++) {
                    gradeSum += ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades();
                    divider++;
                }
                avgGrade += Math.round((gradeSum / divider) * 100) / 100.0;
                gradeSum = 0;
                divider = 0;
                divider2++;
            }
        }
        return Math.round((avgGrade / divider2) * 100) / 100.0;
    }

    public static String highestStudentGradeForSubject(List dataBase, String studentName) {
        double highestGrade = 2;
        String subjectName = "";
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                if (((Student) dataBase.get(i)).getName() == studentName) {
                    for (int j = 0; j < ((Student) dataBase.get(i)).getGradesForSubject().size(); j++) {
                        if (highestGrade < ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades()) {
                            highestGrade = ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades();
                            subjectName = ((Student) dataBase.get(i)).getGradesForSubject().get(j).getSubject();
                        }
                    }
                }

            }
        }
        return subjectName;
    }

    public static double getAverageGradeForSubject(List dataBase, String subjectName) {
        double gradeSum = 0;
        int divider = 0;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                for (int j = 0; j < ((Student) dataBase.get(i)).getGradesForSubject().size(); j++) {
                    if (((Student) dataBase.get(i)).getGradesForSubject().get(j).getSubject() == subjectName) {
                        gradeSum += ((Student) dataBase.get(i)).getGradesForSubject().get(j).getGrades();
                        divider++;
                    }
                }
            }
        }
        return Math.round((gradeSum / divider) * 100) / 100;
    }

    public static String returnTeacherThatSignHighestGrades(List dataBase, String[] subjects) {
        double highestSubjectGrade = 2;
        String highestSubjectGradeName = "";
        String teacher = "";
        for (int i = 0; i < subjects.length; i++) {
            if (highestSubjectGrade < getAverageGradeForSubject(dataBase, subjects[i])) {
                highestSubjectGrade = getAverageGradeForSubject(dataBase, subjects[i]);
                highestSubjectGradeName = subjects[i];
            }
        }

        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Teacher) {
                for (int j = 0; j < ((Teacher) dataBase.get(i)).getSubjects().length; j++) {
                    if (((Teacher) dataBase.get(i)).getSubjects()[j] == highestSubjectGradeName) {
                        teacher = ((Teacher) dataBase.get(i)).getName();
                    }
                }
            }
        }

        return teacher;
    }

    public static void main(String[] args) {
        String[] subjects = {"Math", "English", "Geography"};
        List<gradeForSubject> gradesForSubject = new ArrayList<>();
        gradesForSubject.add(new gradeForSubject("Math", 4));
        gradesForSubject.add(new gradeForSubject("English", 3.5));
        gradesForSubject.add(new gradeForSubject("Geography", 4.49));
        List<gradeForSubject> gradesForSubject2 = new ArrayList<>();
        gradesForSubject2.add(new gradeForSubject("Math", 6));
        gradesForSubject2.add(new gradeForSubject("English", 5.5));
        gradesForSubject2.add(new gradeForSubject("Geography", 2.49));
        Student Georgi = new Student("Georgi", "male", 98989898, 10, 1, gradesForSubject);
        Student Stanka = new Student("Stanka", "female", 78787878, 8, 24, gradesForSubject2);
        Teacher Ivan = new Teacher("Ivan Ivanov", "male", 89080432, "PGEE", new String[]{"Geography"}, 5000);
        Teacher Ivo = new Teacher("Ivo Andonov", "male", 67812380, "PGEE", new String[]{"Math"}, 2000);
        Teacher Zdravko = new Teacher("Zdravko Kiselov", "male", 77777777, "PGEE", new String[]{"English"}, 9999);

        List<Object> dataBase = new ArrayList();
        dataBase.add(Georgi);
        dataBase.add(Stanka);
        dataBase.add(Ivan);
        dataBase.add(Ivo);
        dataBase.add(Zdravko);

        printInformation(dataBase);
        System.out.println(lowestStudentGrade(dataBase, "English") + " has the lowest grade in English!");
        System.out.println(highestStudentGrade(dataBase, "Geography") + " has the highest grade in Geography!");
        System.out.println(highestStudentGrade(dataBase, "Math") + " has the highest grade in Math!");
        System.out.println("The average teacher salary is: " + averageSalary(dataBase));
        System.out.println("Georgi's average grade is: " + averageGradeOfStudent(dataBase, "Georgi"));
        System.out.println("The average grade of the class is: " + averageGradeOfClass(dataBase));
        System.out.println("Georgi is best at: " + highestStudentGradeForSubject(dataBase, "Georgi"));
        System.out.println("The average grade of math is: " + getAverageGradeForSubject(dataBase, "Math"));
        System.out.println(returnTeacherThatSignHighestGrades(dataBase, subjects) + " signs the highest grades!");
    }
}

