package javastudy;

import java.util.Random;
import java.util.Scanner;

public class やり方 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		
		
		System.out.println();
		System.out.println("ゲームが始まります");
		int startbottom=s.nextInt();
		long start=System.currentTimeMillis();
		double a=match();
		long end=System.currentTimeMillis();
		double time=(end-start)/1000;
		System.out.println(time+"秒かかりました");
		System.out.println("終了しました 合計は"+a+"文字です");
		System.out.println("あなたの平均は１秒間に"+a/time+"文字です");
		
	}
//	文字列の一致のメソッド
	static int match() {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int wordsum=0;
		int time=0;
		for(int a=0;a<=7;a++){
	
			String[]randamWord= {"いいちこ","あかきりしま","サケとば","だいなごんあずき","ペプシマン","きんにくマン","ウォーズマン","ポップインシャワー"};
			System.out.println("この文字を入力してください　"+randamWord[a]);
			String word=s.next();	
			
				if(word.equals(randamWord[a])) {
					System.out.println("一致しました　"+randamWord[a]);
					int sum=word.length();
					wordsum+=sum;
					System.out.println();
				}
			 	else{
			 		System.out.println("一致しませんでした");
			 		System.out.println();
			 		a--;
			 		}
				
	}
		return wordsum; 
	}
}

			
	
	
	
			
			
	

