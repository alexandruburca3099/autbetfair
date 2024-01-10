package courses.oop.collections;

import courses.oop.Gender;
import courses.oop.Student;
import courses.oop.Teacher;

import java.util.*;

public class CollectionExample {
    CollectionExample collectionExample = new CollectionExample();
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i <= numbers.length - 1 ; i++){
            System.out.println(numbers[i] + " ");
        }

        Student[] people = {new Student("Bogdana Ionescu", "222222222222224", Gender.FEMININ, "1234", "IT"),new Student("Bob Marley", "111225569916543", Gender.MASCULIN, "12345", "Math")};

        System.out.println();
        System.out.println("Equivalent way to display list values:");
        for (Student student : people)
            System.out.println(student);
        CollectionExample.workWithArrays();
        CollectionExample.workWithSets();
        CollectionExample.workWithHashMap();
    }


    public static void workWithArrays(){
        System.out.println("Work with Lists");
        List list1 = new ArrayList<>();
        list1.add(1);
        list1.add("Ion");
        list1.add(new Student("Bogdana Ionescu", "222222222222224", Gender.FEMININ, "1234", "IT"));

        displayList(list1);
        List <String> names = new ArrayList<>();
        names.add("Ion");
        names.add("Vasile");
        names.add("Maria");
        names.remove("Ion");
        displayList(names);

        System.out.println("Element on first poz " + names.get(0));
        System.out.println("Name Ion is on the list" + names.contains("Ion"));
        System.out.println("Maria position on list:" + (names.indexOf("Maria")+1));

        names.set(1, "Marioara");
        displayList(names);
        System.out.println("Add new elements with index");
        names.add(1,"Ion");
        names.add("Ion");
        displayList(names);
    }

    public static void workWithSets(){
        System.out.println("Work with sets");
        HashSet<String> setList = new HashSet<>();
        setList.add("Ion");
        setList.add("Ion");
        setList.add("Maria");
        setList.add("Vasile");
        setList.add("Cristiana");

        HashSet<String>copySet =  (HashSet<String>) setList.clone();
        System.out.println("Copy set is equal with setList: " + copySet.equals(setList));

        for(String el: setList)
            System.out.println(el);

    }
    public static void workWithHashMap(){
        System.out.println("Work with hashmap");
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,4);
        map.put(2,6);
        map.put(3,4);
        map.put(7,4);
        map.put(3,5);
//        System.out.println(map.get(3));
        displayHashMap(map);
        map.remove(7);
        displayHashMap(map);

        Map<Integer, List<String>> apartments = new HashMap<>();
        List<String> numeAp1 = new ArrayList();
        numeAp1.add("Ion");
        numeAp1.add("Maria");
            //add to map
        apartments.put(1, numeAp1);
    }
    public static void displayList(List list){
        for(Object ob: list)
            System.out.println(ob);
    }

    public static void displayHashMap(Map map){
        for (Object key : map.keySet())
            System.out.println(key + "->" + map.get(key));
    }

    public void displayHashMapWithList(Map<Integer,List<String>>integerListMap){
        for (Object key : integerListMap.keySet()) {
            System.out.println(key + "->");
            displayList(integerListMap.get(key));
        }
    }


}