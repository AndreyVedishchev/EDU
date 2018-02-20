package tasks.mergeTwoSortedLists;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            //System.out.println("первое усл.");
            return null;
        }

        if (l1 == null && l2 != null) {
            //System.out.println("второе усл.");
            return l2;
        }

        if (l1 != null && l2 == null) {
            //System.out.println("третье усл.");
            return l1;
        }

        ListNode list = null;
//
//        while (l1 != null && l2 != null) {
//
//            if (l1.val < l2.val) {
//                list = new ListNode(l1.val);
//                list.next = new ListNode(l2.val);
//
//            } else {
//                list = new ListNode(l2.val);
//                list.next = new ListNode(l1.val);
//            }
//
//            System.out.print(l1 + ", ");
//            System.out.print(l2 + ", ");
//
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//
        while (l1.next != null || l2.next != null) {

            ListNode newNode = null;

            if (l1.val <= l2.val) {
                newNode = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                newNode = new ListNode(l2.val);
                l2 = l2.next;
            }

        }



        return null;
    }

    public static void main(String[] args) {

       ListNode l1 = new ListNode(1);
       ListNode l2 = new ListNode(2);
       ListNode l3 = new ListNode(4);

       l1.next = l2;
       l2.next = l3;
       l3.next = null;


        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(3);
        ListNode ll3 = new ListNode(4);

        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = null;

       Solution solution = new Solution();
        solution.mergeTwoLists(l1, ll1);
        //System.out.println(solution.mergeTwoLists(l1, ll1) + " main method");
    }
}