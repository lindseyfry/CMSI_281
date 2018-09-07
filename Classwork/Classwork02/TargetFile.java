 /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  TargetFile.java
 *  @author       :  Lindsey Fry
 *  Date written  :  2018-09-06
 *
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IOE Exception for TargetFile
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
package copiersupport;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TargetFile{
  public TargetFile( String word, String target){
    try{
      BufferedWriter buffWrite = new BufferedWriter(new FileWriter(target));
      buffWrite( word);
      buffWrite.close();
    }
    catch (IOException ioe){
      System.out.println("TargetFile threw an exception.");
    }
  }
}
