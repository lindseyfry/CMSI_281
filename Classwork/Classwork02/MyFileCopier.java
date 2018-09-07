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
import copiersupport.*;
import java.util.Scanner;

public class MyFileCopier{

  public static void main(Sting args[]){
    Scanner fileScanner = new Scanner(System.in);
    System.out.println("Please enter a file name: ");
    String fileName = fileScanner.next();

    //get source file content
    SourceFile sourceFile = new SourceFile( fileName );
    sourceFile.close();
    TargetFile targetFile = new TargetFile( fileName, sourceFile.getContents());
    targetFile.close();
  }
}
