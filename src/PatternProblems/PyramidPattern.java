package PatternProblems;
// Pyramid Pattern
//        *
//       **
//      ***
//      ****
public class PyramidPattern {

    public static void main(String [] args) {
        int n = 5;

        for(int i = 0; i < n; i++) {
            int m = 0;
            if((n - i) % 2 != 0){
                m = (n - i) / 2 + 1;
            }else{
                m = (n - i) / 2 + 1;
            }
            for(int j = 0; j < m ; j++) {
                System.out.print(" ");
            }

            for(int l = 0; l <= i; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
