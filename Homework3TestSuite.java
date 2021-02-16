package sol;

import tester.Tester;

public class Homework3TestSuite {

    /**
     * main method
     */
    public void testFunctions (Tester t){
        IList linkedList = new DoublyLinkedList<Integer>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);

        t.checkExpect(linkedList.getLast(),5);
        linkedList.removeLast();                            //tests for getLast() and removeLast()
        t.checkExpect(linkedList.getLast(), 4);



        t.checkExpect(linkedList.getFirst(),1);
        linkedList.removeFirst();                           //tests for getFirst() and removeFirst()
        t.checkExpect(linkedList.getFirst(),2);



        IList linkedList2 = new DoublyLinkedList<Integer>();
        linkedList2.addLast(1);
        linkedList2.addLast(2);
        linkedList2.addLast(3);                //tests for addLast()
        linkedList2.addLast(4);
        linkedList2.addLast(5);


        t.checkExpect(linkedList2.get(0),1);
        t.checkExpect(linkedList2.get(1),2);
        linkedList2.reverse();                          //tests for get() and reverse()
        t.checkExpect(linkedList2.get(0),5);
        t.checkExpect(linkedList2.get(1),4);

        linkedList2.addFirst(3);                        //test for addFirst()
        t.checkExpect(linkedList2.getFirst(),3);

        t.checkExpect(linkedList2.isEmpty(), false);        //test for isEmpty()
    }


    public static void main(String[] args) {
        Tester.run(new Homework3TestSuite());

    }

}