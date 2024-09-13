
/*
ctrl + d - duplikacja
ctrl + x -wycina linie kodu
ctrl + alt + l - formatowanie kodu
alt + enter
alt + ins
ctrl + alt + v
ctrl + F6
shift + f6 - refaktoryzacja
psvm - metoda uruchomieniowa
sout -systen.out.println();
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int variably123 = 45;
        System.out.println(variably123);
        System.out.println("");
        System.out.printf("");
        //    Scanner scanner = new Scanner(System.in)
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj jakas liczbe");
        int var2 = scanner.nextInt();

        Test test1 = new Test();

        System.out.println(var2 + variably123);




    }

}