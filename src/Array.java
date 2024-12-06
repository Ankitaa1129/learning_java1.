import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int [] marks= new int [5];// ye Thik hai pr mai

        // aise v array bna skti hu :-
     //   int [] marks;
      //  marks= new int [5];

        //dono sahi hai................
        /* aur mai third way v hai ek usse v likh skti hu :-

        wo ye hai

        int [] marks={1,8,9,3,5};
         */


       String  [] name = new String [5];
        marks[0]=100;
        marks[1]=90;
        marks[2]=95;
        marks[3]=80;
        marks[4]=70;

       name[0]="Ankita";
       name[1]="Anku";
       name[2]="Anubhav";
       name[3]="Anubhuti";
       name[4]="Ananya";


        System.out.println(name[4] +" Your marks in total is "+ marks[4]);
        System.out.println(name.length);


        // float me bnana hai to

        float [] mark= new float[2];
        mark[0]=89;
        mark[1]=67.3f;

        System.out.println(mark[0]);
        System.out.println(mark[1]);

        // displaying tha array using for loop

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }

        //  now for each loop ---- sabse easy sbse simple

        for(int element : marks){
            System.out.println(element);
        }


        // multidimensional arrays

        System.out.println("2d array");

        int [][] flats=new int[2][3]; // 2 rpow 3 column or simply 2 floor 3 ghr mtlb 1 floor pr 3 ghr doosre floor pr 3 ghr

        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;

        flats[1][0]=103;
        flats[1][1]=104;
        flats[1][2]=105;

       // System.out.println(flats[1][0]);
        for(int i=0;i<flats.length;i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
