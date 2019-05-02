package io.github.dalayach.Print_tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
   
 /**
  *  Tests Helper_functions functions individually for their individual traits.
  *  Each test function may be wildly different from the rest.
  *  
  */

public class Test_for_Helper_functions extends String_printer
{

   private String_printer sp = new String_printer(); 
   // Remeber, we extended Helper_functions into Build_strings, which was
   // extended into String_printer, so String_printer currently holds all of
   // the functions from these 3 classes. Therefore, we can just use
   // String_printer instead for simplicity's sake. We may occassionally use 
   // Helper_functions when it would more clear to do so
   
   private String expected_string;
   private String[] arr = {"ace", "ventura", "show"};
   private int expected_int;
   
   /*
   
   public Test_for_Helper_functions()
   {   
      test_check_expected_size_is_accurate();
      test_get_actual_size();
   }
      
   */
      
   /**
    * A test for the method check_expected_size_is_correct(). Will also test
    * it's connection to the print functions.
    */   
   @Test public void test_check_expected_size_is_accurate()
   {
   
      System.out.println("\n");
      expected_string = 
         "|        ace         |      ventura       |        show        |";
      assertEquals(expected_string, sp.print_c(true, 20, arr));
      System.out.println();
      
      expected_string = "|   ace    | ventura  |   show   |";
      assertEquals(expected_string, sp.print_c(true, 10, arr));
      System.out.println();  
      
      for (int i = 7; i >= -2; i--)
      {
      
         expected_string = "|  ace  |ventura| show  |";
         assertEquals(expected_string, sp.print_c(true, i, arr));
         System.out.println();   
      
      }
               
      expected_int = 1; // means that the greatest value is the one at index 1,
                        // which is "ventura"
      for (int i = -2; i <= 6; i++)
      {
      
         assertEquals(
            expected_int, 
            check_expected_size_is_accurate(i, arr));
         System.out.println("i = " + i);
         
      }
   
      expected_int = 3; // means that the greatest value is the expected_size,
                        // which is signified by the length of arr, which is 3
                        // (which is always index out of bounds, to ensure a 
                        // false value isn't accidentally chosen)
                        
      for (int i = 7; i <= 14; i++)
      {
                        
         assertEquals(
            expected_int, 
            check_expected_size_is_accurate(i, arr));
         System.out.println("i = " + i);
                        
      }
   
   }
   
   /** Test for method get_actual_size(). */
   @Test public void test_get_actual_size()
   {
   
      expected_int = 7;
      for (int i = 7; i > -3; i--)
      {
      
         assertEquals(expected_int, sp.get_actual_size(i, arr));
      
      }
      
      for (int i = 8; i < 12; i++)
      {
      
         expected_int = i;
         assertEquals(expected_int, sp.get_actual_size(i, arr));
      
      }
   
   }
  
  /**  */
   // public static void main(String[] args)
   // { Test_for_Helper_functions tfhf = new Test_for_Helper_functions(); }
      
}