package io.github.dalayach.Print_tools;

//TODO   Give option to choose border character(s) (ideally, allow there to be a left and right variant, as well as a flip variant)
//TODO   This class is too cluttered - maybe group some of the methods in other classes? How to group? Maybe helpers in one class?
//          Main printer functions in another? Aliases in a third? Perhaps divide by justification?
//
//TODO   Optimization on some of the for each loops
//TODO   Maybe make variables like expected_size and borders be instance variables? And build a constructor() and a nextLine() using
//          those new class variables?

public class String_printer extends String_printer_HELPER_FUNCTIONS
{

   public String_printer()
   {}
   

   public String print_center_justified(int expected_size, String... messages)
   {
   
      String result = "";
      int left_buffer;
      int right_buffer;
      int actual_size = get_actual_size(expected_size, messages);
   
      for(String message : messages)
      {
      
         right_buffer   = get_buffer_size(actual_size, message.length());
         left_buffer    = expected_size - right_buffer;//remember, we have code to buffer the left side, or the right, but not both. THEREFORE, we have elected to leave the code right-justified, which will mean the left will be buffered on its own, and we will artificially buffer the right side, resulting in a center-justified format
      
         result = result + "|" + create_formatted_string(left_buffer, right_buffer, message);
      
      }
      
      result = result + "|";
      
      System.out.print(result);
      
      return result;
   
   }
   
   public String print_center_justified(boolean borders, int expected_size, String... messages)
   {
   
      String result = "";
      int right_buffer;
      int left_buffer;
      int actual_size = get_actual_size(expected_size, messages);
   
   
      for(String message : messages)
      {
      
         right_buffer   = get_buffer_size(actual_size, message.length());
         left_buffer   = expected_size - right_buffer;//remember, we have code to buffer the left side, or the right, but not both. THEREFORE, we have elected to leave the code right-justified, which will mean the left will be buffered on its own, and we will artificially buffer the right side, resulting in a center-justified format
      
         result = result + give_borders(borders) + create_formatted_string(left_buffer, right_buffer, message);
      
      }
      
      result = result + give_borders(borders);
      
      System.out.print(result);
      
      return result;
   
   }
   
   public String print_left_justified(boolean borders, int expected_size, String... messages)
   {
         
      String result = "";
      int actual_size = get_actual_size(expected_size, messages);
   
         
      for(String message : messages)
      {
      
         result = result + give_borders(borders) + create_formatted_string(0, actual_size, message);
      
      }
      
      result = result + give_borders(borders);
      
      System.out.print(result);
      
      return result;
         
   }
   
   public String print_left_justified(int expected_size, String... messages)
   {
   
      String result = "";
      int actual_size = get_actual_size(expected_size, messages);
   
         
      for(String message : messages)
      {
      
         result = result + "|" + create_formatted_string(0, actual_size, message);
      
      }
      
      result = result + "|";
      
      System.out.print(result);
      
      return result;
   
   }

   public String print_right_justified(boolean borders, int expected_size, String... messages)
   {
         
      String result = "";
      int actual_size = get_actual_size(expected_size, messages);
   
         
      for(String message : messages)
      {
               
         result = result + give_borders(borders) + create_formatted_string(actual_size, 0, message);
      
      }
      
      result = result + give_borders(borders);
      
      System.out.print(result);
      
      return result;
   
   }
   
   public String print_right_justified(int expected_size, String... messages)
   {
         
      String result = "";
      int actual_size = get_actual_size(expected_size, messages);
   
         
      for(String message : messages)
      {
      
         result = result + "|" + create_formatted_string(actual_size, 0, message);
      
      }
      
      result = result + "|";
      
      System.out.print(result);
      
      return result;
   
   }
   
   public String print_c(int total, String... messages)  {  
      return print_center_justified(total, messages);  }
   
   public String print_c(boolean borders, int total, String... messages)  {  
      return print_center_justified(borders, total, messages);  }
   
   public String println_c(int total, String... messages)  {  
      String result = print_center_justified(total, messages);  System.out.println();  
      return result + "\n";}
   
   public String println_c(boolean borders, int total, String... messages)  {  
      String result =  print_center_justified(borders, total, messages);  System.out.println();  
      return result + "\n";}
   
   public String print_l(int total, String... messages)
   {
      return print_left_justified(total, messages);  }
   
   public String print_l(boolean borders, int total, String... messages)
   {  
      return print_left_justified(borders, total, messages);  }
   
   public String println_l(int total, String... messages)
   {String result =  print_left_justified(total, messages);  System.out.println();  
      return result + "\n";}
   
   public String println_l(boolean borders, int total, String... messages)  
   {  String result =  print_left_justified(borders, total, messages);  System.out.println();  
      return result + "\n";}
   
   public String print_r(int total, String... messages)
   {  
      return print_right_justified(total, messages);  }
   
   public String print_r(boolean borders, int total, String... messages)  
   {  
      return print_right_justified(borders, total, messages);  }
   
   public String println_r(int total, String... messages)  
   {  String result =  print_right_justified(total, messages);  System.out.println();  
      return result + "\n";}
   
   public String println_r(boolean borders, int total, String... messages)
   { String result =  print_right_justified(borders, total, messages);  System.out.println();  
      return result + "\n";}

   public static void main(String[] args)
   {
   
      how_to_use_String_printer();
   
   }

}