public class constructoroverloading {
    int id;
    String name;
    constructoroverloading(){
        System.out.println("default constructor");
    }
    constructoroverloading(int i,String n){
        id=i;
        name=n;
        System.out.println("the id is"+id);
        System.out.println("the name is"+name);
        
    }
    public static void main(String args[]){
        constructoroverloading c = new constructoroverloading();
        constructoroverloading b = new constructoroverloading(5,"ram");
    }
}
