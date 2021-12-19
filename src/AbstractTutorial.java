// doordat het een abstracte class is kun je hem niet als normale class gebruiken.
abstract class Dog {

    public void bark() {
        System.out.println("Bark!");
    }

    // Als je deze weg haalt werkt het nog steeds.
    // Maar om aan te geven wat de hond allemaal kan plaatsen we het in de abstract class
    public abstract void poop();

}

class Chihuahua extends Dog {
    // de public void moet je toe voegen want anders werkt de class Chihuahua niet
    public void poop() {
        System.out.println("Dog pooped!");
    }
}

public class AbstractTutorial {

    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();

        // hier wordt de println aangeroepen om ook op het scherm te verschijnen
        c.bark();
        c.poop();

    }
}
