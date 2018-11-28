/** PriorityQ.java   1.0.0   27-November-2018
**** PROBLEM 3
*  Purpose    : Class that inserts, finds,
                and deletes
*  Author     : Joe Gorman & Lindsey Fry
*  Description: 
*               
**/
// priorityQ.java
// demonstrates priority queue
// to run this program: C>java PriorityQApp
////////////////////////////////////////////////////////////////
import java.util.*;
class PriorityQ {

  private int maxSize;
  private Heap queHeap;

public PriorityQ(int s) {
  maxSize = s;
  queHeap = new Heap(maxSize);
}

public int size(){
  return queHeap.getSize();
}

public void insert(int item) {
  queHeap.insert(item);
}

public int remove()
{
  return queHeap.getNodeKey(queHeap.remove());
}

public long peekMin()
{
  return queHeap.findMin();
}

public boolean isEmpty()
{
  return queHeap.getSize() == 0;
}

public boolean isFull()
{
  return queHeap.getSize() == maxSize;
}

public void displayQueue(){
  int[] nQueue = new int[queHeap.getSize()];
  for(int i = 0; i < queHeap.getSize(); i++){
    nQueue[i] = queHeap.getNodeKey( queHeap.getArray()[i]);
  }
  Arrays.sort( nQueue );
  for(int i = queHeap.getSize()-1; i >= 0; i --){
    System.out.print( nQueue[i] + " " );
  }
}

public static void main( String args[] ){
  PriorityQ priorQ = new PriorityQ( 10 );
        System.out.println( "insert method" );
        priorQ.insert( 93 );
        priorQ.insert( 32 );
        priorQ.insert( 27 );
        priorQ.insert( 78 );
        priorQ.insert( 79 );
        priorQ.insert( 14 );
        System.out.print("Display Queue: ");
        priorQ.displayQueue();

        System.out.println( "\nremove method" );
        System.out.println( "Remove: " + priorQ.remove() );
        System.out.println( "Remove: " + priorQ.remove() );
        System.out.println( "Remove: " + priorQ.remove() );
        System.out.println( "Remove: " + priorQ.remove() );
        System.out.println( "Remove: " + priorQ.remove() );
        System.out.print("Display Queue: ");
        priorQ.displayQueue();

       System.out.println( "\npeekMin method" );
       priorQ.insert( 23 );
       priorQ.insert( 43 );
       priorQ.insert( 97 );
       priorQ.insert( 03 );
       priorQ.insert( 38 );
       priorQ.insert( 29 );
       System.out.print("Display Queue: ");
       priorQ.displayQueue();
       System.out.print( "\nFind Min: " + priorQ.peekMin() + " " );
       System.out.println( "Remove: " + priorQ.remove() + " " );
       System.out.print( "Find Min: " + priorQ.peekMin() + " " );
       System.out.println( "Remove: " + priorQ.remove() + " " );
       System.out.print( "Find Min: " + priorQ.peekMin() + " " );
       System.out.println( "Remove: " + priorQ.remove() + " " );
       System.out.print( "Find Min: " + priorQ.peekMin() + " " );
       System.out.println( "Remove: " + priorQ.remove() + " " );
       System.out.print( "Find Min: " + priorQ.peekMin() + " " );
       System.out.println( "Remove: " + priorQ.remove() + " " );
       System.out.print( "Find Min: " + priorQ.peekMin() + " " );
       System.out.println( "Remove: " + priorQ.remove() + " " );
       System.out.print("Display Queue: ");
       priorQ.displayQueue();

       System.out.println( "\nisEmpty method" );
       priorQ.insert( 13 );
       priorQ.insert( 83 );
       priorQ.insert( 45 );
       System.out.print("Display Queue: ");
       priorQ.displayQueue();
       System.out.println( "\nEmpty? " + priorQ.isEmpty()  );
       priorQ.remove();
       System.out.println( "Empty? " + priorQ.isEmpty()  );
       priorQ.remove();
       System.out.println( "Empty? " + priorQ.isEmpty()  );
       priorQ.remove();
       System.out.println( "Empty? " + priorQ.isEmpty() );
       priorQ.remove();
       System.out.println( "Empty? " + priorQ.isEmpty() );

       System.out.println( "\nisFull method" );
       priorQ.insert( 18 );
       priorQ.insert( 98 );
       System.out.print("Display Queue: ");
       priorQ.displayQueue();
       System.out.println( "\nFull? " + priorQ.isFull() );
       priorQ.insert( 46 );
       System.out.println( "Full? " + priorQ.isFull() );
       priorQ.insert( 15 );
       System.out.println( "Full? " + priorQ.isFull() );
       priorQ.insert( 29 );
       System.out.println( "Full? " + priorQ.isFull() );
       priorQ.insert( 86 );
       System.out.println( "Full? " + priorQ.isFull() );
       priorQ.insert( 42 );
       System.out.println( "Full? " + priorQ.isFull() );
       priorQ.insert( 76 );
       System.out.println( "Full? " + priorQ.isFull() );
       priorQ.insert( 29 );
       System.out.println( "Full? " + priorQ.isFull() );
       priorQ.insert( 43 );
       System.out.println( "Full? " + priorQ.isFull() );
       System.out.print("Display Queue: ");
       priorQ.displayQueue();

}
}
