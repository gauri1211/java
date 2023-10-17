import java.util.*;
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
void output(){
    System.out.println("the salary is:"+sal); 
    
 }
}
class Display extends Employee{
 void print(){
    System.out.println("the name is:"+name); 
    
 }
 
}
public class HierarchicalInheritance {
 public static void main(String args[]) {
 Display s = new Display();
 income i= new income();
 s.Detail(); 
 i.salary(); 
 i.output();
 s.print();
 }
}