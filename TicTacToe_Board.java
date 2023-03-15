public class TicTacToe_Board {

    public void printBoard(String[][] Board){
  
        System.out.println ("     |   |    ");
        System.out.println ("   " + Board[0][0] + " | " + Board[0][1] + " | " + Board[0][2] + "");
        System.out.println (" ----+---+---- ");
        System.out.println ("   " + Board[1][0] + " | " + Board[1][1] + " | " + Board[1][2] + "");
        System.out.println (" ----+---+---- ");
        System.out.println ("   " + Board[2][0] + " | " + Board[2][1] + " | " + Board[2][2] + "");
        System.out.println ("     |   |    ");
 
     }

     public void writeToBoard(String [][]Callista, String selectedSpot, String XOvalue){

        for(int c = 0; c < 3; c++){
            for(int i = 0; i < 3; i++)
            {
                if (Callista[c][i].equals(selectedSpot)){
                    Callista[c][i] = Callista[c][i].replace(selectedSpot, XOvalue);   
                    break;  
               }  
            }
        }
    } 
    
}
