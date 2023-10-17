import java.util.*;
public class Array{
public static void main(String args[])
{
int n,m,x,y,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of elements  for array a");
n = sc.nextInt();
System.out.println("Enter the  no of elements for array b");
m = sc.nextInt();

int []a = new int[5];
int []b = new int[5];
int []c = new int[]{0,0,0,0,0};
System.out.println(" Enter the Elements of array a ");
for(i=0;i<=n-1;i++){
a[i]=sc.nextInt();
}
System.out.println(" The Elements of array a are :");
for(i=0;i<=n-1;i++){
System.out.println(a[i]);
}
System.out.println(" Enter the Elements of array b ");
for(i=0;i<=n-1;i++){
b[i]=sc.nextInt();
}
System.out.println(" The Elements of array a are :");
for(i=0;i<=n-1;i++){
System.out.println(b[i]);
}
for(i=0;i<=n-1;i++){
   
}

System.out.println("Enter the operation");
int opt;
opt =sc.nextInt();

switch(opt){
case 1: 
	for(i=0;i<=n-1;i++) {
		 x=a[i];
		    y=b[i];
		    c[i]=x+y;
    System.out.println(c[i]);
	}
break;
case 2: for(i=0;i<=n-1;i++) {
	 x=a[i];
	    y=b[i];
	    c[i]=x-y;
    System.out.println(c[i]);
}
break;
case 3:for(i=0;i<=n-1;i++) {
	 x=a[i];
	    y=b[i];
	    c[i]=x*y;
    System.out.println(c[i]);
}
break;
case 4: for(i=0;i<=n-1;i++) {
	 x=a[i];
	    y=b[i];
	    c[i]=x/y;
    System.out.println(c[i]);
    
}
break; 

default:
System.out.println("You have entered wrong operation");
}
}
}
