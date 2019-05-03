package io.github.dalayach.Print_tools;

   /** Builds Strings using precalculated values and String.format(). Will also print output to console. */

   //TODO   - what if the arr is full of empty strings?
   //TODO   - 

class Build_strings extends Helper_functions
{

  /** Will hold the result of each output method. */
   private String result;
   
   /**
    * Simple set method for field this.result.
    * @param   new_value   holds the new value that this.result will be set to.
    */
   public void append_to_result(String new_value)
   { 
      this.result = this.result + new_value; 
   }
   
   /** Clears out this.result, replacing the old value with "". */
   public void clear_result()
   { this.result = ""; }

   /**
    * Will print and return a sequence of Strings that is center-justified. Each will be separated with borders
    * if the boolean parameter <code>borders</code> is true.
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   expected_size  int containing the expected_size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now center-justified
    */
   public String print_center_justified(boolean borders, int expected_size, String... messages)
   {
   
      clear_result();
      String temp_value = ""; //will hold the unfinished String that will be returned
      int right_buffer;
      int left_buffer;
      int actual_size = get_actual_size(expected_size, messages);
   
   
      for (String message : messages)
      {
      
         right_buffer   = get_buffer_size(actual_size, message.length());
         left_buffer   = actual_size - right_buffer;
         //remember, we have code to buffer the left side, or the right, but not both. THEREFORE, we have elected to
         //leave the code right-justified, which will mean the left will be buffered on its own, and we will
         //artificially buffer the right side, this.resulting in a center-justified format
      
         append_to_result(
            temp_value
            .concat(give_borders(borders))
            .concat(
               create_formatted_string(
                  left_buffer, 
                  right_buffer, 
                  message
               )
            ));
      
      }
      
      append_to_result(give_borders(borders));
      
      System.out.print(this.result);
      
      return this.result;
   
   }
   

   /**
    * Will print and return a sequemce of Strings that is center-justified and separated with borders.
    * 
    * @param   expected_size  int containing the expected_size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now center-justified with borders
    */
   public String print_center_justified(int expected_size, String... messages)
   {
      
      return print_center_justified(true, expected_size, messages);
   
   }
   

   /**
    * Will print and return a sequence of Strings that is left-justified. Each will be separated with borders
    * if the boolean parameter <code>borders</code> is true.
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   expected_size  int containing the expected_size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now left-justified
    */
   public String print_left_justified(boolean borders, int expected_size, String... messages)
   {
         
      clear_result();
      int actual_size = get_actual_size(expected_size, messages);
   
         
      for (String message : messages)
      {
      
         append_to_result(
            give_borders(borders)
            .concat(
               create_formatted_string(
                  0, 
                  actual_size, 
                  message
               )
            ));
      
      }
      
      append_to_result(give_borders(borders));
      
      System.out.print(this.result);
      
      return this.result;
         
   }
   
   /**
    * Will print and return a sequemce of Strings that is left-justified and separated with borders.
    * 
    * @param   expected_size  int containing the expected_size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now left-justified with borders
    */
   public String print_left_justified(int expected_size, String... messages)
   {
   
      return print_left_justified(true, expected_size, messages);
   
   }

   /**
    * Will print and return a sequence of Strings that is right-justified. Each will be separated with borders
    * if the boolean parameter <code>borders</code> is true.
    * 
    * @param   borders        boolean that is true if borders are to be included, and false if not. Note that borders
    *                            will add to the column width, so a sequence of Strings WITH borders will be longer
    *                            than a sequence of Strings WITHOUT borders.
    * @param   expected_size  int containing the expected_size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now right-justified
    */
   public String print_right_justified(boolean borders, int expected_size, String... messages)
   {
         
      clear_result();
      int actual_size = get_actual_size(expected_size, messages);
   
         
      for (String message : messages)
      {
               
         append_to_result(
            give_borders(borders)
            .concat(
               create_formatted_string(
                  actual_size, 
                  0,
                  message
               )
            ));         
      }
      
      this.result = this.result + give_borders(borders);
      
      System.out.print(this.result);
      
      return this.result;
   
   }
   
   /**
    * Will print and return a sequemce of Strings that is right-justified and separated with borders.
    * 
    * @param   expected_size  int containing the expected_size (given by the user, but we will check if it's correct)
    * @param   messages       sequence of Strings (or just a String array, depending how you wish to use it) that holds
    *                            the data to be printed out as a String
    * @return                 the newly created String that is now right-justified with borders
    */
   public String print_right_justified(int expected_size, String... messages)
   {
         
      return print_right_justified(true, expected_size, messages);
   
   
   }

}