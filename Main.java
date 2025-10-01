class car{
    String brand;
    int speed;
    car(String b,int s){
        brand=b;
        speed=s;
    }
    void drive(){
        System.out.println(brand+" is run at speed "+speed+" Km/h");
    }
}

public class Main {
public static void main(String [] args){
    car c1=new car("Toyota",180);
    car c2=new car("Tesla",150);
   
    c1.drive();
    c2.drive();

}   
}