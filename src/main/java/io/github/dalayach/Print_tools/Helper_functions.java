package io.github.dalayach.Print_tools;

/**
 * Provides helper functions for the other classes to extend/use. Largely focuses on calculating the
 * correct values for the Build_strings class to use when building strings.
 **/
class Helper_functions
{

   public int check_expected_size_is_accurate(int expected_size, String... messages)
   {
   
      int index = messages.length;
      int max_length = expected_size;
   
   
   //This for loop has room for optimization - specifically...
   //    - is there some algorithm that would find the highest point fastest? A for loop may not be the most efficient.
   //    - is it more efficient to have 2 calls to message.length()? Or a single call and save that value to yet 
   //    - another variable? Another way?
      for (int i = 0; i < messages.length; i++)
      {
      
         // TODO
         // currently, if even one of them fails, then the return value is tainted.
         // fix it so that it only changes return value if EVERY one fails.
         if (messages[i].length() > max_length)
         {
         
            index = i;
            max_length = messages[i].length();
         
         }
      
      
      }
      
      return index;
   
   }
   
   public int get_actual_size(int expected_size, String... messages)
   {
   
      int index_of_offending_string = check_expected_size_is_accurate(expected_size, messages);
      
      if (index_of_offending_string == messages.length)   //if the expected size was accurate
      {
      
         return expected_size;
      
      }
      
      else
      {
      
         return messages[index_of_offending_string].length();
      
      }
   
   }
   
   public String specifiers_for_format(int left_buffer, int right_buffer)
   {
   
      if (left_buffer < 1 && right_buffer < 1)
      {
      
         System.out.println("\n\nHMM\n\n");
         return "%" + (left_buffer + right_buffer) + "s";
      
      }
      
      else
      {
      
         return "%" + left_buffer + "s%" + right_buffer + "s";   
         //centered, but section size may vary amongst each other
      
      }
   
   }
   
   public String specifiers_for_format(int buffer, boolean left)
   {
   
      String which_side;   //which side will the string be justified?
      
      if (left == true) { which_side = "-"; } // "-" means the resulting string will be left justified
      
      else  { which_side = ""; }   // "" means the resulting string will be right justified
   
      return "%" + which_side + buffer + "s";
   
   
   }
   
   public String create_formatted_String(int left_buffer, int right_buffer, String message)
   {
   
      int expected_size = left_buffer + right_buffer;
   
      if (left_buffer == 0 && right_buffer != 0)
      {
         return String.format(specifiers_for_format(expected_size, true), message); }
      
      else if (right_buffer == 0 && left_buffer != 0)
      {
         return String.format(specifiers_for_format(expected_size, false), message); }
      
      else
      {
      
         return String.format(specifiers_for_format(left_buffer, right_buffer), message, " ");   
         //centered, but section size may vary amongst each other
      
      }
   
   }
   
   public int get_buffer_size(int expected_size, int message_length)
   {
   
      return ((expected_size - message_length) / 2) + ((expected_size - message_length) % 2); 
      //since dividing by 2 might give us a remainder of one (it will when dividing an odd number), 
      //we have elected to add the extra space to the right_buffer
   
   }
   
   public String give_borders(boolean borders)
   {
   
      if (borders == true)
      {
      
         return "|";
      
      }
      
      else
      {
      
         return "";
      
      }
      
   
   }
   
   public String create_formatted_string(int left_buffer, int right_buffer, String message)
   {
      return create_formatted_String(left_buffer, right_buffer, message); }
   
}