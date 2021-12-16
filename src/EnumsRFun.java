//enum Level {
//    LOW, MEDIUM, HIGH
//}

// Enums mogen buiten en binnen een class staan
// ze worden gebruikt voor dingen die niet veranderen

//public class EnumsRFun {
//
//        public static void main(String[] args) {
//
//            Level l = Level.LOW;
//
//            switch(l) {
//                case LOW:
//                    System.out.println("Low level");
//                    break;
//                case MEDIUM:
//                    System.out.println("Medium level");
//                    break;
//                case HIGH:
//                    System.out.println("High level");
//                    break;
//            }
//
//    }
//}


// Binnen de class

public class EnumsRFun {

    enum Flavor {
        CHOCOLATE, VANILLA, STRAWBERRY;

//        public static void getVanilla() {
//            System.out.println(Flavor.VANILLA);
//        }

    }

    public static void main(String[] args) {
        Flavor flav = Flavor.VANILLA;

        if(flav == flav.VANILLA) {
            System.out.println("it's vanilla");
        } else if (flav == flav.CHOCOLATE) {
            System.out.println("it's chocolate");
        } else if (flav == flav.STRAWBERRY) {
            System.out.println("it's strawberry");
        }

    }

}
