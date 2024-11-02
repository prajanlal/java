public class LengthExample4  
{  
// main method  
public static void main(String argvs[])  
{  
String str = " Welcome To JavaTpoint ";  
int sizeWithWhiteSpaces = str.length();  
  
System.out.println("In the string: " + "'" + str + "'");  
  
str = str.replace(" ", "");  
int sizeWithoutWhiteSpaces = str.length();  
  
// calculating the white spaces  
int noOfWhieSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;  
  
System.out.print("Total number of whitespaces present are: " + noOfWhieSpaces);  
}  
} 
