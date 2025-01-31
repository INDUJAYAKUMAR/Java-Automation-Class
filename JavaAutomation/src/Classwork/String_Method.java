package Classwork;


public class String_Method // this is length method
{
        
    public static void main(String args[])
    {
      String a = "I am Indu";//9
      //length method
      int size = a.length();
      System.out.println("The length of a is: "+size);
     
      //CharAt method
      char get = a.charAt(5);
      System.out.println("The variable at 4th position is: "+get);
     
      //value of method- used to convert all datatype entered in to string
      int p = 25;
      String q = String.valueOf(p);
      System.out.println("Displaying the string value : "+q );
      
      // Equals method - also check case(uppercase/lower case)
      String x = "Hello";
      String y = "hello";
      String z = "Hello";
   
      System.out.println(x.equals(y));
      System.out.println(y.equals(z));
      System.out.println(z.equals(x));
      //Equals Ignore case - compare only the content (ignore case)
  
     System.out.println("Using equal ignore case: "+x.equalsIgnoreCase(y));
      
      //concat method

      String m = "Hello"+"\t";
      String n = "World"+"\t";
      String o = m.concat(n);
      //String w = "Welcome";
      //String q = o.concat(w);
      System.out.println(o);

      //split method

      String splitvalue[] = a.split(" ");

      System.out.println("Name is: "+splitvalue[2]);// to print a particular value of the array

      for(int i=0 ;i<splitvalue.length ;i++) // to print all values of the array
      {
      System.out.println(splitvalue[i]);
      }
      //for each loop

      String f[] = {"World","is","so","beautiful"};
      for(String e : f)
      System.out.println(e);     

      //StringBuffer and StringBuilder syntax
       
       StringBuffer fullname = new StringBuffer("Rose Mathew");
       
      
    }

}


