import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception{
    public static void main(String[] args) {

        //boolean flag = true;
        int flag2 = 1;
        do{
            try
            {
                Scanner obj = new Scanner(System.in);
                System.out.println("Please Enter a Number: ");
                int x = obj.nextInt();
                System.out.println("Please Enter the Second Number: ");
                int u = obj.nextInt();

                double result = (double) x/u;
                System.out.printf("result : %d / %d = %.2f\n",x,u,result);
                flag2 = 2;

            }catch(InputMismatchException e)
                {
                    System.out.println("String or Character! try again with integer Exception: "+e);
                    //System.out.println("Exception: "+e);
                }
                catch(ArithmeticException e)
                {
                    System.out.println("Zero! try integer. Exception: "+e);
                    //System.out.println("Exception: "+e);
                }
                catch(Exception e2){
                    System.out.println("Invalid Input. Exception: "+e2);
                }
        }while(flag2==1);
    }
}