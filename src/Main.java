public class Main {
    //print rows (1-10)
    //print columns (1-5)

    public static void main(String[] args) {
//
//        // array of gender, major, state, score
//        String[][] studentGradebook = new String[100][4];
//
//        studentGradebook[0][0] = "M";
//        studentGradebook[0][1] = "Econ";
//        studentGradebook[0][2] = "MD";
//        studentGradebook[0][3] = "99";
//
//        studentGradebook[1][0] = "F";
//        studentGradebook[1][1] = "Mktg";
//        studentGradebook[1][2] = "VA";
//        studentGradebook[1][3] = "89";
//
//        studentGradebook[2][0] = "F";
//        studentGradebook[2][1] = "Biol";
//        studentGradebook[2][2] = "NJ";
//        studentGradebook[2][3] = "100";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Student "+i+'\t');
//            for (int j = 0; j < 4; j++) {
//                System.out.print(studentGradebook[i][j] + '\t');
//            }
//            System.out.println();
//        }
//    }

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
