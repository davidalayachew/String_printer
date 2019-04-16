package io.github.dalayach.Print_tools;

//TODO   Give option to choose border character(s) (ideally, allow there to be a left and right variant, as well as a flip variant)
   //TODO   Optimization on some of the for each loops
//TODO   Maybe make variables like expected_size and borders be instance variables? And build a constructor() and a nextLine() using
//          those new class variables?
//TODO   Need WAAAAY more tests

public class String_printer extends Build_strings
{
   
   public String_printer()
   {}
   
   public String print_c(int total, String... messages)  
   {  
      
      return print_center_justified(total, messages);
      
   }
   
   public String print_c(boolean borders, int total, String... messages)
   {  
      
      return print_center_justified(borders, total, messages);
      
   }
   
   public String println_c(int total, String... messages)
   {
      
      String result = print_center_justified(total, messages);
      System.out.println();  
      
      return result + "\n";
      
   }
   
   public String println_c(boolean borders, int total, String... messages)
   {  
      
      String result =  print_center_justified(borders, total, messages);
      System.out.println();
      
      return result + "\n";
      
   }
   
   public String print_l(int total, String... messages)
   {
      
      return print_left_justified(total, messages);
      
   }
   
   public String print_l(boolean borders, int total, String... messages)
   {  
      
      return print_left_justified(borders, total, messages);
      
   }
   
   public String println_l(int total, String... messages)
   {
   
      String result =  print_left_justified(total, messages);
      System.out.println();
      
      return result + "\n";
      
   }
   
   public String println_l(boolean borders, int total, String... messages)  
   {
   
      String result =  print_left_justified(borders, total, messages);
      System.out.println();
      
      return result + "\n";
      
   }
   
   public String print_r(int total, String... messages)
   {  
      
      return print_right_justified(total, messages);
      
   }
   
   public String print_r(boolean borders, int total, String... messages)  
   {  
      
      return print_right_justified(borders, total, messages);
      
   }
   
   public String println_r(int total, String... messages)  
   {
   
      String result =  print_right_justified(total, messages);
      System.out.println();
      
      return result + "\n";
      
   }
   
   public String println_r(boolean borders, int total, String... messages)
   {
   
      String result =  print_right_justified(borders, total, messages);
      System.out.println();
      
      return result + "\n";
      
   }

}