public class p15_1s22{
	public static void main(String[] args) {
		int a=0;
		for (a=0; a<10; a++ ) {
            System.out.println("Estamos incrementando a = " + a);
		}
		System.out.println("\n\n");
		a=0;
		for (;a<11;a++)
			System.out.println("Estamos incrementando a = " + a);
	}
	a=11;
	System.out.println("\n\n");
	for(;a<20;){
		Systemn.out.println("Estamos incrementando a = " + a);
		a=a+2;
	}
	a=1;
	for (;;){
		System.out.println("Estamos incrementando a = " + a);
		if (a==15) break;	
		a++;
	}
}