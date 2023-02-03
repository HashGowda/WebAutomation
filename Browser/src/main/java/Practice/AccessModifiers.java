package Practice;

class depart{
    void display(){
        AccessModifiers obj = new AccessModifiers();
        obj.sub();
        obj.show();
        obj.display();
    }
}

public class AccessModifiers {
    private String name = "Kiran";

    public static void main(String[] args) {
        AccessModifiers am= new AccessModifiers();
        am.add();
        am.sub();
        am.display();
        am.show();
    }

    private void add(){
        System.out.println("Name is from private "+name);
    }

    void sub(){
        System.out.println("Name is from default "+name);
    }

    protected void display(){
        System.out.println("Name is from protected "+name);
    }

    public void show(){
        System.out.println("Name is from public "+name);
    }
}
