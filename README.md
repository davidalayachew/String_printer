# String_printer

#### A simple tool that will help with simplifying the output of code.

**Allows you to organize output into a left/right/center justiifed output, separated with borders (soon to be with your choice of border character), and prints out in a clean and neat format.**

#### Use case below. You can also run the String_printer to see the same thing!

```
/**
 *  you can also replace any of the "print_" commands with "println_" to allow for easy looping 
 *
 *  the parameters in order are
 *	boolean 	- do you want borders?
 *	int		- how big is each column? (not including borders)
 *	String...	- Strings to be used (Arrays are acceptable too)
 */

String_printer sp = new String_printer();

//Left justified
sp.print_l(true, 20, "ace", "ventura", "show");       = |ace                 |ventura             |show                |
sp.print_l(false, 20, "ace", "ventura", "show");      = ace                 ventura             show                

//Right justified
sp.print_r(true, 20, "ace", "ventura", "show");       = |                 ace|             ventura|                show|
sp.print_r(false, 20, "ace", "ventura", "show");      =                  ace             ventura                show

//Center justified
sp.print_c(true, 20, "ace", "ventura", "show");       = |        ace         |      ventura       |        show        |
sp.print_c(false, 20, "ace", "ventura", "show");      =         ace               ventura               show        



/* For easy printing in for loops, use the "println_" version instead of "print_" */
/* Future examples will use the ln version. */



/* Arrays work too! */

String arr[] = {"ace", "ventura", "show"};

sp.println_c(true, 20, "ace", "ventura", "show");     = |        ace         |      ventura       |        show        |
sp.println_c(true, 20, arr);                          = |        ace         |      ventura       |        show        |



/* You can control the size of each column too! */

sp.println_c(true, 20, arr);                          = |        ace         |      ventura       |        show        |
sp.println_c(true, 10, arr);                          = |   ace    | ventura  |   show   |

/* If the size parameter is too small, all columns (FOR THAT ROW ONLY) will automatically extend to the size of the WIDEST COLUMN */

sp.println_c(true, 20, arr);                          = |        ace         |      ventura       |        show        |
sp.println_c(true, 10, arr);                          = |   ace    | ventura  |   show   |
sp.println_c(true, 5, arr);                           = |  ace  |ventura| show  |
sp.println_c(true, 3, arr);                           = |  ace  |ventura| show  |
sp.println_c(true, 1, arr);                           = |  ace  |ventura| show  |
sp.println_c(true, 0, arr);                           = |  ace  |ventura| show  |
sp.println_c(true, -1, arr);                          = |  ace  |ventura| show  |



/* Overloaded version of the function WITHOUT the border check. Basically, it gives borders without asking you. */

sp.println_c(true, 20, "ace", "ventura", "show");     = |        ace         |      ventura       |        show        |
sp.println_c(true, 20, arr);                          = |        ace         |      ventura       |        show        |
sp.println_c(20, arr);                                = |        ace         |      ventura       |        show        |


/* All of the above methods are the short hand aliases. Of course, if you would like to use the longer names, that is fine too! */


sp.println_c(20, arr);                                = |        ace         |      ventura       |        show        |
sp.print_center_justified(20, arr);                   = |        ace         |      ventura       |        show        |
/**
 * PLEASE BE AWARE -- the longer versions (currently) don't allow for 'ln' functionality, so
 * if you would like that, either add it in yourself, or stick to the short hand functions.
 */

```

**--Built to assist output of** `WOT_PlayerComp_V1`

###### *Honestly, I'm building this software so I can learn how to deploy on maven...  Who knows if anything I did here is right :P*


