package mukemmelSayi;

import javax.naming.spi.DirStateFactory.Result;

public class mukemmelSayi {

	public static void main(String[] args) {
		int number =28;
		int i,result,sum=0;
		for(i=1; i<number;i++) {
			result = number % i;
			if(result==0) {
				sum=i+sum;
				System.out.println(sum);
			}
			
		}
		if(sum==number) {
			System.out.println(number+" bir mükemmel sayidir.");
		}
		else 
			System.out.println(number+" bir mükemmel sayi degildir.");
	}

}
