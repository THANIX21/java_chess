import java.util.Arrays;
import java.util.Scanner;

public class board{

     private String[][][] setup(){

          String[][][] theBoard = new String [8][8][100];

          for (int x = 0; x < 8; x++ ){
               for (int y = 0; y < 8; y++ ){
                    theBoard[x][y][0] = ".";
               }
          }

          /*
          theBoard[0][0][0] = "r";
          theBoard[7][0][0] = "r";
          theBoard[1][0][0] = "n";
          theBoard[6][0][0] = "n";
          theBoard[2][0][0] = "b";
          theBoard[5][0][0] = "b";
          theBoard[3][0][0] = "q";
          theBoard[4][0][0] = "k";
          */

          return theBoard;
     }

}
