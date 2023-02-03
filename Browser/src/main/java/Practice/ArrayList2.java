package Practice;

import java.util.*;

public class ArrayList2 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("dog");
        list.add("ball");
        list.add("apple");
        list.add("cat");

        //Sort the Array list and size

//        System.out.println("Before sort "+list);
//        Collections.sort(list);
//        System.out.println("After sort "+list);
//        for (String s:list){
//            System.out.println(s);

        //set and get

//        System.out.println("Before : "+list);
//        System.out.println(list.get(0));
//        list.set(1,"Buffalo");
//        list.add(2,"fish");
//        System.out.println("After : "+list);
//        for (String s:list){
//            System.out.println(s);


        //Reversing the array

//        System.out.println("Traversing list by iterator interface : ");
//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//        System.out.println("Traversing list by for each loop : ");
//        for (String s:list){
//            System.out.println(s);
//        }
//
//        System.out.println("Traversing list through list iterator : ");
//        ListIterator<String> list1 = list.listIterator(list.size());
//        while (list1.hasPrevious()){
//            String str = list1.previous();
//            System.out.println(str);
//        }
//
//        System.out.println("Traversing list through for loop : ");
//        for (int i=0; i<list.size();i++){
//            System.out.println(list.get(i));

        //one list can be added to another list

        System.out.println("List : "+list);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("fish");
        list1.add("bat");
        System.out.println("List 1 : "+list1);
        list.addAll(list1);
        list1.addAll(list);
        System.out.println("Adding list1 elements to list : "+list);
        System.out.println("Adding list elements to list 1 : "+list1);
        }
        }


