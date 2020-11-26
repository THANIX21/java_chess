import java.util.*;

public class Board{

     public String[][][] setup(){

          String[][][] theBoard = new String [8][8][100];

          for (int z = 0; z < 100; z++){

               for (int y = 0; y < 8; y++ ){

                    for (int x = 0; x < 8; x++ ){

                         theBoard[x][y][z] = ".";
                    }
               }
          }

          theBoard[0][0][0] = "r";
          theBoard[7][0][0] = "r";
          theBoard[1][0][0] = "n";
          theBoard[6][0][0] = "n";
          theBoard[2][0][0] = "b";
          theBoard[5][0][0] = "b";
          theBoard[3][0][0] = "q";
          theBoard[4][0][0] = "k";
          theBoard[0][7][0] = "R";
          theBoard[7][7][0] = "R";
          theBoard[1][7][0] = "N";
          theBoard[6][7][0] = "N";
          theBoard[2][7][0] = "B";
          theBoard[5][7][0] = "B";
          theBoard[3][7][0] = "Q";
          theBoard[4][7][0] = "K";

          for (int p = 0; p < 8; p++){
               theBoard[p][1][0] = "p";
               theBoard[p][6][0] = "P";
          }

          return theBoard;
     }
}
