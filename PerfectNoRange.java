// Print all perfect number between 1 to n where n will be the user input
package BasicProgram;
import java.util.Scanner;
public class PerfectNoRange { // method creation
    public void findPerfectNo(int no){
        int i,j,count; // variables declaration in method
        for (i=1;i<=no;i++){
            count=0;
            for(j=1;j<i;j++){
                if(i%j==0)
                    count=count+j;
            }
            if (count==i) //  checking entered number is equal or not with count
                System.out.print(count+" ");
        }
    } // end of method
    public static void main(String[] args) {
    int number; // variable declare in main method
        System.out.println("Enter the end point: ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt(); // taking input from user
        System.out.print("The perfect numbers between 1 to 100 are: ");
        PerfectNoRange check= new PerfectNoRange(); // class instantaniate
        check.findPerfectNo(number); // method invoking
    } // end of main method
}
