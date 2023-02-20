import java.util.Scanner;

public class Painting {
    String name;
    String author;
     double price;
     int year;
     int Id;
     Scanner scanner = new Scanner(System.in);


    public Painting() {
        System.out.print("Enter the name of the painting: ");
        this.name = scanner.nextLine();

        System.out.print("Enter the author of the painting: ");
        this.author = scanner.nextLine();

        System.out.print("Enter the price of the painting: ");
        this.price = scanner.nextDouble();

        System.out.print("Enter the year the painting was created: ");
        this.year = scanner.nextInt();

        System.out.print("Enter the unique number of the painting: ");
        this.Id = scanner.nextInt();
    }


    public Painting(String name, String author, double price, int year, int uniqueNumber) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
        this.Id = uniqueNumber;
    }

    public Painting(String name, String author, double price) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return Id;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.Id = uniqueNumber;
    }


    public void displayPaintingInfo() {
        System.out.println("Painting Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Year: " + this.year);
        System.out.println("Unique Number: " + this.Id);
    }
}
