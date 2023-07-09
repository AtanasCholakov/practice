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

    public static double highestStudentGrade(List dataBase, int subjectIndex) {
        double highestGrade = 2;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                if (highestGrade < ((Student) dataBase.get(i)).getGrade()[subjectIndex]) {
                    highestGrade = ((Student) dataBase.get(i)).getGrade()[subjectIndex];
                }
            }
        }
        return highestGrade;
    }

    public static double lowestStudentGrade(List dataBase, int subjectIndex) {
        double lowestGrade = 6;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                if (lowestGrade > ((Student) dataBase.get(i)).getGrade()[subjectIndex]) {
                    lowestGrade = ((Student) dataBase.get(i)).getGrade()[subjectIndex];
                }
            }
        }
        return lowestGrade;
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
        return Double.parseDouble(df.format(salarySum / divider));
    }

    public static double averageGradeOfStudent(List dataBase, String studentName) {
        DecimalFormat df = new DecimalFormat("#.##");
        double gradeSum = 0;
        int divider = 0;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                if (((Student) dataBase.get(i)).getName() == studentName) {
                    for (int j = 0; j < ((Student) dataBase.get(i)).getGrade().length ; j++) {
                        gradeSum += ((Student) dataBase.get(i)).getGrade()[j];
                        divider++;
                    }
                }
            }
        }
        return Double.parseDouble(df.format(gradeSum / divider));
    }

    public static double averageGradeOfClass(List dataBase) {
        DecimalFormat df = new DecimalFormat("#.##");
        double gradeSum = 0;
        int divider = 0;
        double avgGrade = 0;
        int divider2 = 0;
        double gradeSumClass = 0;
        for (int i = 0; i < dataBase.size(); i++) {
            if (dataBase.get(i) instanceof Student) {
                for (int j = 0; j < ((Student) dataBase.get(i)).getGrade().length ; j++) {
                    gradeSum += ((Student) dataBase.get(i)).getGrade()[j];
                    divider++;
                }
                avgGrade += Double.parseDouble(df.format(gradeSum / divider));
                gradeSum = 0;
                divider = 0;
                divider2++;
            }
        }
        return Double.parseDouble(df.format(avgGrade / divider2));
    }

    public static void main(String[] args) {
        Student Asparuh = new Student("Asparuh", "oshte ne e opredelil", 9898, 10, 1, new double[]{5.49, 4.49, 6});
        Student Stanka = new Student("Stanka", "jina", 787878, 8, 24, new double[]{6, 6, 6});
        Teacher Naidenkata = new Teacher("Naiden Nikolov Atanasov", "MUJ", 89080, "teta", new String[]{"geografiq", "jivota"}, 5000);
        Teacher Djaro = new Teacher("Petur Tudjarov", "MUJ", 7777, "teta", new String[]{"himiq", "vsichko"}, 999999999);

        List<Object> dataBase = new ArrayList();
        dataBase.add(Asparuh);
        dataBase.add(Stanka);
        dataBase.add(Naidenkata);
        dataBase.add(Djaro);

        //printInformation(dataBase);
        System.out.println(highestStudentGrade(dataBase, 0));
        System.out.println(lowestStudentGrade(dataBase, 0));
        System.out.println(averageSalary(dataBase));
        System.out.println(averageGradeOfStudent(dataBase, "Asparuh"));
        System.out.println(averageGradeOfClass(dataBase));
    }
}

