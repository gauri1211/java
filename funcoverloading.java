public class funcoverloading {
    int add(int a,int b,int c){
        return a+b+c;
    }
    int add(int a,int b){
        return a+b;
    }
public static void main(String[] args){
    funcoverloading f = new funcoverloading();
    System.out.println("sum is"+f.add(3,4,5));
    System.out.println("sum is"+f.add(3,4));
}
}
