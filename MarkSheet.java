import java.util.Scanner;
public class MarkSheet {
    public static double calculatePercentage(double obtainedMarks, double totalMarks) {
        return (obtainedMarks / totalMarks) * 100;}
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }}
    public static double calculateGPA(double percentage) {
        if (percentage >= 90) {
            return 4.0;
        } else if (percentage >= 80) {
            return 3.5;
        } else if (percentage >= 70) {
            return 3.0;
        } else if (percentage >= 60) {
            return 2.5;
        } else if (percentage >= 50) {
            return 2.0;
        } else {
            return 0.0;
        }}
    public static void displayMarkSheet(String name, double totalMarks, double obtainedMarks, double percentage, String grade, double gpa) {
        System.out.println("***************************************");
        System.out.println("            STUDENT MARK SHEET         ");
        System.out.println("***************************************");
        System.out.printf("Student Name     : %s%n", name);
        System.out.printf("Total Marks      : %.2f%n", totalMarks);
        System.out.printf("Obtained Marks   : %.2f%n", obtainedMarks);
        System.out.printf("Percentage       : %.2f%%%n", percentage);
        System.out.printf("Grade            : %s%n", grade);
        System.out.printf("GPA              : %.2f%n", gpa);
        System.out.println("***************************************");}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();
        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();
        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        String grade = calculateGrade(percentage);
        double gpa = calculateGPA(percentage);
        displayMarkSheet(name, totalMarks, obtainedMarks, percentage, grade, gpa);
        scanner.close();}}