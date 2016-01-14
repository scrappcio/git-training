
public class JavaAlgorithms {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {

	        // Jeœli podzielne przez 3 i 5

	        if( ((i % 3) == 0) && ((i % 5) == 0) ) {

	            System.out.println("FizzBuzz");

	        }

	        // Jeœli podzielne tylko przez 3

	        else if( (i % 3) == 0 ) {

	            System.out.println("Fizz");

	        }

	        // Jeœli podzielne przez 5

	        else if( (i % 5) == 0 ) {

	            System.out.println("Buzz");

	        }

	        // Jeœli nie podzielne ani przez 5 ani przez 3

	        else {

	            System.out.println(i);

	        }

	    }
	}
}
