import java.util.Scanner;
class Person1 {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


}
class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }


}

class Person2 {
    private String name;
    private int age;
    private String country;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCountry(String country) { this.country = country; }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }


}


class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class oopsclassincollege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation: 1. Add 2. Subtract 3. Multiply 4. Divide");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + calculator.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + calculator.subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + calculator.multiply(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Result: " + calculator.divide(num1, num2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}