
import java.util.Scanner;
class Drink
{
    String Drink_name;
    float cost;
    int stock;
    Drink(String Drink_name,float cost,int stock)
    {
       this.Drink_name=Drink_name;
       this.cost=cost;
       this.stock=stock;
    }
    public void getDetails()
    {
        System.out.println("*****Soft Drink Details*****");
        System.out.println("\t\tDrink_name\t|\tCost\t|\tStock\t");
        System.out.println("\t\t"+Drink_name+"\t|\t"+cost+"\t|\t"+stock);
        System.out.println("----------------------------------------------------------");
    }
    void getBill(int qty)
    {
     if(qty<=stock)
     {
          double totbill=qty*cost;
           stock=stock-qty;
           System.out.println("*****Your Invoice*****");
           System.out.println("Dear Customer bill payment Rs.:"+totbill);
           System.out.println("----------------------------------------------------------");
           //System.out.println("Stock after purches:"+stock);
     }
       else
           System.out.println("Not availabe try another drink");
    }
}
public class SoftDrink {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        Drink d1=new Drink("coca cola",40,300);
        Drink d2=new Drink("mountain dio",50,250);
        Drink d3=new Drink("fanta",60,300);
        Drink d4=new Drink("pepsi",50,230);
        while(true)
        {
        System.out.println("Press your Favorite Drink choice:\n1.coca cola\n2.mountain dio\n3.fanta\n4.pepsi\n5.Exit");
        int num=scanner.nextInt();
       System.out.println("Enter Quantity you want if you want exit press 0:");
       int qty=scanner.nextInt();
        switch(num)
        {
            case 1:
                d1.getDetails();
                d1.getBill(qty);
                break;
            case 2:
                d2.getDetails();
                d2.getBill(qty);
                break;
            case 3:
                d3.getDetails();
                d3.getBill(qty);
                break;
            case 4:
                d4.getDetails();
                d4.getBill(qty);
                break;
            case 5:
                System.out.println("Succesfully Exit");
                break;
         }
        }
}
}