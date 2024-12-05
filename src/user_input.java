import java.util.Scanner;
public class user_input {
    public static void main(String[] args){
        //sum of three number
      //  int num1=45;
      //  int num2=87;
      //  int num3=23;

      //  int sum=num1+num2+num3;
        //System.out.println(sum*2);


        Scanner sc=new Scanner(System.in);
       // System.out.println("input your 1st numbers");
       // int number1=sc.nextInt();
      //  System.out.println("input your 2nd numbers");
        //int number2=sc.nextInt();
     //   System.out.println("input your 3rd numbers");
        //int number3=sc.nextInt();

       // int sums=number1+number2+number3;
      //  System.out.println("Here is your sum:");
       // System.out.println(sums);

       // char ch='a';
       // System.out.println(ch);
        //System.out.println(ch++);
      //  System.out.println(ch);
      //  System.out.println(++ch);

//float a=8/4*8/2;
//System.out.println(a);
        int num=9;
        System.out.println("Enter your number");
        int newnum=sc.nextInt();
        if(num==newnum){
            System.out.println("your number is same as my number");
        }
        else if(num<newnum){
            System.out.println("your number is greater than my number");
        }
        else{
            System.out.println("Your number is smaller than my number");
        }

     int a=45;
        float b=8.9706f;
        System.out.printf("the value of a is %d and value of b is %f",a,b);
        // we use %d for int , %f for float , %c for char , %s for string
    }
}
