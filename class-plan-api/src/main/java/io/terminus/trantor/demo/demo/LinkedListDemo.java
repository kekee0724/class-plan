package io.terminus.trantor.demo.demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author kekee0724
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        demo();
    }
    static void demo() {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        System.out.println(sites);
        sites.addLast("Wiki");
        System.out.println(sites);
        sites.removeFirst();
        System.out.println(sites);
        sites.removeLast();
        System.out.println(sites);
        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());
        sites.remove(3);
        System.out.println(sites);
        System.out.println(sites.size());
        Collections.sort(sites);
        for (String site : sites) {
            System.out.println(site);
        }
    }
}
