class relation2 extends relaton{
    String age;
    void display(){
        display2();
        System.out.println("Age: "+age);
    }
}

class relaton extends people{
    String address="Dhaka";
    String gender;
    void display2(){
        System.out.println("Name: "+Name);
        System.out.println("Gender: "+gender);
        System.out.println("relation: "+relatation);
        System.out.println("address: "+address);
    }
}

class people{
    String Name;
    String relatation ;

}

public class Inhertance_1{

    public static void main(String[] args) {
       //  relaton obj2 = new relaton();
         relation2 obj2 = new relation2();

         obj2.Name= "Rakib";
         obj2.gender = "male";
         obj2.relatation = "Friend";
         obj2.address = "Dhaka, Bangladesh";
         obj2.age= "22";

        // obj2.display2();
         obj2.display();
    }
}