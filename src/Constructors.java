public class Constructors {
    // Shirt

    public static String color;
    public static char size;

    Constructors() {
//        System.out.println("inside constructor");
    }

    Constructors(String NewColor, char newSize) {
        color = NewColor;
        size = newSize;
    }

    public static void putOn() {
        System.out.println("Shirt is on!");
    }

    public static void takeOff() {
        System.out.println("Shirt is off!");
    }

    public static void setColor(String newColor) {
        color = newColor;
    }

    public static void setSize(char newSize) {
        size = newSize;
    }
}
