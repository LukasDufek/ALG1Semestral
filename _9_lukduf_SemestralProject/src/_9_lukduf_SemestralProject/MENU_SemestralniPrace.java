
package _9_lukduf_SemestralProject;

import _9_lukduf_SemestralProject.ChristmasTask;
import java.util.Scanner;


public class MENU_SemestralniPrace {

   public static Scanner sc = new Scanner (System.in);
   
    public static void main(String[] args) {
       int choice; 
       char answer;
       boolean end = false;
       
       
        do{

        System.out.println("*******************************");
        System.out.println("*   Moje semestralni prace    *");
        System.out.println("*        Vyber si ulohu       *");
        System.out.println("* 1.Semestralni prace         *");
        System.out.println("* 2.Vanocni uloha             *");
        System.out.println("*******************************");
         
        choice=sc.nextInt();
        
        if(choice==1){
            SemestralniPrace.main(args);
        }
        
        if (choice==2){
            ChristmasTask.main(args);
        }
        
        
       
        System.out.println("Chces pokracovat?");
            answer = sc.next().charAt(0);
            if(answer=='n' || answer == 'N'){
              end =true;
          }
        
    } while(!end);
    }
}
