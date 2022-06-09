// Program to find all armstrong numbers between 1 to n where n will be given by user
package BasicProgram;
import java.util.Scanner;
public class ArmstrongNoRange {
    public void checkArmstrong(int num){
        int rem,count,sum,temp,i; // variables declaration in method
        for (i=1;i<=num;i++) // outer for loop for providing the digit from 1 to user given range
        {
            temp=i; // holding input for future use
            sum=0; // initializing sum=0 everytime before entering in the aremstrong number checking condition
            count=0; // initializing sum=0 everytime before entering in the aremstrong number checking condition
            while(temp>0) // counting the number of digit
            {
                temp=temp/10;
                count++; // count hold the number of digit in the number
            }
            temp=i;
            while(temp>0) // cheking with armstrong number conditions using while loop
            {
                rem=temp%10; // holding remainder
                sum+=Math.pow(rem,count);
                temp=temp/10;
            }
            if (i==sum) // checking whether the sum is equal with actual number
                System.out.println(sum);//  checking entered number is equal or not with sum
        }
    } // end of method
    public static void main(String[] args) {
        int number;// variable declare in main method
        System.out.println("Enter the end point: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt(); // taking input from user
        ArmstrongNoRange find=new ArmstrongNoRange(); // class instantaniate
        System.out.println("The Armstrong numbers between 1 to "+number+ " are: ");
        find.checkArmstrong(number); // method invoking
    } // end of main method
}
