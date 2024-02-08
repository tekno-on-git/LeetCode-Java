package main.struct;
/*
 * Struct Code from: 
 * https://github.com/Blankj/awesome-java-leetcode/blob/master/src/com/blankj/structure/ListNode.java 
 */

public class ListNode {
    public int val = -1;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static void print(ListNode listNode) {
        System.out.println(getString(listNode));
    }

    public static ListNode createTestData(String data) {
        if (data.equals("[]"))
            return null;
        data = data.substring(1, data.length() - 1);
        String[] split = data.split(",");
        int len = split.length;
        ListNode[] listNode = new ListNode[len + 1];
        listNode[0] = new ListNode(Integer.valueOf(split[0]));
        for (int i = 1; i < len; i++) {
            listNode[i] = new ListNode(Integer.valueOf(split[i]));
            listNode[i - 1].next = listNode[i];
        }
        return listNode[0];
    }

    public static String getString(ListNode listNode) {
        if (listNode == null)
            return "[]";

        StringBuilder str = new StringBuilder("[" + String.valueOf(listNode.val));
        ListNode p = listNode.next;
        while (p != null) {
            str.append(",").append(String.valueOf(p.val));
            p = p.next;
        }
        return str.append("]").toString();
    }

}
