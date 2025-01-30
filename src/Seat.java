public class Seat {
    private int number;
    private Bus bus;
    private boolean booked;

    public Seat(int number, Bus bus, boolean booked){
        this.number = number;
        this.bus = bus;
        this.booked = booked;
    }

    public void changeBookingStatus(){
        this.booked = !this.booked;
    }


}
