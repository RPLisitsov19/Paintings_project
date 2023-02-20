import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paintings {
     ArrayList<Painting> paintingsList;

    public Paintings() {
        this.paintingsList = new ArrayList<>();
    }

    public ArrayList<Painting> getPaintingsList() {
        return paintingsList;
    }

    public void setPaintingsList(ArrayList<Painting> paintingsList) {
        this.paintingsList = paintingsList;
    }

    public void addPainting(Painting painting) throws Exception {
        for (Painting p : paintingsList) {
            if (p.getId() == painting.getId()) {
                System.out.println("A painting with this Id already exists");
            }
        }
        paintingsList.add(painting);
    }

    public void removePainting(int Id) {
        for (int i = 0; i < paintingsList.size(); i++) {
            if (paintingsList.get(i).getId() == Id) {
                paintingsList.remove(i);
                break;
            }
        }
    }

    public void printPaintingsByAuthor(String authorName) {
        for (Painting painting : paintingsList) {
            if (authorName.isEmpty() || painting.getAuthor().equalsIgnoreCase(authorName)) {
                System.out.println("Name: " + painting.getName());
                System.out.println("Author: " + painting.getAuthor());
                System.out.println("Year: " + painting.getYear());
                System.out.println("Price: " + painting.getPrice());
                System.out.println("Unique Number: " + painting.getId());
            }
        }
    }

    public static void printMostExpensivePaintings(List<Painting> paintings) {
        if (paintings.isEmpty()) {
            System.out.println("No paintings to display.");
            return;
        }

        List<Painting> mostExpensive = new ArrayList<>();
        double highestPrice = Double.MIN_VALUE;

        for (Painting painting : paintings) {
            if (painting.getPrice() > highestPrice) {
                mostExpensive.clear();
                mostExpensive.add(painting);
                highestPrice = painting.getPrice();
            } else if (painting.getPrice() == highestPrice) {
                mostExpensive.add(painting);
            }
        }

        if (mostExpensive.size() == 1) {
            System.out.println("The most expensive painting is:");
            System.out.println(mostExpensive.get(0).toString());
        } else {
            System.out.println("The most expensive paintings are:");
            for (Painting painting : mostExpensive) {
                System.out.println(painting.toString());
            }
        }
    }

    public static double averagePriceByAuthor(List<Painting> paintings, String authorName) {
        double sum = 0.0;
        int count = 0;

        for (Painting painting : paintings) {
            if (authorName.isEmpty() || painting.getAuthor().equalsIgnoreCase(authorName)) {
                sum += painting.getPrice();
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return sum / count;
    }


}
