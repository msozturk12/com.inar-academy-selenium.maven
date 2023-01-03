package Exercises_14_22;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E01_Stream {

    @Test
    public void regular() {
        List<String> names = new ArrayList<String>();
        names.add("Ahmet");
        names.add("Daniel");
        names.add("Arthur");
        names.add("Adam");
        names.add("Rahul");

        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i);

            if (actual.startsWith("A")) {
                count++;
            }

        }
        System.out.println("the number of words starts with A --> " + count);

    }

    @Test
    public void streamFilter() {
        List<String> names = new ArrayList<String>();
        names.add("Ahmet");
        names.add("Dan");
        names.add("Art");
        names.add("Adam");
        names.add("Rahul");


        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        long d = Stream.of("Ahmet", "Haluk", "Berk", "Samet", "Ertuğrul", "Adam").filter(s -> {
            s.startsWith("A");
            return true;
        }).count();

        System.out.println(d);

        //print all the names of ArrayList
        names.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------------------------");
        //print all the greater than 4 letter names
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------------------------");
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));


    }

    @Test
    public void streamMap() {
        //print names which have last letter "t" with UpperCase
        Stream.of("Ahmet", "Haluk", "Berk", "Samet", "Ertuğrul", "Adam", "Mesut").filter(s -> s.endsWith("t")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------------------------------");

        //print names which have first letter as 'a' with uppercase and sorted
        List<String> names1 = Arrays.asList("Ahmet", "Haluk", "Berk", "Samet", "Ertuğrul", "Adam", "Mesut", "Azra", "Abraham");
        names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println("---------------------------------------------------------------------------------------------");

        //Stream.of("Ahmet","Haluk","Berk","Samet","Ertuğrul","Adam","Mesut","Azra","Abraham").filter(a -> a.startsWith("A")).sorted()
        //      .map(s->s.toUpperCase()).forEach(a -> System.out.println(a));

        List<String> names = new ArrayList<String>();
        names.add("Ahmet");
        names.add("Dan");
        names.add("Art");
        names.add("Adam");
        names.add("Rahul");
        names.add("Zeynep");

        //Merging two different list
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        //newStream.sorted().forEach(s -> System.out.print(s + " "));
        boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Zeynep"));
        System.out.println(flag);
        Assert.assertTrue(flag);

    }

    @Test
    public void streamCollect() {
        List<String> ls = Stream.of("Ahmet", "Haluk", "Berk", "Samet", "Ertuğrul", "Adam", "Mesut").filter(s -> s.endsWith("t")).map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));

        List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 9, 7, 1, 9, 9, 9);
        //print unique number from this array
        //sort the array -3rd index 1,2,3

        values.stream().distinct().sorted().forEach(s -> System.out.print(s + " "));
        //
        System.out.println();
        List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("3rd value is --> " + li.get(2));


    }
}