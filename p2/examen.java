import java.util.Scanner;

public class examen{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("cuantos valores vas a capturar");
		int[]tamano = teclado.nextLine();
		int[]valores = new int[tamano];
		int a;
		for (a=0;a<tamano;a++){
			System.out.println("ingresa el valor #"+a+";");
			valores[a] = teclado.nextInt();
		}
		int sumatoria=0;
		for (a=0; a<tamano;a++){
			sumatoria+=valores[a];
		}
		int promedio=sumatoria/tamano;
		System.out.println("ls medida aritmetica es"+promedio);
		sumatoria=0;
		for(a=0;a<tamano;a++){
			sumatoria+=Math.abs(valores[a]-promedio);
		}
		int dm = sumatoria/tamano;
		System.out.println("la desciacion media es" + dm);
	}
}