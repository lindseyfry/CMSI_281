 /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  MyFileCopier.java
 *  @author       :  Lindsey Fry
 *  Date written  :  2018-09-06
 *
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import copiersupport.SourceFile;
import copiersupport.TargetFile;
import java.util.Scanner;

public class MyFileCopier{

  public static void main(String args[]){
    // Scanner fileScanner = new Scanner(System.in);
     System.out.println("Please enter a file name: ");
     String fileName = fileScanner.next();

     SourceFile sourceFile = new SourceFile( fileName );
     String fileText = sourceFile.getFileContent();
     TargetFile targetFile = new TargetFile( fileText, fileName);

  }
}
