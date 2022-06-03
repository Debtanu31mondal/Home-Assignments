package BasicProgram;
// program to find profit or loss on costprice and sellingprice
import java.util.Scanner;
public class ProfitLoss { //method creaton
    public void findProfitloss(int cost,int sell)
    { //checking profit or loss
        if (sell>cost)
        {
            int  p=sell-cost;
            System.out.println("You have profit and your profit amount is: "+p);
        }
        else if (cost>sell)
        {
            int l=cost-sell;
            System.out.println("You have loss and your loss amount is: "+l);
        }
        else if (sell==cost)
            System.out.println("You have no profit and no loss");
        else
            System.out.println("Invalid entry");
    } // end of method

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost price and selling price");
        int costprice,sellingprice;
        costprice=sc.nextInt();
        sellingprice=sc.nextInt();
        ProfitLoss obj=new ProfitLoss(); // class instantiation
        obj.findProfitloss(costprice,sellingprice); // method invoking

    }
}

