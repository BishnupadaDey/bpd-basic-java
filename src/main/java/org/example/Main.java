package org.example;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        printPattern(" * ",15);
    }

    private static void printPattern(String symbol, int row){
        for (int line=0;line<row;line++){
            for (int space=0; space<(row-line);space++){
                System.out.print(" ");
            }
            for (int ptrn=((row)-line);ptrn<=row;ptrn++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
