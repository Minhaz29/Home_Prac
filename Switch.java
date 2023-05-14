import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter Binary number (0-1) 3 Digit between:");
        String c = in.next(); */
        Scanner sc2 = null;
        try {
            sc2 = new Scanner(new File("translate.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();  
        }
        while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
            while (s2.hasNext()) {
                String s = s2.next();
                System.out.println(s);
            }
        }
        switch(s){
            case 100: 
            System.out.println("Red");
            break;

            case 010: 
            System.out.println("Green");
            break;

            case 011: 
            System.out.println("Cyan");
            break;

            case 110: 
            System.out.println("Megenda");
            break;

            case 111: 
            System.out.println("White");
            break;

            case 000: 
            System.out.println("Black");
            break;
            default:
            System.out.println("Sorry!! No Colors available for this Number Now");


        }
    }
    
}
