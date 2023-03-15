import java.util.Scanner;

public class AttemptIG {

    public static boolean isWinner(String [][] Callista){
        String tripleX = "XXX";
        String tripleO = "OOO";
        
       String Combo1 = (Callista [0][0] + Callista [0][1] + Callista [0][2]);
        if(Combo1.equals(tripleX) || Combo1.equals(tripleO))
        { return true;}

       String Combo2 = (Callista [0][0] + Callista [1][1] + Callista [2][2]);
        if(Combo2.equals(tripleX) || Combo2.equals(tripleO))
        { return true;}

       String Combo3 = (Callista [0][0] + Callista [1][0] + Callista [2][0]);
        if(Combo3.equals(tripleX) || Combo3.equals(tripleO))
        { return true;}

       String Combo4 = (Callista [0][1] + Callista [1][1] + Callista [2][1]);
        if(Combo4.equals(tripleX) || Combo4.equals(tripleO))
        { return true;}

       String Combo5 = (Callista [0][2] + Callista [1][1] + Callista [2][0]);
        if(Combo5.equals(tripleX) || Combo5.equals(tripleO))
        { return true;}

       String Combo6 = (Callista [0][2] + Callista [1][2] + Callista [2][2]);
        if(Combo6.equals(tripleX) || Combo6.equals(tripleO))
        { return true;}

       String Combo7 = (Callista [1][0] + Callista [1][1] + Callista [1][2]);
        if(Combo7.equals(tripleX) || Combo7.equals(tripleO))
        { return true;}

       String Combo8 = (Callista [2][0] + Callista [2][1] + Callista [2][2]);
        if(Combo8.equals(tripleX) || Combo8.equals(tripleO))
        { return true;}

        return false;      
   }

    public static boolean isX(boolean T){
        return !T;
    }


    public static void main(String[] args){  
        TicTacToe_Board board = new TicTacToe_Board();

        Boolean boardValue = true;
        String[][] Callista = {{"1", "2", "3"}, { "4", "5", "6"}, {"7", "8", "9"}};

        System.out.println ();
        System.out.println ("WELCOME TO CALLISTA'S TTT (Tic Tac Toe) GAME!!!");
        System.out.println ();
        System.out.println ("     |   |    ");
        System.out.println ("   1 | 2 | 3  ");
        System.out.println (" ----+---+---- ");
        System.out.println ("   4 | 5 | 6  ");
        System.out.println (" ----+---+---- ");
        System.out.println ("   7 | 8 | 9  ");
        System.out.println ("     |   |    ");
        System.out.println ();
        System.out.println ("First player is X, Second player is O.");
        System.out.println ();
        
        int n = 0;
        boolean won = false;
        Scanner user = new Scanner(System.in);
        while (n < 9 && won == false){
            System.out.println ("\nPlease select an available number on the board.\n");
            int selectedNumber = user.nextInt();
            while(selectedNumber > 9 || selectedNumber < 0)
            {
                System.out.println ("\nPlease select an available number on the board.\n");
                selectedNumber = user.nextInt();
            }

            String selectedSpot = Integer.toString(selectedNumber);

            if (boardValue){
               board.writeToBoard(Callista, selectedSpot, "X"); //writeToBoard(Callista, selectedSpot, "X");
               board.printBoard(Callista);

                if (isWinner(Callista) == true){
                    won = true;
                    System.out.println("\nYAY!! The winner is X's!\n");
                    break;
                }
                else{
                    boardValue = isX(boardValue); 
                }            
            }                
            else{
                board.writeToBoard(Callista, selectedSpot, "O");
                //writeToBoard(Callista, selectedSpot, "O");
                board.printBoard(Callista);

                if (isWinner(Callista) == true){
                    won = true;
                    System.out.println("\nYAY!! The winner is O's!\n");
                    break;
                }
                else{
                    boardValue = isX(boardValue);   
                }
            }
        n++;
        }
        if(won == false){
            System.out.println("\n***** Congrats to both teams! It's a draw! *****\n");
        }
        
    user.close();
    }
}
