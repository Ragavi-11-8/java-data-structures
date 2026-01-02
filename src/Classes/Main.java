package Classes;

public class Main{
    public static void main(String[] args) {
        LinkedList myLinkedList=new LinkedList(2);

        myLinkedList.append(3);
        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

       myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

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

