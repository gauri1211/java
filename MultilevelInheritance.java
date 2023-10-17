import java.util.*;
public class MultilevelInheritance {
class Employee {
 String name;
 int sal;
 void Detail() {
 Scanner sc= new Scanner(System.in);
System.out.println("Enter name:"); 
 name= sc.next(); 
 
 }
 
}
class income extends Employee { 
 int sal;
 void salary() {
 Scanner sc= new Scanner(System.in);
System.out.println("Enter salary:"); 
 sal= sc.nextInt();

 }
 class Display extends income{
    void print(){
         
        System.out.println("the salary is:"+sal); 
     }
 }
 
}

 public static void main(String args[]) {
 Display d = new Display();
 d.Detail(); 
 d.salary(); 
 d.print();
 
 }
}

