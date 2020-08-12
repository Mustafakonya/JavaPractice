package replit;

import java.util.Scanner;

public class Method1 {

//	Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
//	Test data:
//	12,24,34
//	Beklenen Çıktı:
//	12
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		sonuc(s1, s2, s3);
		sc.close();
	}

	public static void sonuc(int s1, int s2, int s3) {
		if(s1 > s2 && s1> s3) {
			System.out.println(s1);
		}else if(s2 > s1 && s2> s3) {
			System.out.println(s2);
		}else if(s3 > s1 && s3> s2) {
			System.out.println(s3);
		}
			
		
	}
}
