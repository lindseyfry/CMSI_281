 /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntList.java
 *  @author       :  Lindsey Fry
 *  Date written  :  2018-09-13
 *
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntList implements IntListInterface {
      private int[] theList;
      private int   size;

      private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal
      private static final int INT_ARRAY_VALUE = 0;

      public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
         theList = new int[STARTING_SIZE];
         size = 0;
      }

      public boolean checkIndex(int index){
        if( size == 0 ) {
         return false;
      } else if( index > size ) {
         return false;
      } else if ( index < 0 ) {
         return false;
      }
      return true;
      }

      public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
         if(!checkIndex (index) ){
           throw new ArrayIndexOutOfBoundsException("The Index is out of bounds or the list is empty!");
         }
         return theList[index];
      }

      public boolean append( int valueToAdd ) {
         if( size < theList.length ) {
            theList[size] = valueToAdd;
            size++;
            return true;
         } else {
            int[] newList = new int[size + 1];
            for(int j = 0; j < size; j++){
              newList[j] = theList[j];
            }
            theList = newList;
            theList[size] = valueToAdd;
            size ++;
         }
         return false;
      }

      public boolean prepend(int valueToAdd){
        if(theList[size] != 0){
          int[] newList = new int[size + STARTING_SIZE];
          for(int j = 0; j < size; j++){
            newList[j] = theList[j];
          }
          theList = newList;
        }
        for( int j = size - 2; j >= 0; j--){
          theList[j+1] = theList[j];
        }
        theList[0] = valueToAdd;
        return true;
      }

      // we've gotta have this to actually get things to compile
      public boolean insertValueAtIndex( int value, int index ) {
        if ( !checkIndex( index ) && index > size ) {
         int[] newList = new int[size + STARTING_SIZE];
         for ( int i = 0; i < size; i ++ ) {
            newList[i] = theList[i];
         }
         theList = newList;
      } else if ( !checkIndex( index )) {
         throw new ArrayIndexOutOfBoundsException( "The index is out of bounds or the list is empty!");
      }
      if ( theList[index] == INT_ARRAY_VALUE ) {
         theList[index] = value;
      } else {
         for (int i = size - 2; i >= index; i --) {
            theList[i + 1] = theList[i];
         }
         theList[index] = value;
      }
      return true;
      }

      public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
         if(!checkIndex(index)){
           throw new ArrayIndexOutOfBoundsException( "The index is out of bounds or the list is empty!" );
         }
         int value = theList[index];
         holeFiller(index);
         return value;
      }

      private void holeFiller( int index ) {
         for( int i = index; i < size - 1; i++ ) {
            theList[i] = theList[i+1];
         }
         size--;
      }

      public static void main( String[] args ) {
         IntList list = new IntList();
         list.append( 2 );
         list.append( 3 );
         list.append( 5 );
         list.append( 7 );
         System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
         list.append( 11 );
         list.append( 13 );
         list.append( 17 );
         list.append( 19 );
         list.prepend(5);
         System.out.println( list.getValueAtIndex( 0 ) );      // should return the value 19
         //System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
         list.insertValueAtIndex(18,3);
         System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
         //System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens

      }
   }
