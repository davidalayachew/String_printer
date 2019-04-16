package io.github.dalayach.Print_tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for String_printer
 */
public class Test_for_String_printer 
{

   String_printer sp = new String_printer();
   String expected_string;
   String arr[] = {"ace", "ventura", "show"};
   int expected_int;

//TODO -- Currently, tests only test the boolean and new line functionality - test the other components of each method

   @Test public void test_println_c()
   {
   
      // System.out.print("  sp.println_c(true, 20, \"ace\", \"ventura\", \"show\");   = ");
      expected_string = "|        ace         |      ventura       |        show        |\n";
      assertEquals(expected_string, sp.println_c(true, 20, "ace", "ventura", "show"));
      
      // System.out.print("  sp.println_c(false, 20, \"ace\", \"ventura\", \"show\");  = ");
      expected_string = "        ace               ventura               show        \n";
      assertEquals(expected_string, sp.println_c(false, 20, "ace", "ventura", "show"));
   
   }
   
   @Test public void test_print_c()
   {
      
      // System.out.print("  sp.print_c(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      expected_string = "|        ace         |      ventura       |        show        |";
      assertEquals(expected_string, sp.print_c(true, 20, "ace", "ventura", "show"));
      System.out.println();
      
      // System.out.print("\n  sp.print_c(false, 20, \"ace\", \"ventura\", \"show\");    = ");
      expected_string = "        ace               ventura               show        ";
      assertEquals(expected_string, sp.print_c(false, 20, "ace", "ventura", "show"));
      System.out.println();
      
   }
      
   @Test public void test_println_l()
   {
      
      // System.out.print("  sp.println_l(true, 20, \"ace\", \"ventura\", \"show\");   = ");
      expected_string = "|ace                 |ventura             |show                |\n";
      assertEquals(expected_string, sp.println_l(true, 20, "ace", "ventura", "show"));
      
      // System.out.print("  sp.println_l(false, 20, \"ace\", \"ventura\", \"show\");  = ");
      expected_string = "ace                 ventura             show                \n";
      assertEquals(expected_string, sp.println_l(false, 20, "ace", "ventura", "show"));
      
   }
      
   @Test public void test_print_l()
   {
   
      // System.out.print("  sp.print_l(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      expected_string = "|ace                 |ventura             |show                |";
      assertEquals(expected_string, sp.print_l(true, 20, "ace", "ventura", "show"));
      System.out.println();
      
      // System.out.print("\n  sp.print_l(false, 20, \"ace\", \"ventura\", \"show\");    = ");
      expected_string = "ace                 ventura             show                ";
      assertEquals(expected_string, sp.print_l(false, 20, "ace", "ventura", "show"));
      System.out.println();
      
   }
      
   @Test public void test_println_r()
   {
   
      // System.out.print("  sp.println_r(true, 20, \"ace\", \"ventura\", \"show\");   = ");
      expected_string = "|                 ace|             ventura|                show|\n";
      assertEquals(expected_string, sp.println_r(true, 20, "ace", "ventura", "show"));
      
      // System.out.print("  sp.println_r(false, 20, \"ace\", \"ventura\", \"show\");  = ");
      expected_string = "                 ace             ventura                show\n";
      assertEquals(expected_string, sp.println_r(false, 20, "ace", "ventura", "show"));
      
   }
      
   @Test public void test_print_r()
   {
   
      // System.out.print("  sp.print_r(true, 20, \"ace\", \"ventura\", \"show\");     = ");
      expected_string = "|                 ace|             ventura|                show|";
      assertEquals(expected_string, sp.print_r(true, 20, "ace", "ventura", "show"));
      System.out.println();
      
      // System.out.print("\n  sp.print_r(false, 20, \"ace\", \"ventura\", \"show\");    = ");
      expected_string = "                 ace             ventura                show";
      assertEquals(expected_string, sp.print_r(false, 20, "ace", "ventura", "show"));
      System.out.println();
   
   }
   
        
}
