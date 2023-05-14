

class circle extends shape{

    circle(int a, int b){
        super(a,a);
    }
    int area(){
        int result = (int) (Math.PI*a*a);
        return result;
    }
}

class rectangle extends shape{
    rectangle(int a, int  b){
        super(a, b);
    }
    int area(){
       int result = a * b;
       return result;
    }
}

class triangle extends shape{
    triangle(int a, int b){
        super(a, b);
    }
    int area(){
        int result = (int) (0.5*a*b);
        return result;
    }
}

abstract class shape{
    int a;
    int b;
    shape(int a, int b){
        this.a=a;
        this.b=b;
    }
    abstract int area();
}

public class Abstract {
    public static void main(String[] args) {
        shape obj1 = new circle(23, 0);
        shape obj2 = new rectangle(24, 23);
        shape obj3 = new triangle(42, 42);
        
        System.out.println("Circle: "+obj1.area()); 
        System.out.println("rectangle: "+obj2.area()); 
        System.out.println("Triangle: "+obj3.area()); 
        
    }    
}
