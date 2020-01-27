public class Main {
    public static void main(String[] args) {

        //PRINT ROWS AND COLUMNS
        int[][] rowsAndColumns = new int[5][10];

        for(int i=0; i<10; i++){
            for(int j=0; j<5; j++){
                System.out.print("row "+i+" col "+j+" ");
            }
            System.out.println();
        }


        //MULTIPLICATION TABLE
        int[][] multip = new int[12][12];

        for(int i=1; i<=multip.length; i++){
            for(int j=1; j<=multip.length; j++){
                System.out.print(i*j);
                System.out.print('\t');
            }
            System.out.println();
        }

    }


}
