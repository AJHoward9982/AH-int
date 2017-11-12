
/**
 * Andrew Howard
 * 
 *
 */

public class integration {

	
	public static void main(String[] args) {
		
		Boolean cont = true; //Continue running
		
		Player player1 = new Player("Kyrie" , 11 , 25 , 3 , 4 , 11 , 3);
		Player player2 = new Player("Rondo" , 9 , 13 , 7 , 4 , 8 , 5);
		Player player3 = new Player("Shaq" , 34 , 20 , 0 , 7 , 15 , 4);
		
		ArrayList<Player> players = new ArrayList<Player>(); //Array List of Players
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		
		if (cont) {
			
			String caseVal = scan.nextLn(); //Which case to run
			
			System.out.println("Select a letter: ");
			System.out.println("a: Run the data type demo");
			System.out.println("b: Show the stored players");
			System.out.println("c: Display a players' data");
			System.out.println("Type 'Quit' to stop the program");
			
			switch (caseVal) {
				
			case "a" : 
				dataDemo();
				break;
			case "b" : 
				System.out.println( player1.pName );
				System.out.println( player2.pName );
				System.out.println( player3.pName );
				break;
				
				
			}
		}
		

		/*
		Player kIrving = new Player();
		kIrving.playerName = "Kyrie Irving";
		kIrving.pNumber = 11;
		kIrving.pScored = 25;
		kIrving.steals = 3;
		kIrving.blocks = 4;
		kIrving.rebounds = 11;
		kIrving.fouls =	3;
		*/
	}
	
	public static void dataDemo() {
		
		dataTypes dataTypesObject = new dataTypes();
		dataTypesObject.numbers();
		
		
	}
	
	public static int add(int a , int b) {
		
		/*A method to add 2 numbers together, "int a" and "int b" are parameters
		for when the method is called.*/
		
		int sum = a + b;
		return sum;
	}
	
	public static void demoMethods() {
		
		int num1 = 10;
		int num2 = 6;
		double result = (double) num1 / num2;
				
		System.out.println("Hello World! " + result ); 
		
		/*demo of main calling a method, adding numbers 
		concating strings, and printing.*/
		
		int n1n2 = add( num1 , num2); //n1n2 is num1 + num2
		
		/*This calls the previously mentioned "add" Method. "num1" and "num2" are arguments
		that will fit into the "int a" and "int b" parameters of add(int a, int b)*/
		
		System.out.println( "Adding 10 and 6 gives you " + n1n2 );
	
	}
	
}
 