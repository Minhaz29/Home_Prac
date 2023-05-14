class first{

    public int a=45;
    public int method1(){
        System.out.println("TY 1");
        return 9;

    }
}

class second extends first{
    @Override
    public int method1(){
        System.out.println("TY 2");
        return 10;
    }
}

public class Overriding {
     public static void main(String[] args) {
        second sec = new second();
        int b = sec.method1();
        System.out.println(sec.a);

     }
}
