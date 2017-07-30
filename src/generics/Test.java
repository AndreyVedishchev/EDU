package generics;



/**
 * Created by Андрей on 21.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.put("Hello");
        linkList.put("World");
        linkList.put("!");

        System.out.println(linkList.extract());
        System.out.println(linkList.extract());
        System.out.println(linkList.extract());
        System.out.println(linkList.extract());


    }
}
