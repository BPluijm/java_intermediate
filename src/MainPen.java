import jdk.swing.interop.SwingInterOpUtils;

public class MainPen {

    public static void main(String[] args) {
        ObjectOrientedProgramming p = new ObjectOrientedProgramming();
        Headphones h = new Headphones();

        System.out.println(p.color);
        System.out.println(p.type);
        System.out.println(p.point);

        System.out.println(p.clicked);

        p.click();

        System.out.println(p.clicked);

        System.out.println(h.charge);
        System.out.println(h.controls[0]);
        System.out.println(h.power);

        System.out.println(h.volume);


    }
}
