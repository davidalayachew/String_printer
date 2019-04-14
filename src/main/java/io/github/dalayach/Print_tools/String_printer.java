package io.github.dalayach.Print_tools;

//TODO -- right now, result is working alongside the print/format statements. INSTEAD, have result be the only value calculated, then both return and print result (maybe give the option to print result?)
//TODO -- give option to choose border character(s) (ideally, allow there to be a left and right variant, as well as a flip variant)

public class String_printer
{

   public String_printer()
   {}
   
   public String format_specifiers(int left_buffer, int right_buffer)
   {
   
      return "%" + left_buffer + "s%" + right_buffer + "s";   //centered, but section size may vary amongst each other
   
   }
   
   public String format_specifiers(int buffer, boolean left)
   {
   
      String which_side;   //which side will the string be justified?
      
      if(left == true){which_side = "-";} // "-" means the resulting string will be left justified
      
      else  {which_side = "";}   // "" means the resulting string will be right justified
   
      return "%" + which_side + buffer + "s";
   
   
   }
   
   public String create_formatted_String(int left_buffer, int right_buffer, String message)
   {
   
      int total_size = left_buffer + right_buffer;
   
      if(left_buffer == 0)
      {
         return String.format(format_specifiers(total_size, true), message);}
      
      else if(right_buffer == 0)
      {
         return String.format(format_specifiers(total_size, false), message);}
      
      else
      {
      
         return String.format(format_specifiers(left_buffer, right_buffer), message, " ");   //centered, but section size may vary amongst each other
      
      }
   
   }
   
   public int get_buffer_size(int total_size, int message_length)
   {
   
      return ((total_size - message_length)/2) + ((total_size - message_length)%2); 
      //since dividing by 2 might give us a remainder of one (it will when dividing an odd number), 
      //we have elected to add the extra space to the right_buffer
   
   }
   
   public String print_borders(boolean borders)
   {
   
      if(borders == true)
      {
      
         return "|";
      
      }
      
      else
      {
      
         return "";
      
      }
      
   
   }
   
   public String print_center_justified(int total_size, String... messages)
   {
   
      String result = "";
      int left_buffer;
      int right_buffer;
   
      for(String message : messages)
      {
      
         right_buffer   = get_buffer_size(total_size, message.length());
         left_buffer    = total_size - right_buffer;//remember, we have code to buffer the left side, or the right, but not both. THEREFORE, we have elected to leave the code right-justified, which will mean the left will be buffered on its own, and we will artificially buffer the right side, resulting in a center-justified format
      
         result = result + "|" + create_formatted_string(left_buffer, right_buffer, message);
      
      }
      
      result = result + "|";
      
      System.out.print(result);
      
      return result;
   
   }
   
   public String print_center_justified(boolean borders, int total_size, String... messages)
   {
   
      String result = "";
      int right_buffer;
      int left_buffer;
   
      for(String message : messages)
      {
      
         right_buffer   = get_buffer_size(total_size, message.length());
         left_buffer   = total_size - right_buffer;//remember, we have code to buffer the left side, or the right, but not both. THEREFORE, we have elected to leave the code right-justified, which will mean the left will be buffered on its own, and we will artificially buffer the right side, resulting in a center-justified format
      
         result = result + print_borders(borders) + create_formatted_string(left_buffer, right_buffer, message);
      
      }
      
      result = result + print_borders(borders);
      
      System.out.print(result);
      
      return result;
   
   }
   
   public String print_left_justified(boolean borders, int total_size, String... messages)
   {
         
      String result = "";
         
      for(String message : messages)
      {
      
         result = result + print_borders(borders) + create_formatted_string(0, total_size, message);
      
      }
      
      result = result + print_borders(borders);
      
      System.out.print(result);
      
      return result;
         
   }
   
   public String print_left_justified(int total_size, String... messages)
   {
   
      String result = "";
         
      for(String message : messages)
      {
      
         result = result + "|" + create_formatted_string(0, total_size, message);
      
      }
      
      result = result + "|";
      
      System.out.print(result);
      
      return result;
   
   }

   public String print_right_justified(boolean borders, int total_size, String... messages)
   {
         
      String result = "";
         
      for(String message : messages)
      {
               
         result = result + print_borders(borders) + create_formatted_string(total_size, 0, message);
      
      }
      
      result = result + print_borders(borders);
      
      System.out.print(result);
      
      return result;
   
   }
   
   public String print_right_justified(int total_size, String... messages)
   {
         
      String result = "";
         
      for(String message : messages)
      {
      
         result = result + "|" + create_formatted_string(total_size, 0, message);
      
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
   
   public String print_l(int total, String... messages)  {  
      return print_left_justified(total, messages);  }
   
   public String print_l(boolean borders, int total, String... messages)  {  
      return print_left_justified(borders, total, messages);  }
   
   public String println_l(int total, String... messages)  {  
      String result =  print_left_justified(total, messages);  System.out.println();  
      return result + "\n";}
   
   public String println_l(boolean borders, int total, String... messages)  {  
      String result =  print_left_justified(borders, total, messages);  System.out.println();  
      return result + "\n";}
   
   public String print_r(int total, String... messages)  {  
      return print_right_justified(total, messages);  }
   
   public String print_r(boolean borders, int total, String... messages)  {  
      return print_right_justified(borders, total, messages);  }
   
   public String println_r(int total, String... messages)  {  
      String result =  print_right_justified(total, messages);  System.out.println();  
      return result + "\n";}
   
   public String println_r(boolean borders, int total, String... messages)  {  
      String result =  print_right_justified(borders, total, messages);  System.out.println();  
      return result + "\n";}
      
   public String create_formatted_string(int left_buffer, int right_buffer, String message)
   {
      return create_formatted_String(left_buffer, right_buffer, message);}

   public static void main(String[] args)
   {
   
      String_printer sp = new String_printer();
      sp.println_c(true, 20, "ace", "ventura", "show");
      sp.println_c(false, 20, "ace", "ventura", "show");
      sp.print_c(true, 20, "ace", "ventura", "show");    System.out.println();
      sp.print_c(false, 20, "ace", "ventura", "show");   System.out.println();
      sp.println_l(true, 20, "ace", "ventura", "show");
      sp.println_l(false, 20, "ace", "ventura", "show");
      sp.print_l(true, 20, "ace", "ventura", "show");    System.out.println();
      sp.print_l(false, 20, "ace", "ventura", "show");   System.out.println();
      sp.println_r(true, 20, "ace", "ventura", "show");
      sp.println_r(false, 20, "ace", "ventura", "show");
      sp.print_r(true, 20, "ace", "ventura", "show");    System.out.println();
      sp.print_r(false, 20, "ace", "ventura", "show");   System.out.println();
      
   
   }

}