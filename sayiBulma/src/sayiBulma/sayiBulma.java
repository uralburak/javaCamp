package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		int i;
		/*for (i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				System.out.println("bu sayi dizi išerisinde mevcuttur.");
			}
		}*/
		
		boolean varMi=false;
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
			
		}
		if(varMi==true) {
			System.out.println("bu sayi dizi išerisinde mevcuttur.");
		}
		else {
			System.out.println("bu sayi dizi išerisinde mevcut degildir.");
		}
	}

}
