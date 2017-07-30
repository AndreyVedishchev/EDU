package generics;


import generics.linklistgen.*;



/**
 * Created by Андрей on 21.07.2017.
 */
public class Test {
    public static void main(String[] args) {

        LinkList<Integer> integerLinkList = new LinkList<>();
        LinkList<String> linkList = new LinkList<>();


        linkList.put("Hello");
        linkList.put("World");
        System.out.println(linkList.size());
        System.out.println(linkList.extract());

        integerLinkList.put(1);
        integerLinkList.put(2);
        integerLinkList.put(123);
        System.out.println(integerLinkList.size());
        System.out.println(integerLinkList.extract());
        



    }
}
