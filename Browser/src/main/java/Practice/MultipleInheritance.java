package Practice;

class A{
    void msg(){
        System.out.println("Message");
    }
}
interface B{
//    void message(){
//        System.out.println("Welcome");
    }
    class C extends A implements B{

}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
    }
}
