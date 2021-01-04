package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("a");
		Scanner s = new Scanner(System.in);
		  Random r = new Random();
		  int x = s.nextInt();
		  int y = r.nextInt(3);
		  System.out.print(y);

	
	
		  System.out.println();
		  System.out.println();
		  System.out.println("課題1");
		  int sum=0;
		  int c=1;
		  while(c<=5){
			  int number=s.nextInt();
			  sum+=number;
			  c++;
		  }
		  System.out.println(sum);
		  
		  
		  for(int d=1;d<=5;d++) {
			  int numbers=s.nextInt();
			  sum+=numbers;
		  }
		  System.out.println(sum);
		  
			  
//		  System.out.println();
//		  System.out.println();
		  System.out.println("課題２");
		  System.out.println("a+bの合計が11以上の時は1(High)を入力　11未満の時は２(Low)を入力して");
		  int a=r.nextInt(10)+1;
		  int b=r.nextInt(10)+1;
		  int Rsum=a+b;
		  int answer=s.nextInt();
		  if(Rsum>=11&&answer==1||Rsum<11&&answer==2) {
			  System.out.print("正解！合計は"+Rsum+"でした");
		  }
		  else {
			  System.out.print("残念、、合計は"+Rsum+"でした");
		  }
		  
		  System.out.println();
		  System.out.println();
		  System.out.println("課題1-0");
		  String[]omikuji= {"大凶","凶","吉","小吉","中吉","大吉"};
		  int num=r.nextInt(6);
		  System.out.print(omikuji[num]);
		  
		  System.out.println();
		  System.out.println();
		  System.out.println("課題1-1");
		  while(true) {
			  int o=r.nextInt(6);
			  System.out.println(omikuji[o]);
			  if(o==5) {
				  break;
			  }
		  }
		  System.out.println("課題1-2");
		  
		  int count=0;
		  while(true) {
			  int o=r.nextInt(6);
			  count++;
			  if(o==5) {
				  break;
			  }
		  }
		  System.out.println(count+"回目です");
		  
		  System.out.println();
		  System.out.println();
		  System.out.println("課題2-1");
		  System.out.println("じゃんけんをします0(グー)1(パー)2(チョキ)のなかで好きなものを出してね");
		  
//		  int win=0;
//		  int porson=s.nextInt();
		  String[]janken={"グー","パー","チョキ"};
//		  int cpu=r.nextInt(3);
////		  while(win==0) {  
//			  if((cpu-porson==-1)||cpu-porson==2) {
//				  win++;
//				  System.out.print("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
//			   }
//			  else if(cpu==porson) {
//				  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あいこです");
//				  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
//				  break;
//			  }
//			  else {
//				  win--;
//				  System.out.print("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
//			  }	
//			  
//		  }
//		  System.out.println("課題2-2");
//		  System.out.println("じゃんけんをします0(グー)1(パー)2(チョキ)のなかで好きなものを出してね");
//		  
//		  int win=0;
////		  while(true) {  
////		  int porson=s.nextInt();
////		  String[]janken={"グー","パー","チョキ"};
////		  int cpu=r.nextInt(3);
////			  if((cpu-porson==-1)||cpu-porson==2) {
////				  System.out.print("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
////				  win++;
////				  break;
////			  }
////			  else if(cpu==porson) {
////				  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あいこです");
////				  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");  
////			  }
////			  else {
////				  System.out.print("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
////				  win--;
////				  break;
////			  }	
////		  }
//		  System.out.println();
//		  System.out.println("課題2-3");
//		  System.out.println("じゃんけんをします0(グー)1(パー)2(チョキ)のなかで好きなものを出してね");
////		  while(win<3) {
////			  int porson=s.nextInt();
//			  String[]janken={"グー","パー","チョキ"};
//			  int cpu=r.nextInt(3);
//			  if((cpu-porson==-1)||cpu-porson==2) {
//				  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの勝ちです");
//				  win+=3;
//				  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
//			  }
//			  else if(cpu==porson) {
//				  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あいこです");
//				  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
//			  }
//			  else {
//				  System.out.println("私は　"+janken[cpu]+"　あなたは"+janken[porson]+"　あなたの負けです");
//				  System.out.println("さあもう一度じゃんけんをします0(グー)1(パー)2(チョキ)");
//			  }	
//			 
//			  }
//				if(win==3) {
//					System.out.println("あなたは三回勝ちました。おめでとうございます");
//					System.out.println("");
//					
//					System.out.println("ついでにおみくじの結果は"+omikuji[num]);
//				}
//				else {
//					
//				}
			  
				System.out.println();
				System.out.println("課題2-4");
				System.out.println("じゃんけんをします0(グー)1(パー)2(チョキ)のなかで好きなものを出してね");
				while(win<3) {
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
						else {
							System.out.println("おみくじの結果は"+omikuji[num]);
							
						}
							
						
				}
				else {
					System.out.println("エラーが起こりました");
					
					
				}
				
			  
		  }
		  
		  
	}
		  
		 
		  
		  
	
	
	
	


