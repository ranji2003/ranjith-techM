import java.util.ArrayList;
import java.util.Scanner;

public class Student1{
    public static void main(String[] args) {

        ArrayList<Integer> studentIds = new ArrayList<>();
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<String> studentPhones = new ArrayList<>();
        ArrayList<String> studentEmails = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1));


            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Student Phone Number: ");
            String phone = scanner.nextLine();

            System.out.print("Enter Student Email: ");
            String email = scanner.nextLine();


            studentIds.add(id);
            studentNames.add(name);
            studentPhones.add(phone);
            studentEmails.add(email);

            System.out.println();
        }


        System.out.println("\nStudent Details:");
        for (int i = 0; i < studentIds.size(); i++) {
            System.out.println("Student ID: " + studentIds.get(i));
            System.out.println("Name: " + studentNames.get(i));
            System.out.println("Phone Number: " + studentPhones.get(i));
            System.out.println("Email: " + studentEmails.get(i));
            System.out.println();
        }


        scanner.close();
    }
}
