import java.util.*;
public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME : ");
        String name=in.nextLine();
        System.out.print("ENTER YOUR ROLL NUMBER : ");
        String rollnum=in.nextLine();
        System.out.print("ENTER YOUR FATHER NAME : ");
        String fname=in.nextLine();
        System.out.print("ENTER YOUR CLASS : ");
        String classname=in.nextLine();
        System.out.print("ENTER YOUR SECTION : ");
        String section=in.next();
        System.out.print("ENTER PHYSICS MARKS : ");
        double phy=in.nextDouble();
        System.out.print("ENTER CHEMISTRY MARKS : ");
        double chem=in.nextDouble();
        System.out.print("ENTER MATHS MARKS : ");
        double maths=in.nextDouble();
        System.out.print("ENTER ENGLISH MARKS : ");
        double eng=in.nextDouble();
        System.out.print("ENTER PHYSICAL EDUCATION MARKS : ");
        double phys=in.nextDouble();
        double total,per;
        total=phy+chem+maths+eng+phys;
        per=(total/500)*100;
        System.out.println("                        XYZ PUBLIC SCHOOL              ");
        System.out.println("                         YEAR-2024-2025                ");
        System.out.print("NAME : "+name                       );
        System.out.println("                                  ROLL NUMBER : "+rollnum             );
        System.out.print("FATHER NAME : "+fname               );
        System.out.println("                                  CLASS : "+classname             );
        System.out.println("SECTION : "+section                  );
        System.out.println("SUBJECT NAME  |   MARKS OBTAINED     |  TOTAL MARKS           ");
        System.out.println("  PHYSICS     |      "+phy+"            |      100               ");
        System.out.println("  CHEMISTRY   |      "+chem+"            |      100               ");
        System.out.println("  MATHS       |      "+maths+"            |      100               ");
        System.out.println("  ENGLISH     |      "+eng+"            |      100               ");
        System.out.println("  P.EDUCATION |      "+phys+"            |      100               ");
        System.out.println("-------------------------------------------------------        ");
        System.out.println("  TOTAL       |      "+total+"           |      500               ");
        System.out.println();
        System.out.println("PERCENTAGE OBTAINED : "+per);
        if(per>95)
        {
            System.out.println("GRADE : A+");
            System.out.println("EXCELLENT PERFORMANCE");
        }
        else if (per<95 && per>85)
        {
            System.out.println("GRADE : A");
            System.out.println("WONDERFUL PERFORMANCE");
        }
        else if (per<85 && per>75)
        {
            System.out.println("GRADE : B");
            System.out.println("GOOD PERFORMANCE");
        }
        else if (per<75 && per>65)
        {
            System.out.println("GRADE : C");
            System.out.println("NICE PERFORMANCE");
        }
        else if (per<65 && per>55)
        {
            System.out.println("GRADE : D");
            System.out.println("NEED TO IMPROVE ");
        }
        else
        {
            System.out.println("GRADE : E");
            System.out.println("FAIL");
        }
    }
}
