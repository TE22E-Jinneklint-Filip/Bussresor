import java.util.ArrayList;
import java.util.Scanner;

public class BookingSystem {
    private ArrayList<Booking> bookings = new ArrayList<Booking>();
    private ArrayList<Person> customers = new ArrayList<Person>();
    private Bus bus;

    public BookingSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange bussens destination: ");
        String destination = scanner.nextLine();
        this.bus = new Bus(destination);

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Bussbokningssystem ---");
            System.out.println("1. Skapa bokning");
            System.out.println("2. Visa bokningar"); // Implementera detta senare
            System.out.println("3. Avsluta");
            System.out.print("Välj ett alternativ: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Viktigt: Konsumera newline efter nextInt()

            switch (choice) {
                case 1:
                    createBooking();
                    break;
                case 2:
                    // visaBokningar(); // Implementera senare
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    public void createBooking() {

    }
}
