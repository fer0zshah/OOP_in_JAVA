
 class pen {
    String color;
    String type;
    public void write(){
        System.out.println("Pen is writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}
public class oop{
    public static void main(String args[]){
    pen pen1=new pen();
    pen1.color="red";
    pen pen2=new pen();
    pen2.color="black";
    pen1.write();
    pen1.printcolor();
    pen2.printcolor();
    pen2.printcolor();
    }
}