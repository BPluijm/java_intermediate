// de interface komt buiten de main method

interface WatterBottleInterface {
    String color = "Blue";
    void fillUp();
    void pourOut();
}

// door implements worden alle variable gebruikt uit de interface
public class InterfaceExample implements WatterBottleInterface {

    public static void main(String[] args) {

        System.out.println(color);

        // door deze toe te voegen is het mogelijk de override uit te printen
        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
        ex.pourOut();
    }
    // de override moet toegevoegd worden want anders werkt de implements WatterBottleInterface niet
    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {
        System.out.println("Now it is empty");
    }
}
