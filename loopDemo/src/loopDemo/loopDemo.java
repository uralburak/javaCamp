package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		int i;
		System.out.println("1den 9a kadar olan say�lar�n yaz�m�:");
		for(i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("10a kadar bulunan �ift rakamlar:");
		for(i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("for d�ng�s� bitti.");
		//while
		i=1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while d�ng�s� bitti.");
		
		//dowhile
		int j=2;
		do {
			System.out.println(j);
			j+=3;
		} while (j<10);
		System.out.println("dowhile dongusu bitti.");
	}

}
