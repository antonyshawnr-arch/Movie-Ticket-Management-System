public class Booking {
    Movie movie;
    int seats;

    Booking(Movie movie, int seats) {
        this.movie = movie;
        this.seats = seats;
    }

    public void displayBooking() {
        System.out.println("\nBooking Details");
        System.out.println("Movie : " + movie.name);
        System.out.println("Time  : " + movie.time);
        System.out.println("Seats : " + seats);
        System.out.println("Total : ₹" + (movie.price * seats));
    }
}
