package ud2ED;

public class Ejercicio_1 {
	// n pasa a valer 5 ->
	// sum vale 0
	//i vale 1
	// Pantalla lo que pasa es que te imprime el resultado de los de n
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
		sum += i;
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
		}

	}

