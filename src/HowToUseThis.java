
//    // this werkt niet met static

public class HowToUseThis {

//    int a;
//    int b;
//

//
//    public void setData(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }



    String food;
    char size;

    public void setData(String food, char size) {

        this.food = food;
        this.size = size;
    }

    public static void main(String[] args) {

        ThisIsFun t = new ThisIsFun();
        t.setData("soup","L" );

        System.out.println(t.food);
        System.out.println(t.size;

    }

}
