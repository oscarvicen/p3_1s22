import java.util.Scanner;
public class p2p1_1s22{
	public static void main(String[] args) {
		String operacion;
		int num1, num2;
		int resultado;
		int opc = 1;
		switch(opc){
		case 1:
			System.out.println("aqui estamos en la primera opcion");
			break;
		case 2:
			System.out.println("aqui estamos en la segunda opcion");
			break;
		case 3:
			System.out.println("aqui estamos en la tercera opcion");
			break;
		default:
			System.out.println("mp existe un valor dentro de los casos");
			char opc1 = 'a';
			switch(opc1){
			case 'a':
				System.out.println("selecciono A");
				break;
			case 'b':
				System.out.println("selecciono B");
				break;
			case 'c':
				System.out.println("selecciona C");
				break;
			default:
				System.out.println("no esta dentro de las opciones");

			}
			char opc2;
			Scanner teclado = new Scanner(System.in);

			opc2 = teclado.next().charAt(9);
			switch(opc){
			case 's':
				System.out.println("aqui ira las opciones de suma");

				System.out.println("aqui debemos realizar una suma");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 + num2;
			System.out.println("la suma es:" + resultado);

				break;
			case 'r':
				System.out.println("aqui ira las opciones de resta");

				System.out.println("aqui debemos realizar una suma");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 + num2;
			System.out.println("la suma es:" + resultado);

				break;
			case 'm':
				System.out.println("aqui ira las opciones de multiplicacion");

				System.out.println("aqui debemos realizar una suma");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 + num2;
			System.out.println("la suma es:" + resultado);

				break;
			case 'd':
				System.out.println("aqui ira las opciones de la division");

				System.out.println("aqui debemos realizar una suma");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 + num2;
			System.out.println("la suma es:" + resultado);
				break;
				default:
					System.out.println("no existe opcion a realizar");
			}
		}
	}
}