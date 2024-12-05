import java.util.Scanner;
public class cbse_calculator {
    public static void main(String[] args){
      float total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your total marks");
        float total_marks=sc.nextFloat();
        System.out.println("Enter your subject 1 marks");
        float s1=sc.nextFloat();
        total=total+s1;
        System.out.println("Enter your subject 2 marks");
        float s2=sc.nextFloat();
        total=total+s2;
        System.out.println("Enter your subject 3 marks");
        float s3=sc.nextFloat();
        total=total+s3;
        System.out.println("Enter your subject 4 marks");
        float s4=sc.nextFloat();
        total=total+s4;
        System.out.println("Enter your subject 5 marks");
        float s5=sc.nextFloat();
        total=total+s5;
        float grand_total=total*100/(total_marks*5);
        System.out.println("your percentage is "+ grand_total + " percent");


    }
}
