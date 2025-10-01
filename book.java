import java.util.ArrayList;
import java.util.Scanner;
class create {
    String author;
    String title;
    int Price;
    create(String a,String t,int p){
        author=a;
        title=t;
        Price=p;
    }
    void display(){
        System.out.println("The book named by "+title +" writtern by "+author);
        System.out.println("Price is: "+Price+ "tk");
    }  
}

public class book {
    public static void  main(String [] args){
        Scanner sc =new Scanner(System.in);
        ArrayList<create>books=new ArrayList<>();
        System.out.print("Enter the number of books: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
           
            System.out.print("Author: ");
            String author=sc.nextLine();
            // sc.nextLine();
            System.out.print("Title: ");
            String title=sc.nextLine();
            System.out.print("Price: ");
            int price=sc.nextInt();
            sc.nextLine();
            books.add(new create(author,title,price));
        }
        System.out.println("The book List is: ");
        for(int i=0;i<n;i++){
            books.get(i).display();
        }
        sc.close();
    }
}
