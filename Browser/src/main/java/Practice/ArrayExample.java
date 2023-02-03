package Practice;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int[] b = new int[4];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        b[3] = 40;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("********************");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println("********************");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        System.out.println("********************");
        String[] S = {"A", "B", "C", "D", "E"};
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i] + " ");
        }

        System.out.println("********************");
        char[] c = {'a', 'b', 'c', 'd', 'e'};
        int i=0;
        while (i<c.length){
            System.out.println(c[i]);
            i++;
        }

        System.out.println("******************");
        String[] S1={"Java","Selenium","Manual","Automation"};
        for (String S2:S1){
            System.out.println(S2);
        }

        System.out.println("*****************");
        for (int k=0;k<S1.length;k++){
            System.out.println(S1[k]);
        }
    }
}
