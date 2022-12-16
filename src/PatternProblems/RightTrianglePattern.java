package PatternProblems;

//print below pattern
//*
//* *
//* * *
//* * * *
//* * * * *

public class RightTrianglePattern {

    public static void main(String [] args) {
        int n = 5;

        for(int i  = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
