public class Staticky {

    static int a = 0;
    static int months = 12;

    public static void main(String[] args) {
        int b = 1;

        // als je a buiten de main wilt aanroepen dan moet deze static zijn
        // is deze niet static dan zou je eerst de class moeten aanroepen om hem te kunnen printen
//        Staticky s = new Staticky();
//        System.out.println(s.a);

        System.out.println(a + b);

    }
}
