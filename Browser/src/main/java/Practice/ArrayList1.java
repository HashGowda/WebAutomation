package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        list.add("Banana");
        System.out.println("Size is "+list.size());
        System.out.println(list);
        System.out.println("get value "+list.get(3));
        System.out.println("By using for each loop\n");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("By using iterator");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
