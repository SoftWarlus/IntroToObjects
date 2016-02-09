package p1;

public class Main {

    public static void main(String[] args) {
        // Create ab array of balloons
        Balloon[] thing = new Balloon[5];

        // Build the first balloon
        thing[0] = new Balloon();

        //Build the second balloon
        thing[1] = new Balloon(12, "white");

        //Build the third balloon
        thing[2] = new Balloon(6, "yellow");


        for (Balloon each : thing) {
            if (each != null) {
                System.out.printf("size = %d inches; color = %s%n",
                        each.getSize(), each.getColor());
            }
        }

        // Build a balloon object
        Balloon thing1 = new Balloon();
        /*thing1.size = 10;
        thing1.color = "blue";*/

        Balloon thing2 = new Balloon(12, "red");
        /*thing2.size = 12;
        thing2.color = "orange";*/

        // Show the balloons' characteristics
        System.out.printf("thing1: size = %d inches; color = %s%n",
                thing1.getSize(), thing1.getColor());
        System.out.printf("thing2: size = %d inches; color = %s%n",
                thing2.getSize(), thing2.getColor());
        //Print the number of balloons made today
        System.out.printf("Number of balloons made = %d%n", Balloon.getQuantity());
    }
}

class Balloon {
    // Properties (cannot be changed outside of class)
    private int size;
    private String color;
    private static int quantity = 0;

    // Default constructor
    Balloon() {
        size = 10;
        color = "blue";
        quantity++;
    }

    // Custom constructor
    Balloon(int arg1, String arg2) {
        size = arg1;
        color = arg2;
        quantity++;
    }

    // Return color of the object
    String getColor () {
        return color;
    }

    //Return size of the object
    int getSize () {
        return size;
    }

    static int getQuantity () {
        return quantity;
    }
}