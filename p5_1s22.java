import java.until.Scanner;

class p5_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String temp;
		int num1, num2;
		int resultado;

		System.out.println("ingresa primer numero:  ");
		temp = teclado.nextLine();
		num1 = Integer.parseInt(temp);
		System.out.println("ingresa el segundo numero:  ");
		temp = teclado.nextLine();
		num2 = Integer.parseInt(temp);
		resultado = num1 * num2;
		System.out.println("la multiplicacion es:" + resultado);
	}
}