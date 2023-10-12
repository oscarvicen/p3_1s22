import java.util.Scanner;
public class p13_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		int num1, num2;
		int resultado;

		System.out.println("programa que realiza operaciones basicas");
		System.out.println("que operaciones desea: suma, resta,divicion,multiplicacion?");
		operacion = teclado.nextLine();
		if(operacion.equals ("suma")){


			System.out.println("aqui debemos realizar una suma");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 + num2;
			System.out.println("la suma es:" + resultado);



		}else if (operacion.equals("resta"))
		if (operacion.equals("resta")){
			System.out.println("aqui debemos realizar una resta");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 - num2;
			System.out.println("la resta es" + resultado);

		}else if (operacion.equals("multiplicacion"))
		if (operacion.equals("multiplicacion")){
			System.out.println("aqui debemos realizar una multiplicacion");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 * num2;
			System.out.println("la multiplicacion es" + resultado);

		}else if (operacion.equals("divicion"))
		if (operacion.equals("divicion")){
			System.out.println("aqui debemos realizar una divicion");
			System.out.println("ingresa primer numero:  ");
			num1 = teclado.nextByte();
			System.out.println("ingresa el segundo numero:  ");
			num2 = teclado.nextByte();
			resultado = num1 / num2;
			System.out.println("la divicion es" + resultado);

		}else{
			System.out.println("no existe opcion a realizar");
		}
	}
}