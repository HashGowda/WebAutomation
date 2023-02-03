package Practice;

import javax.swing.*;

public class InheritanceEx {
//    void add(){
//        int a=10;
//        int b=20;
//        int res=a+b;
//        System.out.println("Result is "+res);
//    }
//}


//    public void add(){
//    int a=10;
//    int b=2;
//    int sum=a+b;
//        System.out.println("Sum = "+sum);
//    }
//    public int addition(){
//        int a=12;
//        int b=2;
//        int sum = a+b;
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        InheritanceEx obj= new InheritanceEx();
//        obj.add();
//        int result = obj.addition();
//        System.out.println("Result : "+result);
//        System.out.println(obj.addition());
//    }
//}


//    int sum(int a, int b){
//    int add=a+b;
//    return add;
//    }
//
//    int sub(int c, int d){
//        int dif=c-d;
//        return dif;
//    }
//    void multiply(int a, int b){
//        int result = a*b;
//        System.out.println("Result = "+result);
//    }
//    int divide(int a, int b){
//        int div=a/b;
//        return div;
//    }
//
//    public static void main(String[] args) {
//        InheritanceEx in = new InheritanceEx();
//        int input1=in.sum(10,20);
//        int input2 = in.sub(80,20);
//        in.multiply(input1, input2);
//        int result = in.divide(input2, input1);
//        System.out.println(result);
//    }
//}


        public void add(){
                int a=10;
                int b=20;
                int res=a+b;
                System.out.println(res);
        }
        public void add(int a, int b){
                int result=a+b;
                System.out.println(result);
        }
        public int add(int a){
                int b=200;
                int output=a+b;
                return output;
        }

        public static void main(String[] args) {
                InheritanceEx obj= new InheritanceEx();
                obj.add();
                obj.add(1,2);
                obj.add(100);
                System.out.println(obj.add(200));
        }
}