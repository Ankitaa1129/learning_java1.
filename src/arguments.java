import java.util.Arrays;
public class arguments {
    static int sum(int a, int b){
        int c=a+b;
        return c;
    }
 // ye hai function or method using varargs.......
    static int sum2(int ...arr){   // tripple dot jo v argument ya no. milege sum ko usko array bna k de dega
        int value=0;
        for(int a:arr){
            value=value+a;
        }
        return value;
    }


    public static void main(String[] args){
        System.out.println("varargs k bare me pdhte h chlo");
        //varargs use krne se hm ek function ko ek se jada arguments de sakte hai.......
// ab jse mujhe do number ko add krne ka function bnana hai to
        System.out.println("Sum of 4 and 5 is " + sum(4,5));
        //
        //ab mujhe 2 nhi 3 no. ka sum chye ya 4 no. ka sum chye to phir se function bnana prega
        // 4 argument pass kr k
        // lekin varargs use kr k hm ek hi function bnayege usse jitne maan utne no. ka sum nikal skte hai.\
        System.out.println("Sum of 4 and 5 is " + sum2(4,5,8,9,6));
        System.out.println("Sum of 4 and 5 is " + sum2(4,5,9,4,8,7,3,2,8,3,2,10));

    }
}
