public class MainInheritance {

    public static void main(String[] args) {
        Inheritance1 m1 = new Inheritance1();
        Inheritance2 m2 = new Inheritance2();

        m1.leftClick();
        m1.rightClick();
        m1.scrollDown();
        m1.scrollUp();


        m2.leftClick();
        m2.rightClick();
        m2.scrollDown();
        m2.scrollUp();

        m2.connect();
    }
}
