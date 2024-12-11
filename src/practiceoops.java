class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public  String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}



public class practiceoops {
    public static void main(String[] args){
  Employee1 Ankita=new Employee1();
  Ankita.setName("SoftwareEngineer");
  System.out.println(Ankita.getName());
  Ankita.salary=5000000;
        System.out.println(Ankita.getSalary());

        Square sqq=new Square();
        sqq.side=8;
        System.out.println(sqq.area());
        System.out.println(sqq.perimeter());
    }
}
