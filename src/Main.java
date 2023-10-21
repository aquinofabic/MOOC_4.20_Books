import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookArrayList = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String inputTitle = scanner.nextLine();
            if (inputTitle.isEmpty()) {
                break;
            }
            System.out.println("Number of pages: ");
            int inputPages = scanner.nextInt();

            System.out.println("Publication year: ");
            int inputPublicationYear = scanner.nextInt();
            String keyboardBuffer = scanner.nextLine();

            bookArrayList.add(new Book(inputTitle, inputPages, inputPublicationYear));

        }
        System.out.println("What information do you want printed? ");
        System.out.println("You can choose title, pages, publication year, or everything");
        String getInformation = scanner.nextLine();
        if (getInformation.equals("everything")) {
            for (Book e : bookArrayList) {
                System.out.println(e);
            }
        } else if (getInformation.equals("title")) {
            for (Book e : bookArrayList) {
                System.out.println(e.getTitle());
            }
        } else if (getInformation.equals("pages")) {
            for (Book e : bookArrayList) {
                System.out.println(e.getPages());
            }
        } else if (getInformation.equals("publication year")) {
            for (Book e : bookArrayList) {
                System.out.println(e.getPublicationYear());
            }
        }
    }
}