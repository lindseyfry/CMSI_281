/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  File name     :  IntQueue.java
*  @author       :  Lindsey Fry
*  Date written  :  2018-10-13
*
*  Notes         :  None right now.  I'll add some as they occur.
*  Warnings      :  None
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class Queue{
  private int maxSize;
  private int front;
  private int rear;
  private int nItems;
  private long[] qArray;

  //constructor
  public Queue( int size ){
    maxSize = size;
    front = 0;
    rear = -1;
    nItems = 0;
    qArray = new long[maxSize];
  }

  //Inserts element at end of Queue
  public void insert( long i ){
    if(rear == maxSize - 1){
      rear = -1;
    }
    qArray[++rear] = i;
    nItems++;
    }


  //removes the items at the front and returns value
  public long remove() {
    long t = qArray[front++];
    if( front == maxSize ){
      front = 0;
    }
    nItems--;
    return t;
  }

  //returns value at the Front
  public long peek(){
    return qArray[front];
  }

  public boolean isEmpty(){
    return (nItems == 0);
  }

  public void displayQueue(){
    int index = front;
    for( int k = 0; k < nItems; k++){
      System.out.print( qArray[index] + " " );
      if( index == maxSize - 1){
        index = 0;
      }
      else{
        index++;
      }
    }
    System.out.println();
  }

  public static void main( String args[] ) {
        Queue newQueue = new Queue(5);

        //testing insert
        System.out.println( "Test Insert" );
        newQueue.insert( 1 );
        newQueue.insert( 5 );
        newQueue.insert( 32 );
        newQueue.insert( 3 );
        newQueue.displayQueue( );


        //testing remove
        System.out.println( "Test Remove" );
        newQueue.remove();
        System.out.println( " Remove 1 " );
        newQueue.remove();
        System.out.println( " Remove 5 " );
        newQueue.remove();
        System.out.println( " Remove 32 " );
        newQueue.displayQueue( );

        //testing wraparound
        System.out.println( "Test Wrap Around " );
        newQueue.insert( 14 );
        newQueue.insert( 12 );
        newQueue.insert( 45 );
        //newQueue.insert( 48 );
        newQueue.displayQueue( );

        // testing displayQueue
        System.out.println( "Test Display " );
        System.out.print( " Current queue: " );
        newQueue.displayQueue( );
        System.out.println();

        System.out.println( " Adding 13 " );
        newQueue.insert( 13 );
        System.out.print( " Current queue: " );
        newQueue.displayQueue();
    }

}
