public class from_lecture_21_while_loop {
    public static void main(String[] args){
       // int i=1;
        //while(i<=10){
          //  int p=2*i;
          //  System.out.println(p);
        //    i++;
       // }
        //System.out.println("now natural number from 100 to 200");
      //  int k=100;
       // while(k<=200){
           // System.out.println(k);
       //     k++;
       // }
        System.out.println("now lets see do while loop");

        int d=1;
        do{
            System.out.println(d);
            d++;
        }while(d<5);
        System.out.println("now for loop");

        for(int i=0;i<=50;i++)
        {
            if(i%2!=0) {
                System.out.println(i);
            }

        }
        int n=10;
        for(int i=0;i<n;i++)
        {
            System.out.println(2*i+1);
        }

    }
}
