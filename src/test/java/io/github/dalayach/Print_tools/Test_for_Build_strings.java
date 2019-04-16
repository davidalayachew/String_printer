package io.github.dalayach.Print_tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for String_printer
 */

public class Test_for_Build_strings
{

   Build_strings bs = new Build_strings();
   String expected_string;
   String arr[] = {"ace", "ventura", "show"};
   int expected_int;

   @Test public void test_check_expected_string_size_is_accurate()
   {
   
      System.out.println("\n");
      expected_string = "|        ace         |      ventura       |        show        |";
      assertEquals(expected_string, bs.print_c(true, 20, arr));
      System.out.println();
      
      expected_string = "|   ace    | ventura  |   show   |";
      assertEquals(expected_string, bs.print_c(true, 10, arr));
      System.out.println();  
      
      expected_string = "|  ace  |ventura| show  |";
      assertEquals(expected_string, bs.print_c(true, 5, arr));
      System.out.println();  
      
      expected_string = "|  ace  |ventura| show  |";
      assertEquals(expected_string, bs.print_c(true, 3, arr));
      System.out.println();  
      
      expected_string = "|  ace  |ventura| show  |";
      assertEquals(expected_string, bs.print_c(true, 1, arr));
      System.out.println();  
      
      expected_string = "|  ace  |ventura| show  |";
      assertEquals(expected_string, bs.print_c(true, 0, arr));
      System.out.println();  
      
      expected_string = "|  ace  |ventura| show  |";
      assertEquals(expected_string, bs.print_c(true, -1, arr));
      System.out.println();   
   
   }
   
   @Test public void test_get_actual_size()
   {
   
      expected_int = 7;
      for(int i = 7; i > -3; i--)
      {
      
         assertEquals(expected_int, bs.get_actual_size(i, arr));
      
      }
      
      for(int i = 8; i < 12; i++)
      {
      
         expected_int = i;
         assertEquals(expected_int, bs.get_actual_size(i, arr));
      
      }
   
   }


}