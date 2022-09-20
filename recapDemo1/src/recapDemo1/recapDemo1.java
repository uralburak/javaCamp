package recapDemo1;

public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=25;
		int sayi3=266;
		int max=0;
		if(sayi1>sayi2 && sayi1>sayi3)
			max=sayi1;
		
		if(sayi2>sayi1 && sayi2>sayi3)
			max=sayi2;
		
		if(sayi3>sayi1 && sayi3>sayi2) {
			max=sayi3;
		}
		System.out.println("our max number is "+ max);
	}

}
