package Thread;

class multithread extends Thread{
    int id;
    int start; 
    private int[] array;
    int end;
    int N;
    multithread(int id, int array[], int N,int start,int end){
        this.id= id;
        this.start= start;
        this.end = end;
        this.array=array;
        this.N = N;
    }

    public void run(){
        for(int i = start;i<end;i++){

            if(array[i]==N){
                System.out.println("Found by Thread No: "+(id+1)+". The index is "+(i+1));
                try
                {
                     sleep(100);
                }catch (InterruptedException ex)
                {
                     System.out.println(ex.getMessage());
                } 
             }
        }
    }
}
