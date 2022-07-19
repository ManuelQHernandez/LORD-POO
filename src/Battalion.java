import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Battalion {
     public static void main(String[] args) {


          Scanner sn = new Scanner(System.in);

          System.out.println("Choose Characters: ");

          printMenu();

         System.out.println();

          int option1 = 0, option2 = 0;

          System.out.println("Choose Heroe:");
          option1 = sn.nextInt();

          System.out.println("Choose Beast:");
          option2 = sn.nextInt();

          Character pheroe1, pheroe2, pheroe3, pbeast1, pbeast2;

          if (option1 == 0 && option2 == 0) {
               pheroe1 = new Elves();
               pbeast1 = new Orco();
               startFight(pheroe1, pbeast1);
          } else if (option1 == 0 && option2 == 1) {
               pheroe1 = new Elves();
               pbeast2 = new Trasgo();
               startFight(pheroe1, pbeast2);
          } else if (option1 == 1 && option2 == 0) {
                pheroe2 = new Hobbit();
                pbeast1 = new Orco();
               startFight(pheroe2, pbeast1);
          } else if (option1 == 1 && option2 == 1) {
                pheroe2 = new Hobbit();
                pbeast2 = new Trasgo();
               startFight(pheroe2, pbeast2);
          } else if (option1 == 2 && option2 == 0) {
                pheroe3 = new Human();
                pbeast1 = new Orco();
               startFight(pheroe3, pbeast1);
          } else if (option1 == 2 && option2 == 1) {
                pheroe3 = new Human();
                pbeast2 = new Trasgo();
               startFight(pheroe3, pbeast2);
          }

     }


     private static void startFight(Character c1, Character c2) {


          ArrayList<Character> characters = new ArrayList<>(Arrays.asList(c1, c2));

             System.out.println("Battle has started!!");

             if (characters.get(0).isAlive()) {

                  System.out.println(characters.get(0).getClass().getName() + "  WON!!");
             } else {
                  System.out.println(characters.get(1).getClass().getName() + "  WON!!");
             }
     }

     public static void printMenu() {
          System.out.println("** Heroes **");
          System.out.println("*** 0 - Elves *** ");
          System.out.println("*** 1 - Hobbit *** ");
          System.out.println("*** 2 - Human *** ");

          System.out.println("*** Beast ***");
          System.out.println("*** 0 - Orco *** ");
          System.out.println("*** 1 - Trasgos *** ");

     }

}
