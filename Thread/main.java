package Thread;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner sc = new Scanner(System.in);
        int array[] = new int[200];
        System.out.println("number of threader 5.");
       // int numthread = 5;
        System.out.println("Enter the number You want to find: ");
        int N= sc.nextInt();
        int start = 0;
        int range = 39;
        for(int i = 0 ; i<200;i++){
            array[i] = random.nextInt(400);
        }

        for(int i =0 ; i<10;i++){
            for(int j = 0;j<20;j++ ){
                System.out.printf("%d ",array[j+20*i]);
            }
            System.out.println();
            System.out.println();

         //   System.out.println(array[i]);
        }

        for(int i = 0 ; i<5;i++){
                multithread object = new multithread(i, array,N,start,start+range);
                start = start+range;
                object.start();
        }
    }    
}
