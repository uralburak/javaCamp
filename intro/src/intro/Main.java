package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello world!");
			
			String ortaMetin = "�lginizi �ekebilir";
			String altMetin="Vade s�resi";
			//de�i�ken isimlendirmeleri java'da camelCase yaz�l�r.
			
			System.out.println(ortaMetin);
			
			int vade = 12;
			double dolarDun=18.14;
			double dolarBugun=18.10;
			
			boolean dolarDustuMu = true;
			
			String okYonu = "";
			
			if (dolarBugun<dolarDun) {
				okYonu = "down.svg";
				System.out.println("okYonu");
				
			} else if (dolarBugun>dolarDun) {
				okYonu = "up.svg";
				System.out.println("okYonu");
				
			}
			else {
				okYonu="equal.svg";
				System.out.println(okYonu);
			}
			
			//array
			
			String[] krediler = {"H�zl� Kredi","Maa��n� Halkbanktan Alanlar","Mutlu Emekli"};
		
			for(int i=0;i<krediler.length;i++) {
				System.out.println(krediler[i]);
			}
			
			
			
	}

}
