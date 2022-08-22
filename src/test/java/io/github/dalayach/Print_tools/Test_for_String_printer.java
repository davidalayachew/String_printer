package io.github.dalayach.Print_tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests String_printer functions for their ability to provide correctly
 * formatted strings, account for new lines accurately, and to ensure that the
 * shortened version of each print function works as expected.
 *
 * STATUS -- COMPLETE
 */
public class Test_for_String_printer 
{

   /** We need an instance of String_printer in order to test String_printer. */
   private String_printer sp = new String_printer();
   /** String that will hold the expected output so that we can compare with actual output. */
   private String expected_string;
   /** String array that provides us with demo values for easy testing. Values can be changed here to check methods. */
   private String[] arr = {"ace", "ventura", "show"};
   /** int that wiil hold the expected output so that we can compare with actual output. */
   private int expected_int;

   /*

   public Test_for_String_printer()
   {
   
      test_println_c();
      test_print_c();
      test_println_l();
      test_print_l();
      test_println_r();
      test_print_r();
   
   }
   
   */
   
   /**
    * Test for println_c(). Will specifically test boolean and new line
    * functionality.
    */
   @Test public void test_println_c()
   {
   
      // tests that borders appear when true
      expected_string = "|        ace         |      ventura       |        show        |\n";
      assertEquals(
         expected_string, 
         sp.println_c(
            true, 
            20, 
            "ace", "ventura", "show"));
      
      // tests that borders do NOT appear when false
      expected_string = "        ace               ventura               show        \n";
      assertEquals(
         expected_string, 
         sp.println_c(
            false, 
            20, 
            "ace", "ventura", "show"));
      
      // tests that borders appear when not given a border boolean value
      expected_string = "|        ace         |      ventura       |        show        |\n";
      assertEquals(
         expected_string, 
         sp.println_c(
            20, 
            "ace", "ventura", "show"));
   
   }

   /**
    * Test for print_c(). Will specifically test boolean and new line
    * functionality.
    */      
   @Test public void test_print_c()
   {
      
      // tests that borders appear when true
      expected_string = "|        ace         |      ventura       |        show        |";
      assertEquals(
         expected_string, 
         sp.print_c(
            true, 
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
      // tests that borders do NOT appear when false
      expected_string = "        ace               ventura               show        ";
      assertEquals(
         expected_string, 
         sp.print_c(
            false, 
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
      // tests that borders appear when not given a border boolean value
      expected_string = "|        ace         |      ventura       |        show        |";
      assertEquals(
         expected_string, 
         sp.print_c(
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
   }
      
   /**
    * Test for println_l(). Will specifically test boolean and new line
    * functionality.
    */
   @Test public void test_println_l()
   {
      
      // tests that borders appear when true
      expected_string = "|ace                 |ventura             |show                |\n";
      assertEquals(
         expected_string, 
         sp.println_l(
            true, 
            20, 
            "ace", "ventura", "show"));
      
      // tests that borders do NOT appear when false
      expected_string = "ace                 ventura             show                \n";
      assertEquals(
         expected_string, 
         sp.println_l(
            false, 
            20, 
            "ace", "ventura", "show"));
      
      // tests that borders appear when not given a border boolean value
      expected_string = "|ace                 |ventura             |show                |\n";
      assertEquals(
         expected_string, 
         sp.println_l(
            20, 
            "ace", "ventura", "show"));
      
   }
      
   /**
    * Test for print_l(). Will specifically test boolean and new line
    * functionality.
    */
   @Test public void test_print_l()
   {
   
      // tests that borders appear when true
      expected_string = "|ace                 |ventura             |show                |";
      assertEquals(
         expected_string, 
         sp.print_l(
            true, 
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
      // tests that borders do NOT appear when false
      expected_string = "ace                 ventura             show                ";
      assertEquals(
         expected_string, 
         sp.print_l(
            false, 
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
      // tests that borders appear when not given a border boolean value
      expected_string = "|ace                 |ventura             |show                |";
      assertEquals(
         expected_string, 
         sp.print_l(
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
   }
    
   /**
    * Test for println_r(). Will specifically test boolean and new line
    * functionality.
    */
   @Test public void test_println_r()
   {
   
      // tests that borders appear when true
      expected_string = "|                 ace|             ventura|                show|\n";
      assertEquals(
         expected_string, 
         sp.println_r(
            true, 
            20, 
            "ace", "ventura", "show"));
      
      // tests that borders do NOT appear when false
      expected_string = "                 ace             ventura                show\n";
      assertEquals(
         expected_string, 
         sp.println_r(
            false, 
            20, 
            "ace", "ventura", "show"));
      
      // tests that borders appear when not given a border boolean value
      expected_string = "|                 ace|             ventura|                show|\n";
      assertEquals(
         expected_string, 
         sp.println_r(
            20, 
            "ace", "ventura", "show"));
      
   }
    
   /**
    * Test for print_r(). Will specifically test boolean and new line
    * functionality.
    */
   @Test public void test_print_r()
   {
   
      // tests that borders appear when true
      expected_string = "|                 ace|             ventura|                show|";
      assertEquals(
         expected_string, 
         sp.print_r(
            true, 
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
      // tests that borders do NOT appear when false
      expected_string = "                 ace             ventura                show";
      assertEquals(
         expected_string, 
         sp.print_r(
            false, 
            20, 
            "ace", "ventura", "show"));
      System.out.println();
      
      // tests that borders appear when not given a border boolean value
      expected_string = "|                 ace|             ventura|                show|";
      assertEquals(
         expected_string, 
         sp.print_r(
            20, 
            "ace", "ventura", "show"));
      System.out.println();
   
   }
   
   // public static void main(String[] args)
   // { Test_for_String_printer tfsp = new Test_for_String_printer(); }
        
}
