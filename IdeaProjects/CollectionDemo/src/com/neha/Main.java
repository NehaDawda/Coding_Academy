package com.neha;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List data = new ArrayList();
        data.add(100);
        data.add(123);
        data.add(100);
        data.add("Neha");
        data.add(12.09);
        data.add("Neha");

        Iterator it = data.iterator();
        System.out.println("Displaying All elements from List");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Set data2 = new HashSet();
        data2.addAll(data);

        System.out.println("Displaying All elements from SET");
        it = data2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
