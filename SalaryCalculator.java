package BasicProgram;
// program to calculate gross salary depending on the basic salary
import java.util.Scanner;
public class SalaryCalculator {
    double gross,hra,da; // variables declaration in method
    //method creaton
    public void grossSalary(int basic)
    { // checking basic salary and calculating gross salary
        if (basic<=10000)
        {
             hra=0.2*basic;
             da=0.8*basic;

        }
        else if(basic>=10001 && basic<=20000)
        {
             hra=0.25*basic;
             da=0.9*basic;
        }
        else if(basic>=20001) {
             hra = 0.3 * basic;
             da = 0.95 * basic;
        }
         gross= basic+hra+da;
        System.out.println("Your gross salary is: "+gross);
    }     // end of method
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your basic salary:");
        int salary=input.nextInt(); // variable declaration
        SalaryCalculator calculate= new SalaryCalculator(); // class instantiation
        calculate.grossSalary(salary); // method invoking
    } // end of main method
}
