public class Main {
    public static void main(String[] args) {

        //PRINT ROWS AND COLUMNS
        String[][] rowsAndColumns = new String[5][10];

        for(int row=0; row<10; row++){
            for(int col=0; col<5; col++){
                rowsAndColumns[col][row] = ("row "+row+" col "+col+" ");
                System.out.print(rowsAndColumns[col][row]);
            }
            System.out.println();
        }


        //MULTIPLICATION TABLE
        int[][] multip = new int[12][12];

        for(int i=0; i<multip.length; i++){
            for(int j=0; j<multip.length; j++){
                multip[j][i] = (j+1)*(i+1);
                System.out.print(multip[j][i]);
                System.out.print('\t');

            }
            System.out.println();
        }

    }


}
