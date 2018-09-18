/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  File name     :  SourceFile.java
*  @author       :  Lindsey Fry and Joe Gorman
*  Date written  :  2018-09-18
*
*  Notes         :  None right now.  I'll add some as they occur.
*  Warnings      :  None
*  Exceptions    :  IOE Exception for SourceFile
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  Revision Histor
*  ---------------
*            Rev      Date     Modified by:  Reason for change/modification
*           -----  ----------  ------------  -----------------------------------------------------------
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class HighArrayApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array

      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);
      arr.insert(200);
      arr.insert(456);
      //arr.insert(4325);

      arr.display();                // display items

      int searchKey = 33;           // search for item
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.delete(00);               // delete 3 items
      arr.delete(55);
      arr.delete(99);

      System.out.print(arr.getMax());
      arr.delete(200);
      arr.getMax();
      arr.display();                // display items again

      System.out.print(arr.getMax());
      arr.delete(456);
      arr.getMax();
      arr.display();

      // System.out.print(arr.getMax());
      // arr.delete(4325);
      // arr.getMax();
      // arr.display();

      System.out.println("noDups tests");
        arr.insert(999);
        arr.insert(999);
        arr.insert(999);
        arr.display();
        arr.noDups();
        System.out.println("//");
        arr.display();

        arr.insert(234);
        arr.insert(243);
        arr.insert(234);
        arr.display();
        arr.noDups();
        System.out.println("//");
        arr.display();
      }  // end main()
   }  // end class HighArrayApp
