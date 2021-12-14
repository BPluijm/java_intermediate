public class Recursion {

//    public static void main(String[] args) {
//        sayHi(5);
//    }
//
//    public static void sayHi(int n) {
//        if(n == 0) {
//            System.out.println("Done!");
//        } else {
//            System.out.println("Hi");
//            // dit is om iedere keer dat hij runt er 1 af te trekken, de code runt dus 5x
//            n--;
//            sayHi(n);
//        }
//    }
//
//    // need a base case, om de recursion te stoppen

    public static void main(String[] args) {
        countBackwards(14);
    }

    public static void countBackwards(int n) {
        if(n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }

}


