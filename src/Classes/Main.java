package Classes;

public class Main{
    public static void main(String[] args) {
        LinkedList myLinkedList=new LinkedList(2);

        // (2) Items - Returns 2 NodemyLink


        myLinkedList.append(7);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());



//        linkedlist.getHead();
//        linkedlist.getTail();
//        linkedlist.getLength();
//        System.out.println("\nLinked List:");
//        linkedlist.printList();
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Cookie cookieOne= new Cookie("green");
//        Cookie cookieTwo= new Cookie("blue");
//
//        cookieOne.setColor("yellow");
//        System.out.println(cookieOne.getColor());
//        System.out.println(cookieTwo.getColor());
//    }
//}

