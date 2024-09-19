 class parent {
    public void display(){
        System.out.println("This is a parent class.");
    }
}
 class child extends parent
{
    public void show(){
        System.out.println("This is a child class");
    }
} 
public class prac17{
public static void main(String[]args){
  child cl=new child();
  cl.display();
  cl.show();

}
}