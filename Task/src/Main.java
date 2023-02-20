import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String name;

    public static void main(String[] args) {
        List<Painting> paintings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add painting");
            System.out.println("2. Delete painting");
            System.out.println("3. Display information about painting");
            System.out.println("4. Exit");

            System.out.print("Choose an option (1-4): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:

                    Painting newPainting = new Painting();
                    paintings.add(newPainting);
                    System.out.println("Painting was added successfully.");
                    break;


                case 2:
                    System.out.print("Input the name of the painting you want to delete: ");
                    String titleToDelete = scanner.next();

                    boolean removed = false;
                    for (Painting p : paintings) {
                        if (p.getName().equalsIgnoreCase(titleToDelete)) {
                            paintings.remove(p);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Painting was deleted successfully.");
                    } else {
                        System.out.println("No painting with such name found.");
                    }
                    break;

                case 3:
                    Painting displayPaintingInfo = new Painting();
                    paintings.add(displayPaintingInfo);
                    System.out.println("Painting added successfully.");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
