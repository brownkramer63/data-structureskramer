package PrintMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }
    public static void printMiddle(MySinglyLinkedList sll){
    //create two pointers solution for this
        Node a = sll.head;
        Node b = sll.head;
        //iterate over the linked list
        while (b!=sll.tail && b.next!=sll.tail){

            a=a.next;// 1 jump
            b=b.next.next; //2 jump

        }
        if (b==sll.tail){
            System.out.println(a.id);
        }
        else {
            System.out.println(a.id+","+a.next.id);
            //for even linkedlist
        }

    }

}
