
class values{
    private float radius, area, circumsference;
   

    public void setradius(float r){
        radius = r;
    }
        
    public void setArea(float a){
        if(a==22*radius*radius/7){
            area = a;
        }
        else { 
            System.out.println("Doesn't match with Area.");
        }
    }

    public void setCircumsference(float c){
       if(c==22*2*radius/7){
            circumsference = c;
       }
       else System.out.println("Doesn't match with circumsference.");
    }

    public float getradius(){
        return radius;

    }
    public float getArea(){
        return area;
    }
    
    public float getCircumsference(){
        return circumsference;
    }
}

public class Area_Circumsference {
    public static void main(String[] args) {
        values circle = new values();
        circle.setradius(9.0f);
    
        circle.setArea(254.571428571429f);
        circle.setCircumsference(56.5714285714286f);
        System.out.println("radius: "+circle.getradius());
        System.out.println("Area: "+circle.getArea());
        System.out.println("Circumsference: "+circle.getCircumsference());
    }
}
