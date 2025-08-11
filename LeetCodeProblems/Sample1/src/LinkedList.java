public class LinkedList {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next= new Node(1);
//        node1.next.next = new Node(8);
//        node1.next.next.next = node1.next;
        System.out.println(findInfinityLoop(node1));
    }

    private static Boolean findInfinityLoop(Node node){

           if(node == null){
               return false;
           }

           Node slow = node; // 1
           Node fast = node.next; //2
           while(slow != null && fast != null){
               if(fast.next == null){
                   return false;
               }

               slow = slow.next; //2
               fast = fast.next.next; // null

               if(slow == fast){
                   return true;
               }

           }

           return fast != null;


    }
}
