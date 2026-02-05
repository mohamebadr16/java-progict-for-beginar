import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        
    Scanner x=new Scanner(System.in);
    
    
    System.out.printf("Hi\nEnter Your Name: ");
    String name =x.nextLine();
    
    
    System.out.printf("Enter Your Age: ");
    int age=x.nextInt();
    
    
    System.out.printf("Enter Your Weight Of KG: ");
    double weight=x.nextDouble();
    
    
    System.out.printf("Enter Your Length Of M: ");
    double length=x.nextDouble();
    
    
    double bmi=weight/(length*length);
    
    
    System.out.printf("Name: %s%nAge %d years%nWeight: %.2f kg%nLength: %.2f m%nBMI: %.2f ", name,age,weight,length,bmi);
    
    
    
    }
    
}
