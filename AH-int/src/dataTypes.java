
public class dataTypes { 
	
	/*Using the public header on both this class and the method
	Allow it to be used in the main method in my integration project
	by using a call*/
	
	public void numbers(){
		
		/*The following are variables which are positions in memory that can store Data
		The data stored is defined by the type of variable such as "byte , short , int, etc"
		These variables can then be used by opperators and other lines of code to manipulate
		and use them.*/
		
		byte A = 5;  //8 bit number storage
		short B = 32000; //16 bit number storage
		int C = 9999999; //32 bit number storage
		long D = 10000000; //64 bit number storage
		float E = (float) 1.412; //stores floating pint numbers, less accurate than double
		double F = (double) 1.43235; //accurate storage of decimals. Used commonly for money
		boolean G = true & false; //boolean logic storage    true/false
		char H = 'A' ;
		int[] array = new int[5]; //An array stores a fixed amount of the same data type
		for (int arrInt = 0; arrInt < 5; arrInt++) {
			array[arrInt]= arrInt + 1;
		}
		
		String I = "A string is a complex data type";
		
		System.out.println( A );
		System.out.println( B );
		System.out.println( C );
		System.out.println( D );
		System.out.println( E );
		System.out.println( F );
		System.out.println( G );
		System.out.println( H );
		System.out.println( I );
		System.out.println( "Array position 5 is " + array[4] );
		System.out.println( "Position 3 is " + array[2] );
	}
	
}
