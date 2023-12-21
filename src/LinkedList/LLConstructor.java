package LinkedList;

import org.w3c.dom.Node;

public class LLConstructor {
     private Node head;
     private Node tail;
     private int lenght;

     class Node {
          int value;
          Node next ;

          Node(int value){
               this.value = value;
          }
     }

     // as the node class is inside the LLcoConstructor class, this is called a nested
     public LLConstructor (int value){
          Node newNode = new Node(value);
          head = newNode;
          tail = newNode;
          lenght =1;

     }
}
