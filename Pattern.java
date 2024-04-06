public class Pattern {
        public static void main(String[] args){
            int rows = 10;
            int i,j;
            for ( i =0; i<rows; i++){
                if(i == 0|| i == 1){
                    for ( j =0; j<1 ;j++){
                        System.out.print("* ");
                    }
                } else if (i == 2 || i == 6 || i==7||i==8) {
                    for (j =0;j<=2;j++){
                        System.out.print("* ");
                    }
                } else if (i == 3 || i == 4) {
                    for( j =0 ;j<=1 ;j++){
                        System.out.print("* ");
                    }
                } else if (i == 5) {
                    for ( j =0 ; j<=5;j++){
                        System.out.print("* ");
                    }
                } else if (i == 9) {
                    for (j =0;j<=8;j++){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

        }
}
