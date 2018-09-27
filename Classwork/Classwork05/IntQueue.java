/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  File name     :  IntQueue.java
*  @author       :  Lindsey Fry
*  Date written  :  2018-09-27
*
*  Notes         :  None right now.  I'll add some as they occur.
*  Warnings      :  None
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class IntQueue {

      IntLinkedList myQueue;

      IntQueue() {
         myQueue = new IntLinkedList();         // constructor
      }

      public void enQueue( int itemToEnQueue ) {
         myQueue.prepend( itemToEnQueue );
      }

      public int peek() {
         return myQueue.getIteratorAt( myQueue.getSize()-1 ).getCurrentInt();     // we use the iterator
      }

      public int deQueue() {
         return myQueue.removeAt( myQueue.getSize()-1 );
      }
      public int getSize(){
        return myQueue.getSize();
      }
      public String toString() {
          String newString = "";
          int index  = myQueue.getSize()-1;
          while(index >= 0){
            newString += myQueue.getIteratorAt(index).getCurrentInt() + " ";
            index--;
          }
          return newString;
      }

      public static void main( String[] args ) {
         IntQueue testQueue = new IntQueue();
         testQueue.enQueue( 19 );
         testQueue.enQueue( 23 );
         testQueue.enQueue( 29 );
         testQueue.enQueue( 31 );
         testQueue.enQueue( 37 );
         testQueue.enQueue( 41 );
         testQueue.enQueue( 43 );
         testQueue.enQueue( 47 );
         testQueue.enQueue( 51 );
         testQueue.enQueue( 57 );
         //Test Peak and Pop
         System.out.println( "The front of the Queue: " + testQueue.peek() );      // 57
         System.out.println( "Removing front thing: " + testQueue.deQueue() );         // 57 removed
         System.out.println( "The front of the Queue: " + testQueue.peek() );      // 51
         System.out.println( "Removing front thing: " + testQueue.deQueue() );         // 51 removed
         System.out.println( "Current Stack: " + testQueue.toString());
         System.out.println( "The front of the Queue: " + testQueue.peek() );      // 47
         System.out.println( "Removing front thing: " + testQueue.deQueue() );         // 47 removed
         System.out.println( "The front of the Queue: " + testQueue.peek() );      // 43
         testQueue.enQueue( testQueue.deQueue() + testQueue.deQueue() );
         System.out.println( "The front of the Queue: " + testQueue.peek() );      // what'll it be?
         System.out.println( "Current Stack: " + testQueue.toString());
            
         testQueue.deQueue();
         testQueue.deQueue();
         testQueue.deQueue();
         testQueue.enQueue(400);
         testQueue.enQueue(652);
         testQueue.enQueue(7921);
         testQueue.deQueue();
         System.out.println("Front of the Queue " + testQueue.toString());
      }

   }
