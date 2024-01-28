import java.util.Scanner;

public class Main {
	private Calculadora calculadora;
	private Scanner scanner;

	public Main() {
		this.calculadora = new Calculadora();
		this.scanner = new Scanner(System.in);
	}

	public void ejecutarCalculadora() {
		int primerValor = solicitarEntero("Ingrese el primer valor: ");
		int segundoValor = solicitarEntero("Ingrese el segundo valor: ");
		char operacion = solicitarOperacion();
		int resultado = realizarOperacion(primerValor, segundoValor, operacion);
		mostrarResultado(resultado);
	}

	private int solicitarEntero(String mensaje) {
		System.out.print(mensaje);
		return scanner.nextInt();
	}

	private char solicitarOperacion() {
		System.out.print("Ingrese la operación (+, -, *, /): ");
		return scanner.next().charAt(0);
	}

	private int realizarOperacion(int primerValor, int segundoValor, char operacion) {
		switch (operacion) {
		case '+':
			return calculadora.sumar(primerValor, segundoValor);
		case '-':
			return calculadora.restar(primerValor, segundoValor);
		case '*':
			return calculadora.multiplicar(primerValor, segundoValor);
		case '/':
			return (int) calculadora.dividir(primerValor, segundoValor);
		default:
			System.out.println("Operación no válida.");
			return 0;
		}
	}

	private void mostrarResultado(int resultado) {
		System.out.println("Resultado: " + resultado);
		if (resultado < 0) {
			System.out.println("Ten cuidado, el resultado es negativo.");
		}
		if (resultado > 0 && resultado < 10000) {
			System.out.println("Resultado dentro de los límites.");
		} else if (resultado > 10000) {
			System.out.println("Error resultado muy grande.");
		}
	}

	public static void main(String[] args) {
		int contador = 0;
		while (contador < 5) {
			Main programa1 = new Main();
			programa1.ejecutarCalculadora();
			contador++;
		}
	}
}
