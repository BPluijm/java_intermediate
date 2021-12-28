public class ObjectOrientedProgramming {

    String type = "gel";
    String color = "blue";
    int point = 10;

    static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unClick() {
        clicked = false;
    }

}

//// file naam moet hetzelfde zijn
//public class Example1 {
//
//    String flavor;
//
//    // setter
//    public void setFlavor(String newFlavor) {
//        flavor = newFlavor;
//    }
//
//    // getter
//    public String getFlavor() {
//        return flavor;
//    }
//
//    public void openBag() {
//        System.out.println("Bag is openend!");
//    }
//
//}
//
//
//// normaal in een andere class
//
//public class Example2 {
//
//    public static void main(String[] args) {
//        Example1 e1 = new Example1();
//        e1.setFlavor("Beef");
//        System.out.println(e1.getFlavor());
//    }
//}


// voorbeeld interface

// lijst variabele en methode
//public interface Example1 {
//
//    final String flavor = "Beef";
//
//    void openBag();
//}
//
//public class Example2 implements Example1 {
//
//    public static void main(String[] args) {
//        Example2 e2 = new Example();
//        e2.openBag();
//    }
//
//    @Override
//    public void openBag() {
//        System.out.println("Bag openend");
//    }
//}