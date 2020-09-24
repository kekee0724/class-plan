package io.terminus.trantor.demo.demo;


import java.util.ArrayList;
import java.util.Collections;

/**
 * @author kekee0724
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        demo();
    }
    static void demo() {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));
        sites.set(2, "Wiki");
        System.out.println(sites);
        sites.remove(3);
        System.out.println(sites);
        System.out.println(sites.size());
        Collections.sort(sites);
        for (String site : sites) {
            System.out.println(site);
        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(75);
        myNumbers.add(12);
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
