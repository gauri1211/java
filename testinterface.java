interface drawable{
void draw();
}
class circle implements drawable{
public void draw(){
    System.out.println("drawing");
}
}
public class testinterface{
public static void main(String[] args){
        circle i = new circle();
        i.draw();
    }
}
