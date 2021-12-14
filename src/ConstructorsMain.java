public class ConstructorsMain {

    public static void main(String[] args) {
        Constructors s = new Constructors("White", 'L');

//        s.setColor("White");
//        // dit is een char daarom enkele quotes
//        s.setSize('L');
//        s.putOn();

        System.out.println(s.color);
        System.out.println(s.size);

    }

}
