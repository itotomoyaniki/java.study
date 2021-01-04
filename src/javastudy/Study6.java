package javastudy;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		  Random r = new Random();
		
		
		
		  	int[]ab=kuku(2);
		  	System.out.println(ab[1]);

		  	
			System.out.println();
			
			sum();
			int[]array= {1,2,3,22,1,-1,-133};
			min(array);
			
	}
				
//			商品入力メソッド
			static int sum() { 
				Scanner s = new Scanner(System.in);
				int sum=0;
				int choice=0;
				while(choice!=2) {
				System.out.println("計算をします。開始は１を　結果をみたい場合は2を");
					choice=s.nextInt();
					if(choice==1) {
						System.out.println("値を入力してください");
						sum+=s.nextInt();
				}
					else if(choice==2){
						System.out.print("結果は"+sum);
				}
					else {
						System.out.print("エラーが起こりました");
					}
				}
				return sum;
			}
//			九九
			static int[]kuku(int a) {
				int answer[]=new int[10];
				for(int b=1;b<=9;b++) {
					answer[b]=a*b;
				}
				return answer;
			}
//			配列の中の最小値を求める
			static int min(int[]array) {
				int min=array[0];
				for(int i=1;i<array.length;i++) {
					if(min>array[i]) {
						min=array[i];
					
					}
				}
				return min;
			}
			
				
			
				
				
					
	
	
			static int tax(int a) {
				return a*110/100;
			}
			
			// f 引数が複数あるパターン
			 static int add(int x, int y, String s) {
			  System.out.println(s+"を受け取りました。");
			  int i = x+y;
			  return x+y;
			 }

			 // e 戻り値もあって引数もある
			 static int sanjo(int x) {
			  System.out.println(x+"の3乗した値を返したよ");
			  int result = x * x * x;
			  return result;
			//  return x*x*x;

			 }

			 // d 戻り値はなし。引数あり
			 static void hello(int x) {
			  for (int i = 0; i < x; i++) {
			   System.out.println("こんにちは！");
			  }
			 }

			 // c 戻り値はなし。引数あり
			 static void kon(String name) {
			  
			  System.out.println(name + "さんこんにちは！");
			  
			 }

			 // b戻り値はある。引数なし。呼び出されたら処理を実行して値を返す。
			 static int num() {
			  System.out.println("値をメインに渡しました");
			  int result = 1;
			  for (int i = 1; i <= 8; i++) {
			   result *= 2;
			  }
			  
			  return result;
			  
			 }

			 // a戻り値はなし。引数なし。呼び出されたら実行するだけ
			 static void hello() {
			  System.out.println("hello");
			  System.out.println("こんにちは");
			  System.out.println("おはよう");
			  System.out.println("こんばんは");
			 }
			 
			 
			     			// ひきすう
			 // メイン→メソッド 引数 0 or 複数個でもOK
			 // メソッド→メイン 戻り値 0 or 1個(型はなんでも)

			

			       
			// static 戻り値の型 メソッド名（引数の型 変数名）｛
			//  実行したい処理
			//  実行したい処理
			//  実行したい処理
			//  return 戻したい値 
			// ｝


	
	
	
	}


