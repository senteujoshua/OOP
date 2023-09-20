import java.util.Scanner;

public class PayRoll {
    public static void main(String[] args) {
        Scanner employNo = new Scanner(System.in);


        Scanner employName= new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name= employName.nextLine();
        Scanner designation = new Scanner(System.in);
        System.out.print("Enter your Designation;");
        String desig =designation.nextLine();
        Scanner days= new Scanner(System.in);
        System.out.println("Enter the number of Days worked");
        int workinDays= days.nextInt();
        Scanner payRate= new Scanner(System.in);
        System.out.println("Enter Payrate");
        int rate= payRate.nextInt();
        Scanner date= new Scanner(System.in);
        System.out.println("Date:");
        String  genDate= date.nextLine();
        int BasicSal =workinDays*rate;
        int P_f=BasicSal/10;
        final int PROF_TAX=200;
        int grossEarn =BasicSal;
        int totalDeduct =P_f+PROF_TAX;
        int netPay =BasicSal-totalDeduct;
        System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP :1");
        int num=employNo.nextInt();
        System.out.println("\t\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("\t\t\t\t\t\t\t SALARY MONTH 9 2023");
        System.out.println("\t\tEMP.NO.: "+num+"       EMP.NAME: "+name+"     DESIGNATION:"+designation);
        System.out.println("\t\tDAYS WORKED: "+workinDays+"   PAY RATE: "+payRate+"  GEN.DATE:"+date);
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tEARNINGS          AMOUNT(R.S)           DEDUCTIONS            AMOUNT(RS");
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tBASIC PAY         "+BasicSal+"          P.F.                   "+P_f);
        System.out.println("                                            PROF.TAX               "+PROF_TAX);
        System.out.println("\t\t------------------------------------------------------------------------------");
        System.out.println("\t\tGROSS EARN.        "+grossEarn+"         TOTAL DEDUCT.          "+totalDeduct);
        System.out.println("                                             NET PAY                "+netPay);




    }
}
