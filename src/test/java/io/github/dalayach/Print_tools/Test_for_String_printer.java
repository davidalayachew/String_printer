package io.github.dalayach.Print_tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Test_for_String_printer 
{

   @Test
   public void still_learning_how_to_test()
   {
   
      String_printer sp = new String_printer();
      String expected = "|        ace         |      ventura       |        show        |\n";
      assertEquals(expected, sp.println_c(true, 20, "ace", "ventura", "show"));
   
   }
}
