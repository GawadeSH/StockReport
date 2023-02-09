package stock.com;
import java.util.Scanner;
import java.util.ArrayList;

public class StockProgram
{
     static String stk;
     static int nOfstk,nOfs,vOfs;
     void valueOf()
    {
        System.out.println("Stock report is:-");
        int v1=nOfs*nOfs;
        System.out.println("value of each stock:-"+v1);
        int v2=v1*nOfstk;
        System.out.println("total value of stock:- "+v2);
    }
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Stock name:-");
        stk=s.nextLine();
        al.add(stk);
        System.out.println("Enter Number of Stock:-");
        nOfstk=s.nextInt();
        al.add(nOfstk);
        System.out.println("Enter Number of Share in each stock :-");
        nOfs=s.nextInt();
        al.add(nOfs);
        System.out.println("Enter price of each share:-");
        vOfs=s.nextInt();
        al.add(vOfs);
        System.out.println(al);

        StockProgram t= new StockProgram();
        t.valueOf();


    }
}
