package _9_lukduf_SemestralProject;

import java.util.Scanner;

public class ChristmasTask {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean end = false;
        int sirka = 12;
        int kmen = 2;
        //ChristmasTreePart1B(12, 2);
        //ChristmasTreePart2(12);
        //NeedChristamsTree();
        //ChristmasEnd(13);

        
        //((answer = sc.next().charAt(0)) == 'a');
        do {

            displayMenu();
            int choice = sc.nextInt(); //lokalni promenna
            switch (choice) {
                case 0:
                    end = true;
                    break;
                case 1:
                    System.out.println("Cert");
                    NeedChristamsTree();
                    System.out.println("Musis najit vanocni strom");
                    break;
                case 2:
                    System.out.println("Jake chces aby mel rozmery");
                    System.out.println("Zadej sirku stromu a vysku kmene");
                    sirka = sc.nextInt();
                    kmen = sc.nextInt();
                    System.out.println("Tenhle vypada dobre");
                    ChristmasTreePart1B(sirka, kmen);
                    System.out.println("Urizni ho");
                    System.out.println("");

                    break;
                case 3:
                    System.out.println("Vyborne");
                    ChristmasTreePart2(sirka);
                    System.out.println("Ted ho staci odnest");
                    System.out.println("");
                    break;
                case 4:   
                    System.out.println("Šťastné a veselé vánoce");
                    ChristmasEnd(sirka);
                    System.out.println("Šťastné a veselé vánoce");
                    end = true;
                    break;
            }
        } while (!end);
    }

    private static void displayMenu() {
        System.out.println("*******************************************");
        System.out.println("*   Vanocni hra - sezen vanocni stromek   *");
        System.out.println("*        Vyber kapitol (zacni od 1)       *");
        System.out.println("* 1.Tvuj ukol                             *");
        System.out.println("* 2.Hledani vanocniho stromku             *");
        System.out.println("* 3.Urizni vanocni stromek                *");
        System.out.println("* 4.Vanocni stromek doma                  *");
        System.out.println("* 0. konec                                *");
        System.out.println("*******************************************");
    }

    public static void ChristmasTreePart1A(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                 if (i==0 && j==0) {
                    System.out.print("* ");
                }else{
                  System.out.print(". ");   
                 }
                

            }
            System.out.println("");
        }
    }

    public static void ChristmasTreePart1B(int n, int a) {
        ChristmasTreePart1A(n);
        if (n / 2 == 0) {
            n++;
        }
        for (int vyska = 1; vyska <= a; vyska++) {       //vyska kmene
            for (int sirka = 0; sirka <= n; sirka++) {
                if (sirka == (n - 2)) {
                    System.out.print("| |");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            System.out.print("''");
        }
        System.out.println("");
    }

    public static void ChristmasTreePart2(int n) {
        n /= 2;
        int vyska, sirka, radek = n;
        for (vyska = 0; vyska <= radek; vyska++) {
            for (sirka = 0; sirka <= vyska; sirka++) {

                if (sirka < 1) {
                    System.out.print("   ");

                } else {
                    System.out.print("   * ");
                }
            }
            System.out.println("");
        }
        System.out.println("|^^|");
        System.out.print("|  |");
        for (int i = 0; i < n; i++) {
            System.out.print("''''''");
        }
        System.out.println("");

    }

    public static void NeedChristamsTree() {
        System.out.println("    }_{  ( | ) ");
        System.out.println("   (*.*) |_|_| ");
        System.out.println("     |     |   ");
        System.out.println(" ----|-----|   ");
        System.out.println("     |     |   ");
        System.out.println("   |-^-|   |   ");
        System.out.println("   |   |   |   ");
        System.out.println("   |   |   |   ");

    }

    public static void ChristmasEnd(int m) {
        ChristmasTreePart1A(m);
        System.out.println("        Dárky");
        int n = 12;
        int a = n / 2;
        int b = n - 1;

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (j == (b - 1) / 2) {
                    System.out.print("  ");
                } else if (i == 1 || i == a || j == 0 || j == b || j == (b / 2) - 1 || j == (b / 2) + 1 || i == (a / 2) + 1 || j == (b / 4) || j == b - b / 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }

}
