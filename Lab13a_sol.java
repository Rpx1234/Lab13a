//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;


public class Lab13a_sol
{
   public static void main(String args[]) throws IOException
   {
   String piglatin,getpigLatin;
   Scanner file;
   file = new Scanner(new File("lab13a.dat"));
   int cnt = file.nextInt();
   file.nextLine();
   for(int i=0; i<cnt; i++)
   {
     String sentence = file.nextLine();
     piglatin = getPigLatin(sentence);
     out.println(piglatin);
     
   }

   }

public static String getPigLatin(String sentence)
 {
  String pigLatin = "";
  
  Scanner chopper = new Scanner (sentence);
  while (chopper.hasNext())
  {
   String word = chopper.next();
   char firstLetter = word.charAt(0);
   String vowels = "aeiouAEIOU";
   if(vowels.indexOf(firstLetter)>=0)
   {
    pigLatin = pigLatin + word + "ay ";
   }
   else
   {
    pigLatin = pigLatin + word.substring(1) + word.charAt(0) + "ay ";
   }
  }
  return pigLatin;
 }
}