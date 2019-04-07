package io.github.dalayach.Print_tools;

public class String_printer
{

   public String_printer()
   {}
   
   public void print_center_justified(int total_size, String... messages)
   {
   
      int right_buffer;
      int left_buffer;
   
      for(String message : messages)
      {
      
         right_buffer  = ((total_size - message.length())/2) + ((total_size - message.length())%2); //since dividing by 2 might give us a remainder of one (it will when dividing an odd number), we have elected to add the extra space to the right_buffer
         left_buffer   = total_size - right_buffer;//remember, we have code to buffer the left side, or the right, but not both. THEREFORE, we have elected to leave the code right-justified, which will mean the left will be buffered on its own, and we will artificially buffer the right side, resulting in a center-justified format
      
         System.out.format("|%" + left_buffer + "s%" + right_buffer + "s", message, " ");   //centered, but section size may vary amongst each other
      
      }
      
      System.out.print("|");
   
   }
   
   public void print_center_justified(boolean borders, int total_size, String... messages)
   {
   
      int right_buffer;
      int left_buffer;
   
      for(String message : messages)
      {
      
         right_buffer  = ((total_size - message.length())/2) + ((total_size - message.length())%2); //since dividing by 2 might give us a remainder of one (it will when dividing an odd number), we have elected to add the extra space to the right_buffer
         left_buffer   = total_size - right_buffer;//remember, we have code to buffer the left side, or the right, but not both. THEREFORE, we have elected to leave the code right-justified, which will mean the left will be buffered on its own, and we will artificially buffer the right side, resulting in a center-justified format
      
         if(borders == true){System.out.print("|");}
      
         System.out.format("%" + left_buffer + "s%" + right_buffer + "s", message, " ");   //centered, but section size may vary amongst each other
      
      }
      
      if(borders == true){System.out.print("|");}
   
   }

   
   public void print_c(int total, String... messages)  {  print_center_justified(total, messages);  }
   
   public void print_c(boolean borders, int total, String... messages)  {  print_center_justified(borders, total, messages);  }

   public static void main(String[] args)
   {
   
      String_printer sp = new String_printer();
      //sp.print_c(true, );
      
      //TODO - test out the new borderless function overload for print_c() --- has NOT been mvn install'd 
   
   }

}