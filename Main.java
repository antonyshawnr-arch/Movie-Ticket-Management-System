import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("admin", "1234");

        Movie[] movies = {
                new Movie(1, "Leo", "10:00 AM", 200),
                new Movie(2, "Jailer", "1:00 PM", 180),
                new Movie(3, "Vikram", "6:00 PM", 220)
        };

        Booking booking = null;

        System.out.println("===== Movie Ticket Management System =====");

        System.out.print("Username: ");
        String u = sc.next();

        System.out.print("Password: ");
        String p = sc.next();

        if (!user.login(u, p)) {
            System.out.println("Invalid Login");
            return;
        }

        int choice;

        do {

            System.out.println("\n1.View Movies");
            System.out.println("2.Book Ticket");
            System.out.println("3.View Booking");
            System.out.println("4.Cancel Booking");
            System.out.println("5.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    for (Movie m : movies)
                        m.display();

                    break;

                case 2:

                    System.out.print("Enter Movie ID: ");
                    int id = sc.nextInt();

                    System.out.print("Number of Seats: ");
                    int seats = sc.nextInt();

                    if (id >= 1 && id <= movies.length) {
                        booking = new Booking(movies[id - 1], seats);
                        System.out.println("Ticket Booked Successfully.");
                    } else {
                        System.out.println("Invalid Movie ID.");
                    }

                    break;

                case 3:

                    if (booking != null)
                        booking.displayBooking();
                    else
                        System.out.println("No Booking Found.");

                    break;

                case 4:

                    if (booking != null) {
                        booking = null;
                        System.out.println("Booking Cancelled.");
                    } else {
                        System.out.println("No Booking Found.");
                    }

                    break;

                case 5:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 5);

        sc.close();
    }
}
