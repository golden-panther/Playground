import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
       String strOrig, word;
       Scanner scan = new Scanner(System.in);
       
       //System.out.print("Enter a String : ");
       strOrig = scan.nextLine();
       
       //System.out.print("Enter a Word to be Delete from the String : ");
       word = "the ";
       
       //System.out.print("Deleting all '" + word + "' from '" + strOrig + "'...\n");
       strOrig = strOrig.replaceAll(word, "");
	   
      // System.out.print("Specified word deleted Successfully from the String..!!");
	   
       //System.out.print("\nNow the String is :\n");
       System.out.print(strOrig);       
   }
}