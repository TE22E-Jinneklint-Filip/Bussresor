import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    private ArrayList<Seat> seats = new ArrayList<>();
    private String destination;

    public Bus(String destination) {
        this.destination = destination;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange antal platser i bussen: ");
        int seatCount = scanner.nextInt();
        for (int i = 1; i <= seatCount; i++) {
            seats.add(new Seat(i, this));
        }

    }

    public Seat getSeatInfo(int seatNumber) {
        for (Seat seat : seats) {
            if (seat.getNumber() == seatNumber) {
                return seat;
            }
        }
        return null;
    }
}
