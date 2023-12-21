package LinkedList;
//The first part from line 2 to 24 are just contructor, remaining is print List
public class LinkedList {
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
     public LinkedList(int value){
          Node newNode = new Node(value);
          head = newNode;
          tail = newNode;
          lenght =1;

     }


     public void  printList(){
          Node temp =head;
          while(temp != null ){
               System.out.println(temp.value);
               temp = temp.next;
          }
     }
      public void gethead(){
          System.out.println("Head" + head.value);
      }
      public void gettail(){
          System.out.println("tail" + tail.value);
      }
      public  void getlenght(){
          System.out.println("lenght"+ lenght);
      }

      
      //This is the appende c, first we creat  the constructer and check if the node is empty , and if there is item in the node it the tail node is set to new node
    public void append (int value){
    Node newNode = new Node(value);

    if(lenght ==0 ){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }
    lenght++;
}

}
