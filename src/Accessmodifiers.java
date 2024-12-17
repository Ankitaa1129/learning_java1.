
    class myemployee{
        private int id;
        private String name;

        // constructor bnane k lie hm ek method bnate h jiska name same hota hai classname ke jaisa..
        //like below:-
        public myemployee(String myName , int myId){

            id=myId;
            name=myName;

        }

        public myemployee(){  // jb hm kuch pass nhi krege argument me tb ye method run hoga
            id=678;
            name="sonamona";

        }

        public String getName() {
            return name;
        }
        public void setName(String n){
            this.name=n;
        }

        public int getId() {
            return id;
        }
        public void setId(int a){
            this.id=a;
        }
    }

    public class Accessmodifiers {

        public static void main(String[] args){
        System.out.println("kuch nhi public private protected yhi h access modifiers");
        System.out.println("getid setid getname setname yhi krna h to ho jyega easy h c++ jsa..");

        System.out.println("constructors in java pdhte h ab.........");

       // myemployee employee=new myemployee("ankitathisisconstructor" , 2314);
      //  myemployee employee1=new myemployee("ankubskro" , 23114);
            myemployee employee=new myemployee();

      //  employee.setName("ankitaurgenius");
      //  employee.setId(30);

        System.out.println(employee.getName());
            System.out.println(employee.getId());

         //   System.out.println(employee1.getName());
          //  System.out.println(employee1.getId());

            System.out.println("constructor overloading same hai as method overloading not a big deal");

    }
}
