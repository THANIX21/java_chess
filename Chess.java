import java.util.*;

public class Chess {

     public static void main(String args[]) {

          String[][][] board = new String [8][8][100];
          Board ini = new Board();
          board = ini.setup();
          String line = new String();

          for (int y = 0; y < 8; y++ ){

               line = "";

               for (int x = 0; x < 8; x++ ){

                    line = line + board[x][y][0];
               }

               System.out.println(line);
          }
     }
}
