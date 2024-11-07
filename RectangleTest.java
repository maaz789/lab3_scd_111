import java.util.Scanner;
class Rectangle {
    private double length = 1.0;
    private double width = 1.0;
    public Rectangle() {}
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);}
    public double getLength() {
        return length;}
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Length must be between 0.0 and 20.0");}}
    public double getWidth() {
        return width;}
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Width must be between 0.0 and 20.0");}}
    public double calculatePerimeter() {
        return 2 * (length + width);}
    public double calculateArea() {
        return length * width;}}
public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.printf("Length: %.2f, Width: %.2f%n", rectangle.getLength(), rectangle.getWidth());
        System.out.printf("Area: %.2f, Perimeter: %.2f%n", rectangle.calculateArea(), rectangle.calculatePerimeter());
        System.out.print("\nEnter the length for a new rectangle: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);
        System.out.print("Enter the width for the new rectangle: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);
        System.out.println("\nUpdated Rectangle:");
        System.out.printf("Length: %.2f, Width: %.2f%n", rectangle.getLength(), rectangle.getWidth());
        System.out.printf("Area: %.2f, Perimeter: %.2f%n", rectangle.calculateArea(), rectangle.calculatePerimeter());
        System.out.println("\nTrying to set invalid values:");
        rectangle.setLength(25.0);
        rectangle.setWidth(-5.0);
        System.out.printf("After invalid updates - Length: %.2f, Width: %.2f%n", rectangle.getLength(), rectangle.getWidth());
        scanner.close();}}
