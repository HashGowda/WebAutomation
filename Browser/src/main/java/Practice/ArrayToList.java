package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
//    public static void main(String[] args) {
//        String [] S = {"AA","BB","CC","DD"};
//        List<String> list = Arrays.asList(S);
//        System.out.println("From list : "+list);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));



    List<String> getNames(){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cat");
        list.add("dog");
        list.add("apple");
        list.add("cat");
        return list;
        }

        void getNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
            System.out.println(list);
    }
    ArrayList<Integer> ReturnNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        return list;
    }

    String name(){
        String name="hsbvns";
        return name;
    }

    public static void main(String[] args) {
        ArrayToList obj = new ArrayToList();
        System.out.println(obj.getNames());
        List<String> S = obj.getNames();
        String name = obj.name();
        ArrayList<Integer> numbers = obj.ReturnNumbers();
        System.out.println(numbers);
    }
}
