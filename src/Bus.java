import java.util.ArrayList;

public class Bus {
    private ArrayList<Seat> seats = new ArrayList<Seat>();
    private String destination;

    public Bus(ArrayList<Seat> seats, String destination){
        this.seats = seats;
        this.destination = destination;

    }

    public Seat getSeatinfo(){
        if (!seats.isEmpty()){
            return seats.get(0);
        }
        return null;
    }
}
