package Practice;

class add{
    void addition(int a, int b){
        int res=a+b;
        System.out.println("Addition  = "+res);
    }
}

class sub extends add {
    void subtraction(int a, int b) {
        int res = a - b;
        System.out.println("Subtraction = " + res);
    }
}
    public class Simple{
        public static void main(String[] args) {
            sub obj=new sub();
            obj.subtraction(90,40);
            obj.addition(80,20);
        }
    }


