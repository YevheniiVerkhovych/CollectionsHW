package LinkedListMy;

public class Test {
    public static void main(String[] args) {
       MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.add(1);
       myLinkedList.add(2);
       myLinkedList.add(30);
       myLinkedList.add(40);
       myLinkedList.add(50);
       myLinkedList.add(60);
       myLinkedList.add(75);

        System.out.println(myLinkedList);

        System.out.println("Get element with index 0: " + myLinkedList.get(0));
        System.out.println("Get element with index 2: " + myLinkedList.get(2));

        System.out.println("Remove index element with index 0: ");
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        System.out.println("Remove index element with index 3: ");
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
    }
}
