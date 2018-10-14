/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  File name     :  IntQueue.java
*  @author       :  Lindsey Fry
*  Date written  :  2018-10-13
*
*  Notes         :  None right now.  I'll add some as they occur.
*  Warnings      :  None
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class Dequeue {
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;
    private long[] dArray;


    public Dequeue( int size ) {
        maxSize = size;
        front = 0;
        rear = -1;
        nItems = 0;
        dArray = new long[maxSize];
    }

    //insert at front of array
    public void insertLeft( long j ) {
        if ( front == 0 ) {
            front = maxSize;
        }
        dArray[--front] = j;
        nItems++;
    }

    //insert at rear of array
    public void insertRight( long j ) {
        if ( rear == maxSize - 1 ) {
            rear = -1;
        }
        dArray[++rear] = j;
        nItems++;
    }

    //Removes from the front
    public long removeLeft() {
        long temp = dArray[front++];
        if ( front == maxSize ) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    //removes item at rear
    public long removeRight() {
        long temp = dArray[rear--];
        if ( rear == -1 ) {
            rear = maxSize-1;
        }
        nItems--;
        return temp;
    }


    public boolean isEmpty() {
        return ( nItems == 0 );
    }


    public boolean isFull() {
        return ( nItems == maxSize );
    }


    public void displayDequeue() {
        int index = front;
        for ( int i = 0; i < nItems; i++ ) {
            System.out.print( dArray[index] + " " );
            if ( index == maxSize - 1 ) {
                index = 0;
            }
            else {
                index++;
            }
        }
        System.out.println();
    }

    /**
     * Main to test methods
     */
    public static void main( String args[] ) {
        Dequeue newDequeue = new Dequeue( 5 );

        System.out.println( "Test Insert Right");
        newDequeue.insertRight( 4 );
        newDequeue.insertRight( 20 );
        newDequeue.insertRight( 15 );
        newDequeue.insertRight( 32 );
        newDequeue.displayDequeue();

        System.out.println( "Test Remove Left");
        newDequeue.removeLeft();
        newDequeue.displayDequeue();
        newDequeue.removeLeft();
        newDequeue.displayDequeue();
        newDequeue.removeLeft();
        newDequeue.displayDequeue();

        System.out.println( "Test Insert Left");
        newDequeue.insertLeft( 18 );
        newDequeue.insertLeft( 13 );
        newDequeue.insertLeft( 24 );
        newDequeue.insertLeft( 23 );
        newDequeue.displayDequeue();

        System.out.println( "Test Remove Right");
        newDequeue.removeRight();
        newDequeue.displayDequeue();
        newDequeue.removeRight();
        newDequeue.displayDequeue();

        System.out.println( "Test Is Empty" );
        System.out.println( " Dequeue empty? " + newDequeue.isEmpty() );  //false
        System.out.println( " Dequeue full? " + newDequeue.isFull() );   //false
        newDequeue.insertLeft( 143 );
        newDequeue.insertRight( 26 );
        newDequeue.displayDequeue();
        //newDequeue.getSize();
        System.out.println( " Dequeue full? " + newDequeue.isFull() );   //true
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.displayDequeue();
        System.out.println( " Dequeue empty? " + newDequeue.isEmpty() );  //true
    }
}
