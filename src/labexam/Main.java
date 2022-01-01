package labexam;

public class Main {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println(linkedList.toString());
        linkedList.delALL("pie");
        System.out.println(linkedList.toString());
        linkedList.delALL("donut");
        System.out.println(linkedList.toString());
//        linkedList.delALL("iceCream");
//        linkedList.toString();
//        linkedList.delALL("pair");
//        linkedList.delALL("pair");
    }
}
