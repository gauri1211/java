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
 void display(){
    System.out.println("the name is:"+name); 
    System.out.println("the salary is:"+sal); 
 }
 
}
public class SingleInheritance {
 public static void main(String args[]) {
 income s = new income();
 s.Detail(); 
 s.salary(); 
 s.display();
 
 }
}

