package Practice;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] a =new int[3][3];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;
        a[2][0]=70;
        a[2][1]=80;
        a[2][2]=90;

        System.out.println("Size of the array is "+a.length);
        for(int i=0; i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("********************");
        int [][]b={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.println(b[i][j]+" ");
            }
        }
    }
}
