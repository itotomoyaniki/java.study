package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner s = new Scanner(System.in);
			  Random r = new Random();
//			  int x = s.nextInt();
			  int y = r.nextInt(3);
			  System.out.print(y);

			  System.out.println();
			  System.out.println("課題1-0");
			  String[]omikuji= {"大凶","凶","吉","小吉","中吉","大吉"};
			  int lose=0;
			  int win=0;
			  int num=r.nextInt(6);
//			  System.out.println("課題2-3");
//			  System.out.println("じゃんけんをします0(グー)1(パー)2(チョキ)のなかで好きなものを出してね");
//			  while(win<3&&lose<3) {
//				  int porson=s.nextInt();
//				  String[]janken={"グー","パー","チョキ"};
//				  int cpu=r.nextInt(3);
//				  if((cpu-porson==-1)||cpu-porson==2) {
//					  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
//					  win++;
//					  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
//				  }
//				  else if(cpu==porson) {
//					  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あいこです");
//					  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
//				  }
//				  else {
//					  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
//					  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
//					  lose++;
//				  }	
//				 
//				  }
//					if(win==3) {
//						System.out.println("あなたは三回勝ちました。おめでとうございます");
//						System.out.println("");
//						
////						System.out.println("ついでにおみくじの結果は"+omikuji[num]);
//					}
//					else if(lose==3) {
//						System.out.println("cpuが三回勝ちました。あなたの負けです");
//					}
				System.out.println();
				System.out.println("課題2-4");
				System.out.println("じゃんけんをします0(グー)1(パー)2(チョキ)のなかで好きなものを出してね");
				while(win<3&&lose<3) {
					int porson=s.nextInt();
					String[]janken={"グー","パー","チョキ"};
					int cpu=r.nextInt(3);
					if((cpu-porson==-1)||cpu-porson==2) {
						System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
						win++;
						System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
					}
					else if(cpu==porson) {
						System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あいこです");
						System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
					}
					else if(porson>=3) {
						System.out.println("エラーが起こりました");
						System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
					}
					else {
						System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
						System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
						win=0;
						lose++;
					}	
					
				}
				if(win==3) {
					System.out.println();
					System.out.println("あなたは三回勝ちました。おめでとうございます");
					System.out.println("ごほうびにおみくじが引けちゃうzo!0~100から好きな数字を入力してね。");
					int present=s.nextInt();
						if(present<=100) {
							System.out.println("おみくじの結果は"+omikuji[num]);
						}
				}
				if(lose==3) {
					System.out.println("3回負けちゃったね。残念");
					
				}
			  
	}

}
