

 interface Animal{
    void bark();
    void eat();
    //void sleep();
    
}
 interface mammals{
     void walk();
     void eat();
 }
  class dog implements Animal,mammals{

    @Override
    public void bark() {
         System.out.println("Dog is barking!");
    }
    
    @Override
    public void eat(){
        System.out.println("Eat Meat");
    }
    
    @Override
    public void walk(){
        System.out.println("Walk in four legs");
    }
}
public class interfaceProblem {
    public static void main(String[] args) {

        dog Dog = new dog();
        Dog.bark();
        Dog.eat();
        mammals cat = new dog();
        cat.walk();
    
     }
    
}
