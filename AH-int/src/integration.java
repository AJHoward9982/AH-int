import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Andrew Howard
 * 
 *
 */

public class integration {

  static Boolean cont = true;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] arr = { 10, 42, 52, 14, 21 };
    
    int[][] arr2D = new int[3][3];

    Player player1 = new Player("Kyrie", 11, 25, 3, 4, 11, 3);
    Player player2 = new Player("Rondo", 9, 13, 7, 4, 8, 5);
    Player player3 = new Player("Shaq", 34, 20, 0, 7, 15, 4);

    ArrayList<Player> players = new ArrayList<Player>(); //Array List of Players

    players.add(player1);
    players.add(player2);
    players.add(player3);

    while (cont == true) {

      System.out.println("Select a letter: ");
      System.out.println("a: Run the data type demo");
      System.out.println("b: Show the stored players");
      System.out.println("c: Display a players' data");
      System.out
          .println("d: Input a number and it will be counted back to you");
      System.out.println("e: Array demo");
      System.out.println("f: HashMap demo");
      System.out.println("g: Operators demo");
      System.out.println("x: Experimental");
      System.out.println("Type 'Quit' to stop the program");

      String caseVal = scan.nextLine(); // Which case to run

      switch (caseVal) {

        case "a":
          dataDemo();
          break;

        case "b":
          System.out.println(player1.playerName);
          System.out.println(player2.playerName);
          System.out.println(player3.playerName);
          break;

        case "c":

          Iterator itr = players.iterator();
          while (itr.hasNext()) {
            Player player = (Player) itr.next();

            System.out.println(
                player.playerName + "'s number is " + player.pNumber + ".");
            System.out.println(
                player.playerName + " scored " + player.pScored + "points.");
            System.out.println(
                player.playerName + " had " + player.steals + " steals.");
            System.out.println(
                player.playerName + " had " + player.blocks + " blocks.");
            System.out.println(
                player.playerName + " had " + player.rebounds + " rebounds.");
            System.out.println(
                player.playerName + " had " + player.fouls + " fouls.");
            System.out.println("\n");
          }
          break;

        case "d":
          System.out.println("Enter a number:");

          int times = scan.nextInt();

          for (int i = 0; i < times; i++) {
            System.out.print(i + 1);
            if (i < (times - 1)) {
              System.out.print(" , ");
            }
          }
          break;

        case "e":

          sort(arr);

          System.out.println("\n" + "The sorted list is:");

          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
          }

          System.out.println("\n\nThe sum is " + sumClass(arr));
          
          //Add 2D Array
          
          System.out.println("\n" + arr2D[1][0]);

          break;

        case "f":
          hashMapDemo();
          break;

        case "g":
          operators();
          break;
         
        case "x":
          cont = false;
          gameAttempt();
          break;

        case "Quit":
          cont = false;
          break;

        default:
          System.out.println("Input error: Try again");
          break;

      }
      System.out.println("\n \n ");
      main(args);
    }

  }

  public static void dataDemo() {

    dataTypes dataTypesObject = new dataTypes();
    dataTypesObject.numbers();

  }
  
  public static void printGrid(char[][] grid ) {
    
    
    for(int i = 0; i < 5; i++) {
      
      for(int j = 0; j < 5; j++){
        System.out.print(grid[i][j]);
      }
      System.out.print("\n");
    }
    
  }
  
  public static void gameAttempt() {
    
	System.out.println("Move by typing w , a , s , or d then pressing enter. \n Type exit then press enter to stop running.");
	  
    char[][] grid = new char[5][5];
    for(int i=0 ; i < 5 ; i++) {
    	for(int j = 0; j < 5; j++) {
    		grid[i][j] = '.';
    		
    	}
    	
    }
    
    int score = 0;
    int posX = 2;
    int posY = 2;
    grid[posY][posX] = '0';
    printGrid(grid);
    
    boolean gameCont = true;
    while(gameCont == true) {
    	Scanner input = new Scanner(System.in);
    	String move = input.nextLine();
    	if (move.equals("w")&& posY > 0) {
    		grid[posY][posX] = '.';
    		posY--;
    		grid[posY][posX] = '0';
    		printGrid(grid);
    		
    		score++;
    		System.out.println(score);
    	}
    	if (move.equals("a") && posX > 0) {
    		grid[posY][posX] = '.';
    		posX--;
    		grid[posY][posX] = '0';
    		printGrid(grid);
    		
    		score++;
    		System.out.println(score);
    	}
    	if (move.equals("s") && posY < 4) {
    		grid[posY][posX] = '.';
    		posY++;
    		grid[posY][posX] = '0';
    		printGrid(grid);
    		
    		score++;
    		System.out.println(score);
    	}
    	if (move.equals("d") && posX < 4) {
    		grid[posY][posX] = '.';
    		posX++;
    		grid[posY][posX] = '0';
    		printGrid(grid);
    		
    		score++;
    		System.out.println(score);
    	}
    	if (move.equals("exit")) {
    		gameCont = false;
    		cont = true;
    	}
    	else {
    		printGrid(grid);
    		System.out.println(score);
    	}
    	
    			
    }
    
    
  }

  public static void hashMapDemo() {
    HashMap<Integer, Boolean> question = new HashMap<>();

    question.put(1, true);
    question.put(2, false);
    question.put(3, false);
    question.put(4, true);
    question.put(5, false);

    System.out.println("The answer to question one is " + question.get(1));
    System.out.println("The answer to question two is " + question.get(2));
    System.out.println("The answer to question three is " + question.get(3));
    System.out.println("The answer to question four is " + question.get(4));
    System.out.println("The answer to question five is " + question.get(5));

  }

  public static int add(int a, int b) {

    /*
     * A method to add 2 numbers together, "int a" and "int b" are parameters
     * for when the method is called.
     */

    int sumOpp = a + b;
    return sumOpp;
  }

  public static void operators() {
    boolean Value1 = (4 < 5);
    boolean Value2 = (4 == 5);
    System.out.println("Statement one that 4 < 5 is " + Value1);
    System.out.println("Statement two that 4 = 5 is " + Value2);
  }

  public static int sumClass(int[] arr) {

    int ans = 0;

    for (int i = 0; i < (arr.length); i++) {
      ans += arr[i];
    }
    return ans;
  }

  public static int[] sort(int[] arr) {
    for (int i = 0; i < (arr.length - 1); i++) {

      for (int j = 0; j < arr.length - 1 - i; j++) {

        if (arr[j] > arr[j + 1]) {

          int t = arr[j]; // Holds the value of "i+1" so that "i" can replace it

          arr[j] = arr[j + 1];

          arr[j + 1] = t;

        }

      }
    }

    return arr;
  }

  public static void demoMethods() {

    int num1 = 10;
    int num2 = 6;
    double result = (double) num1 / num2;

    System.out.println("Hello World! " + result);

    /*
     * demo of main calling a method, adding numbers concating strings, and
     * printing.
     */

    int n1n2 = add(num1, num2); // n1n2 is num1 + num2

    /*
     * This calls the previously mentioned "add" Method. "num1" and "num2" are
     * arguments that will fit into the "int a" and "int b" parameters of
     * add(int a, int b)
     */

    System.out.println("Adding 10 and 6 gives you " + n1n2);

  }

}
