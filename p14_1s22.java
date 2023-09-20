import java.until.Scanner;

public class p14_1s22{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opc;
		byte nume1, num2;
		int resultado;

		System.out.println("menu de opciones");
		System.out.println("\n suma");
		System.out.println("\n resta");
		System.out.println("\n divicion");
		System.out.println("\n multiplicacion");
		System.out.println("\n que opcion desea:  ");
		opc = teclado.nextLine();

		switch(opc){
		case "suma":
			System.out.println("aqui va la suma");
			breakr
		case "resta":
			System.out.println("aqui va la resta");
			break
		case "divicion":
			System.out.println("aqui va la divicion");
			break
		case "multiplicacion":
			System.out.println("aqui va la multiplicacion");
			break
		}
	}
}