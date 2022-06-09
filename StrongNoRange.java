// Program to find all strong numbers between 1 to n where n will be given by user
package BasicProgram;
import java.util.Scanner;
public class StrongNoRange {
    public static int fact(int no){ // method fact for doing factorial
        int j,f=1;
        for (j = 1; j <= no; j++) {
            f = f * j;
        }
        return f;
    } // end of fact method
    public void checkStrongNo(int num){ // method checkStrongNo for cheking each digit is strong number or not
        int factorial, count ,i, rem, temp; // variable declaration in method findStrong
        for (i=1;i<=num;i++) // outer for loop for providing the number from 1 to user given range
        {
            temp=i; // holding the input for future use
            count=0;
             while (temp>0) { // checking strong number using while loop
                    rem = temp % 10; // holding the remainder
                    factorial=fact(rem); // invoking method fact
                    count = count + factorial; // storing the added factorial value of each digit
                 temp = temp / 10;
                }
                if (count ==i) // checking entered number is equal or not with count
                    System.out.println(count);
    }
} // end of method checkStrongNo
    public static void main(String[] args) {
        int number;// variable declare in main method
        System.out.println("Enter the end point: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt(); // taking input from user
        StrongNoRange check=new StrongNoRange(); // class instantaniate
        System.out.println("The Strong numbers between 1 to "+number+ " are: ");
        check.checkStrongNo(number); // method invoking
    } // end of main method
}

