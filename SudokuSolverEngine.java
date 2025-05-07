
public class SudokuSolverEngine {

   public static void main(String[] args) {
      // Here I have called my class `MySudokuBoard` if you named your class
      // differently, modify the line below to use your own class name
      MySudokuBoard board = new MySudokuBoard("boards/fast-solve.sdk");
      System.out.println("Initial board");
      System.out.println(board);
      System.out.println();

      if(!board.isValid()) {                                //checking if initial board is valid.
         System.out.println("Board is not valid!");
      } else if(board.isSolved()) {                         //checking if initial board is already solved.
         System.out.println("Board is already solved!");
      } else {                                              //solves board if both valid and incomplete.
         System.out.print("Solving board...");
         long start = System.currentTimeMillis();
         board.solve();
         long stop = System.currentTimeMillis();
         System.out.printf("SOLVED in %.3f seconds.\n", ((stop-start)/1000.0));
         System.out.println();
         System.out.println(board);
      }
      
   }
}

/* Sample output for very-fast-solve.sdk
  ----jGRASP exec: java -ea SudokuSolverEngine
 Initial board
 My Board:
 
 .34678912
 .72195348
 198342567
 ..9.61423
 .26853791
 .13924.56
 .61537284
 .8.419635
 345.86179
 
 
 Solving board...SOLVED in 0.726 seconds.
 
 My Board:
 
 534678912
 672195348
 198342567
 859761423
 426853791
 713924856
 961537284
 287419635
 345286179
 
 
  ----jGRASP: Operation complete.
  
Sample output for fast-solve.sdk
  
     ----jGRASP exec: java -ea SudokuSolverEngine
 Initial board
 My Board:
 
 827154396
 965.27148
 3416.9752
 .........
 .........
 61897.435
 786235.14
 1547968.3
 23984....
 
 
 Solving board...SOLVED in 3.800 seconds.
 
 My Board:
 
 827154396
 965327148
 341689752
 472513689
 593468271
 618972435
 786235914
 154796823
 239841567
 
 
  ----jGRASP: Operation complete.
  
Sample output with col-violation.sdk

     ----jGRASP exec: java -ea SudokuSolverEngine
 Initial board
 My Board:
 
 9........
 .........
 6........
 .........
 4........
 3........
 .........
 9........
 .........
 
 
 Board is not valid!
 
  ----jGRASP: Operation complete.

Sample output with valid-complete.sdk
  
     ----jGRASP exec: java -ea SudokuSolverEngine
 Initial board
 My Board:
 
 534678912
 672195348
 198342567
 859761423
 426853791
 713924856
 961537284
 287419635
 345286179
 
 
 Board is already solved!
 
  ----jGRASP: Operation complete.
 
   
  */