
    class Employee{
        String name;
        int id;
        public void PrintDetails(){
            System.out.println("my id is "+ id);
            System.out.println("my name is "+ name);
        }
    }
    public class oops {
    public static void main(String[] args){
        System.out.println("this is our own class...");
   Employee ankita= new Employee();
   ankita.id=56;
   ankita.name="ankitaanku";
      //  System.out.println(ankita.id);
       // System.out.println(ankita.name);    iski jgh hm simple printdetails ko call kr lenge
        ankita.PrintDetails();

        //one more employee
        Employee anubhav= new Employee();
        anubhav.id=61;
        anubhav.name="anubhavraj";

        anubhav.PrintDetails();

    }
}
