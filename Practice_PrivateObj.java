class clss1{
    int i;
    String opp;

    public void setInt(int inui){
        i = inui;
    }

    public int getInt(){
        return i ;
    }

    public String getName(){
        return opp ;
    }

    public void setName(String gub){
        opp=gub;
    }
}

public class Practice_PrivateObj {

    public static void main(String[] args) {
        System.out.println("hi mom");
        clss1 pract = new clss1();
      /*   pract.setInt(34);
       // int y = pract.getInt();
        System.out.println(pract.getInt()); */

        pract.opp="hi mom";
        System.out.println(pract.opp);

    }
}