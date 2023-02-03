package Practice;

public class TestInheritance extends InheritanceEx {
    void sub(){
        int a=20;
        int b=10;
        int diff=a-b;
        System.out.println("Difference is "+diff);
    }

    public static void main(String[] args) {
        TestInheritance test = new TestInheritance();
        test.sub();
        test.add();
    }
}
