package miniProjeAsalSayi;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("sayi asal degildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("gecersiz sayi");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime==true) {
			System.out.println("number bir asal sayidir.");
		}
		else {
			System.out.println("number asal sayi degildir.");
		}
		

	}

}
