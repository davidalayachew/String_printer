package io.github.dalayach.Print_tools;

/** A simple tutorial that can be run, outputting the most common use cases. */
public class TUTORIAL_RUN_ME extends String_printer
{
   
   /** The tutorial itself. Run the method and a cleanly formatted tutorial will be printed out. */
   public static void how_to_use_string_printer()
   {
   
      System.out.print("String_printer sp = new String_printer();");
      String_printer sp = new String_printer();
        
      System.out.print("\n\n//Left justified");
      System.out.print("\nsp.print_l(true, 20, \"ace\", \"ventura\", \"show\");       = ");
      sp.print_l(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_l(false, 20, \"ace\", \"ventura\", \"show\");      = ");
      sp.print_l(false, 20, "ace", "ventura", "show");
      
      System.out.print("\n\n//Right justified");
      System.out.print("\nsp.print_r(true, 20, \"ace\", \"ventura\", \"show\");       = ");
      sp.print_r(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_r(false, 20, \"ace\", \"ventura\", \"show\");      = ");
      sp.print_r(false, 20, "ace", "ventura", "show");
      
      System.out.print("\n\n//Center justified");
      System.out.print("\nsp.print_c(true, 20, \"ace\", \"ventura\", \"show\");       = ");
      sp.print_c(true, 20, "ace", "ventura", "show");
      System.out.print("\nsp.print_c(false, 20, \"ace\", \"ventura\", \"show\");      = ");
      sp.print_c(false, 20, "ace", "ventura", "show"); 
      
      
      System.out.println("\n\n\n\n/* For easy printing in for loops, use the \"println_\" version instead of "
         + "\"print_\" */");
      System.out.println("/* Future examples will use the ln version. */");
      
      
      System.out.println("\n\n\n/* Arrays work too! */\n\nString arr[] = {\"ace\", \"ventura\", \"show\"};");
      String[] arr = {"ace", "ventura", "show"};
   
   
      System.out.print("\nsp.println_c(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      sp.println_c(true, 20, "ace", "ventura", "show");
      System.out.print("sp.println_c(true, 20, arr);                          = ");
      sp.println_c(true, 20, arr);       
      
      
      System.out.print("\n\n\n/* You can control the size of each column too! */\n");
      
      
      System.out.print("\nsp.println_c(true, 20, arr);                          = ");
      sp.println_c(true, 20, arr);
      System.out.print("sp.println_c(true, 10, arr);                          = ");
      sp.println_c(true, 10, arr);
      
      System.out.print("\n/* If the size parameter is too small, all columns (FOR THAT ROW ONLY) will automatically"
         + " extend to the size of the WIDEST COLUMN */\n");
      System.out.print("\nsp.println_c(true, 20, arr);                          = ");
      sp.println_c(true, 20, arr);
      System.out.print("sp.println_c(true, 10, arr);                          = ");
      sp.println_c(true, 10, arr);
      System.out.print("sp.println_c(true, 5, arr);                           = ");
      sp.println_c(true, 5, arr);
      System.out.print("sp.println_c(true, 3, arr);                           = ");
      sp.println_c(true, 3, arr);
      System.out.print("sp.println_c(true, 1, arr);                           = ");
      sp.println_c(true, 1, arr);
      System.out.print("sp.println_c(true, 0, arr);                           = ");
      sp.println_c(true, 0, arr);
      System.out.print("sp.println_c(true, -1, arr);                          = ");
      sp.println_c(true, 0, arr);
      
      
      System.out.println("\n\n\n/* Overloaded version of the function WITHOUT the border check. Basically, it gives"
         + " borders without asking you. */");
         
         
      System.out.print("\nsp.println_c(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      sp.println_c(true, 20, "ace", "ventura", "show");
      System.out.print("sp.println_c(true, 20, arr);                          = ");
      sp.println_c(true, 20, arr);
      System.out.print("sp.println_c(20, arr);                                = ");
      sp.println_c(20, arr);
      
      
      System.out.println("\n\n/* All of the above methods are the short hand aliases. Of course, if you would like to"
         + " use the longer names, that is fine too! */\n\n");
      
      
      System.out.print("sp.println_c(20, arr);                                = ");
      sp.println_c(20, arr);
      System.out.print("sp.print_center_justified(20, arr);                   = ");
      sp.print_center_justified(20, arr);
      System.out.println("\n/**\n * PLEASE BE AWARE -- the longer versions (currently) don't allow for \'ln\' "
         + "functionality, so\n * if you would like that, either add it in yourself, or stick to the short hand "
         + "functions.\n */");
      
   }
   
   /** Main method to run the tutorial. */
   public static void main(String[] args)
   {
   
      how_to_use_string_printer();
   
   }

}