/** HashTable.java   1.0.0   27-November-2018
**** PROBLEM 3
*  Purpose    : Class that does hash code and inserts, finds,
                and deletes from hash table
*  Author     : Joe Gorman & Lindsey Fry
*  Description: The intent of this program is to create methods
*               that will aid in developing hash tables.
**/
import java.io.*;
////////////////////////////////////////////////////////////////
//integer data!!
class DataItem { // (could have more data)
 private int iData; // data item (key)
 public DataItem(int ii) // constructor
 {
   iData = ii;
 }

 public int getKey()
 {
   return iData;
 }

} // end class DataItem


////////////////////////////////////////////////////////////////
class HashTable {
  private DataItem[] hashArray; // array holds hash table
  private int arraySize;
  private DataItem nonItem; // for deleted items
// -------------------------------------------------------------
  public HashTable(int size) // constructor
  {
    arraySize = size;
    hashArray = new DataItem[arraySize];
    nonItem = new DataItem(-1); // deleted item key is -1
  }
// -------------------------------------------------------------
  public void displayTable()
  {
    System.out.print("Table: ");
    for(int j=0; j<arraySize; j++)
    {
      if(hashArray[j] != null)
        System.out.print(hashArray[j].getKey() + " ");
      else
        System.out.print("** ");
    }
    System.out.println("");
  }
// -------------------------------------------------------------
  public int hashFunc(int key) //worked on this function with Kathryn Cole and Joe Gorman to gain new ideas and insights
  {
    int digitGroup = 3;
    int value = 0;
    int newSize = arraySize;
    while(newSize > 0){
      digitGroup = digitGroup * 10;
      newSize = newSize/10;
    }
    System.out.print(digitGroup);
    while(key > 0){
      value = value + (key % digitGroup);
      key = key/digitGroup;
    }
    //return key.length(); // hash function
    return value % newSize;
  }
// -------------------------------------------------------------
  public void insert(DataItem item){ // insert a DataItem
// (assumes table not full)
    int key = item.getKey(); // extract key
    int hashVal = hashFunc(key); // hash the key
  // until empty cell or -1,
    while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1)
    {
      ++hashVal; // go to next cell
      hashVal %= arraySize; // wraparound if necessary
    }
    hashArray[hashVal] = item; // insert item
  } // end insert()

// -------------------------------------------------------------
  public DataItem delete(int key) // delete a DataItem
  {
    int hashVal = hashFunc(key); // hash the key
    while(hashArray[hashVal] != null) // until empty cell,
    { // found the key?
      if(hashArray[hashVal].getKey() == key){
        DataItem temp = hashArray[hashVal]; // save item
        hashArray[hashVal] = nonItem; // delete item
        return temp; // return item
      }
    ++hashVal; // go to next cell
    hashVal %= arraySize; // wraparound if necessary
    }
    return null; // can’t find item
  } // end delete()
// -------------------------------------------------------------
  public DataItem find(int key) // find item with key
  {
    int hashVal = hashFunc(key); // hash the key
    while(hashArray[hashVal] != null) // until empty cell,
    { // found the key?
    if(hashArray[hashVal].getKey() == key)
      return hashArray[hashVal]; // yes, return item
    ++hashVal; // go to next cell
    hashVal %= arraySize; // wraparound if necessary
    }
    return null; // can’t find item
  }
    // -------------------------------------------------------------
    public static void main( String args[] ){
      HashTable priorQ = new HashTable( 10 );
            priorQ.hashFunc( 400 );
} // end class HashTable
}
