import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        
    Scanner x=new Scanner(System.in);
    
    System.out.println("Enter The Firest Number");
    int num1=x.nextInt();
    
    
    System.out.println("Enter The Firest Number");
    int num2=x.nextInt();
    
    
    int sum=num1+num2;
    int mun=num1-num2;
    int tim=num1*num2;
    int divid=num1/num2;
    int mdivid=num1%num2;
    
    
    
    System.out.println("sum "+sum);
    System.out.println("mun "+mun);
    System.out.println("tim "+tim);
    System.out.println("divid "+divid);
    System.out.println("mdivid "+mdivid);
    
    }
    
}
