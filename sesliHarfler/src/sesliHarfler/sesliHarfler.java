package sesliHarfler;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf='I';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Bu harf kal�n sesli harftir.");
			break;
		case 'E':
		case '�':
		case '�':
		case '�':
			System.out.println("Bu harf ince sesli harftir.");
			break;
			default:
				System.out.println("Bu harf sesli harf de�ildir.");
		}
		
	}

}
