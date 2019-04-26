package io.github.dalayach.Print_tools;

//TODO   Give option to choose border character(s) (ideally, allow there to be
//          a left and right variant, as well as a flip variant)
//TODO   Optimization on some of the for each loops
//TODO   Maybe make variables like expected_size and borders be instance
//          variables? And build a constructor() and a nextLine() using those
//          new class variables?
//TODO   Build/Complete JavaDoc for all

/**
 * This is the String_printer itself. This is the class to call if you wish to use the functions, and it will have all
 * the functionality of Build_strings, but with some aliases included to keep code compact.
 **/
public class String_printer extends Build_strings
{
   /** Creates a new String printer. */
   public String_printer() { }
   
   /**
    * Will print and return a sequence of Strings that is center-justified. Each will be separated with borders
    *    if the boolean parameter <code>borders</code> is true. This is an alias for print_center_justified().
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now center-justified
    * @see #print_center_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String print_c(boolean borders, int total, String... messages)
   {  
      
      return print_center_justified(borders, total, messages);
      
   }
   
   /**
    * Will print and return a sequence of Strings that is center-justified and separated by borders. This is an alias
    *    for print_center_justified().
    * 
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now center-justified
    * @see #print_center_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String print_c(int total, String... messages)  
   {  
      
      return print_center_justified(total, messages);
      
   }
   
   /**
    * Will print and return a sequence of Strings that is center-justified, followed by a newline character. Each will
    *    be separated with borders if the boolean parameter <code>borders</code> is true. The newline character at the
    *    end of the returned String will allow for cleaner code, especially when looping. This is an alias for 
    *    print_center_justified().
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now center-justified, followed by a newline character
    * @see #print_center_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String println_c(boolean borders, int total, String... messages)
   {  
      
      String result =  print_center_justified(borders, total, messages);
      System.out.println();
      
      return result + "\n";
      
   }
   
   /**
    * Will print and return a sequence of Strings that is center-justified, followed by a newline character, and
    *    separated by borders. Will include a newline character at the end of the returned String, allowing for cleaner
    *    code, especially when looping. This is an alias for print_center_justified().
    * 
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now center-justified, followed by a newline character
    * @see #print_center_justified(boolean borders, int expected_size, String... messages)
    */
   public String println_c(int total, String... messages)
   {
      
      String result = print_center_justified(total, messages);
      System.out.println();  
      
      return result + "\n";
      
   }
   
   /**
    * Will print and return a sequence of Strings that is left-justified. Each will be separated with borders
    *    if the boolean parameter <code>borders</code> is true. This is an alias for print_left_justified().
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now left-justified
    * @see #print_left_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String print_l(boolean borders, int total, String... messages)
   {  
      
      return print_left_justified(borders, total, messages);
      
   }
   
   /**
    * Will print and return a sequence of Strings that is left-justified and separated by borders. This is an alias
    *    for print_left_justified().
    * 
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now left-justified
    * @see #print_left_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String print_l(int total, String... messages)
   {
      
      return print_left_justified(total, messages);
      
   }
   
   /**
    * Will print and return a sequence of Strings that is left-justified, followed by a newline character. Each will be
    *    separated with borders if the boolean parameter <code>borders</code> is true. Will include a newline character
    *    at the end of the returned String, allowing for cleaner code, especially when looping. This is an alias for 
    *    print_left_justified().
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now left-justified, followed by a newline character
    * @see #print_left_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String println_l(boolean borders, int total, String... messages)  
   {
   
      String result =  print_left_justified(borders, total, messages);
      System.out.println();
      
      return result + "\n";
      
   }
   
   /**
    * Will print and return a sequence of Strings that is left-justified, followed by a newline character, and
    *    separated by borders. Will include a newline character at the end of the returned String, allowing for cleaner
    *    code, especially when looping. This is an alias for print_left_justified().
    * 
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now left-justified, followed by a newline character
    * @see #print_left_justified(boolean borders, int expected_size, String... messages)
    */
   public String println_l(int total, String... messages)
   {
   
      String result =  print_left_justified(total, messages);
      System.out.println();
      
      return result + "\n";
      
   }
   
   /**
    * Will print and return a sequence of Strings that is right-justified. Each will be separated with borders
    *    if the boolean parameter <code>borders</code> is true. This is an alias for print_right_justified().
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now right-justified
    * @see #print_right_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String print_r(boolean borders, int total, String... messages)  
   {  
      
      return print_right_justified(borders, total, messages);
      
   }
   
   /**
    * Will print and return a sequence of Strings that is right-justified and separated by borders. This is an alias
    *    for print_right_justified().
    * 
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now right-justified
    * @see #print_right_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String print_r(int total, String... messages)
   {  
      
      return print_right_justified(total, messages);
      
   }
   
   /**
    * Will print and return a sequence of Strings that is right-justified, followed by a newline character. Each will
    *    be separated with borders if the boolean parameter <code>borders</code> is true. Will include a newline
    *    character at the end of the returned String, allowing for cleaner code, especially when looping. This is an
    *    alias for print_right_justified().
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now right-justified, followed by a newline character
    * @see #print_right_justified(boolean borders, int expected_size, String... messages)
    */ 
   public String println_r(boolean borders, int total, String... messages)
   {
   
      String result =  print_right_justified(borders, total, messages);
      System.out.println();
      
      return result + "\n";
      
   }

   /**
    * Will print and return a sequence of Strings that is right-justified, followed by a newline character, and 
    *    separated by borders. Will include a newline character at the end of the returned String, allowing for cleaner
    *    code, especially when looping. This is an alias for print_right_justified().
    * 
    * @param   total          int containing the expected size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now right-justified, followed by a newline character
    * @see #print_right_justified(boolean borders, int expected_size, String... messages)
    */
   public String println_r(int total, String... messages)  
   {
   
      String result =  print_right_justified(total, messages);
      System.out.println();
      
      return result + "\n";
      
   }

}