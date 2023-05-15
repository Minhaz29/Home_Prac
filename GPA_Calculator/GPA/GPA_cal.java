package GPA;

public class GPA_cal{

    public double grade(int a){
        if(a>=80){
            return 5;
        }
        else if(a>=70&&a<80){
            return 4;
        }
        else if(a>=60&&a<70){
            return 3.5;
        }
        else if(a>=50&&a<60){
            return 3;
        }
        else if(a>=40&&a<50){
            return 2.5;
        }
        else if(a>=33&&a<40){
            return 2;
        }
        else if(a<33){
            return 0;
        }

        return 0;

    }
}