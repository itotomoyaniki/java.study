package javastudy;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class 課題３ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Hello world");
		System.out.println("ゲームが開始します　スタートの場合　１を入力してください");
		int start=s.nextInt();
		int sum=match();
		double b=sum;
		TimerTask task=new TimerTask(){
			public void run() {
				System.out.println("ゲームが終了しました");
			}
		};
		Timer timer=new Timer();
		timer.schedule(task,10000);
		
		
	}

	
		//	文字列を一致させるメソッド
		
		static int match() {
			Scanner s = new Scanner(System.in);
			Random r = new Random();
			int wordsum=0;
			int time=0;
			while(time<=3) {
			String[]randamWord= {"いいちこ","赤霧島","赤兎馬","大納言あずき","ペプシマン","キン肉マン","ウォーズマン","ポップインシャワー"};
			int randam=r.nextInt(8);
			System.out.println("この文字を入力してください　"+randamWord[randam]);
			String word=s.next();	
			
				if(word.equals(randamWord[randam])) {
					System.out.println("一致しました　"+randamWord[randam]);
					int sum=word.length();
					wordsum+=sum;
					System.out.println(sum);
					time++;
				}
			 	else{
			 		System.out.println("一致しませんでした");
			 		}
			}
			return wordsum; 

		}
		

	
	
		//	時間を図るメソッド
	
	
		//	一秒間に何文字打てたかわかるメソッド

		}
