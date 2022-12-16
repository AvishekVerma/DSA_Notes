package PatternProblems;

import javax.annotation.processing.SupportedSourceVersion;

//        1
//        1 2
//        1 2 3
//        1 2 3 2
//        1 2 3 2 1
public class rightTraingleWithNum {

    public static void main(String [] args) {
        int n = 7;

        for(int i = 0; i < n; i++) {
            int k = n / 2;
            for(int j = 1; j <= i + 1; j++){
                if(j <= n / 2 + 1) {
                    System.out.print(j + " ");
                }else{
                    System.out.print(k + " ");
                    k--;
                }
            }
            System.out.println();
        }
    }
}
