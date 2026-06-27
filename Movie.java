public class Movie {
    int id;
    String name;
    String time;
    int price;
    

    Movie(int id, String name, String time, int price) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public void display() {
        System.out.println(id + ". " + name + " | " + time + " | ₹" + price);
    }
}