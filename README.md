# String_printer

#### A simple tool that will help with simplifying the output of code.

#### Allows you to organize output into a left/right/center justiifed output, separated with borders (soon to be with your choice of border character), and prints out in a clean and neat format.

#### Use case below. You can also run the String_printer to see the same thing!

```

String_printer sp = new String_printer();

sp.println_c(true, 20, "ace", "ventura", "show");   = |        ace         |      ventura       |        show        |
sp.println_c(false, 20, "ace", "ventura", "show");  =         ace               ventura               show
sp.print_c(true, 20, "ace", "ventura", "show");     = |        ace         |      ventura       |        show        |
sp.print_c(false, 20, "ace", "ventura", "show");    =         ace               ventura               show
sp.println_l(true, 20, "ace", "ventura", "show");   = |ace                 |ventura             |show                |
sp.println_l(false, 20, "ace", "ventura", "show");  = ace                 ventura             show
sp.print_l(true, 20, "ace", "ventura", "show");     = |ace                 |ventura             |show                |
sp.print_l(false, 20, "ace", "ventura", "show");    = ace                 ventura             show
sp.println_r(true, 20, "ace", "ventura", "show");   = |                 ace|             ventura|                show|
sp.println_r(false, 20, "ace", "ventura", "show");  =                  ace             ventura                show
sp.print_r(true, 20, "ace", "ventura", "show");     = |                 ace|             ventura|                show|
sp.print_r(false, 20, "ace", "ventura", "show");    =                  ace             ventura                show

```

#### --Built to assist output of WOT_PlayerComp_V1

###### *Honestly, I'm building this software for simplicity and to learn how to deploy on maven... :P*


