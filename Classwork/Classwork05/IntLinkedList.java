public class IntLinkedList {

   private Node head;
   private int  size;

  // the constructor
   IntLinkedList() {
      head = null;
      size = 0;
   }

   public int getSize() {
      return size;
   }

   public int insertAt( int index , int number ) {
     if(index > size || index < 0){
       throw new IllegalArgumentException("");
     } else {
      Iterator it = getIteratorAt( index );
      Node newNode = new Node( number );
      newNode.next = it.currentNode.next;
      it.currentNode.next = newNode;
    }
    size++;
    return index;
   }

   public int removeAt( int index ) {
       if ( index > size -1 || index < 0 ) {
           throw new IllegalArgumentException("Invalid index!");
       }
       Iterator it2 = getIteratorAt(index);
       Node node = it2.currentNode.next;
       Iterator myIt = getIteratorAt(index-1);
       myIt.currentNode.next = node;
       size--;
       return index;
       }

   public void prepend( int dataToAdd ) {
      Node currentHead = head;
      head = new Node( dataToAdd );
      head.next = currentHead;
      size++;
   }

   private class Node {

      int data;            // remember this is an IntLinkedList
      Node next;           // here's the self-referential part

      // constructor
      Node( int d ) {
         data = d;
         next = null;
      }
   }

   public Iterator getIteratorAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }


   public class Iterator {
      private Node currentNode;
      //private Node newNode;

      Iterator() {
         currentNode = head;
      }

      public void next() {
         if( currentNode == null ) {
            return;
         } else {
            currentNode = currentNode.next;
         }
      }

      public boolean hasNext() {
         return ((currentNode != null) && (currentNode.next != null));
      }

      public int getCurrentInt() {
         return currentNode.data;
      }

   }
}
