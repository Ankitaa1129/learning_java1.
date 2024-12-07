public class methods {
        static  int logic(int x,int y){
            int z;
          z=x+y;                     // ye hai method
            return z;
        }

        static void telljoke()
        {
            System.out.println("i m mad");  // void use ki hu bcoz ye method kuch return nhi krega
        }                                    // bs i m mad print krega

    static  int area(int a){
        int b;
        b=a*a;
        return b;
    }

    static  int area(int a,int b){            // this is method overloading
        int c;
        c=2*(a*b);
        return c;
    }



    public static void main(String[] args){
            int c=logic(6,7);
            int k=logic(4,1);

System.out.println(c);
        System.out.println(k);

        telljoke();

        // method overloading.................
System.out.println("two or more methods have same name but different parameters");

        System.out.println(area(8));
        System.out.println(area(3,6));

    }
}
