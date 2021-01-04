package javastudy;

import java.util.Random;
import java.util.Scanner;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 System.out.println("a");
			Scanner s = new Scanner(System.in);
			  Random r = new Random();
//			  int x = s.nextInt();
//			  int y = r.nextInt(3);
//			  System.out.print(y);

			  
			  String[]omikuji= {"大凶","凶","吉","小吉","中吉","大吉"};
			  int num=r.nextInt(6);
			  
			  int o=0;
			  while(o!=5){
				  o=r.nextInt(6);
				  System.out.println(omikuji[o]);
				 
			  }
			  System.out.println();
			  int sum=0;
			  int sta[]=new int[4];
			  sta[0]=r.nextInt(10)+1;
			  sta[1]=r.nextInt(10)+1;
			  sta[2]=r.nextInt(10)+1;
			  sta[3]=r.nextInt(10)+1;
			 
//			 System.out.println(n[0]);
//			 System.out.println(n[1]);
//			 System.out.println(n[2]);
//			 System.out.println(n[3]);
			  int va1=r.nextInt(5)+1;
			  int va2=r.nextInt(5)+1;
			  String[]statas= {"hp","off","def","luck"};
			 while(sum!=70) {
				 sta[0]=r.nextInt(30)+1;
				  sta[1]=r.nextInt(20)+1;
				  sta[2]=r.nextInt(20)+1;
				  sta[3]=r.nextInt(10)+1;
				  sum=sta[0]+sta[1]+sta[2]+sta[3];
			 }
			 
			 System.out.println(statas[0]+sta[0]);
			 System.out.println(statas[1]+sta[1]);
			 System.out.println(statas[2]+sta[2]);
			 System.out.println(statas[3]+sta[3]);
			 
			 System.out.println(va1+" "+va2);
			 System.out.println(sta[0]-(sta[1]/va1+sta[3]/va2));
			 
			 sta[3]=r.nextInt(10)+1;
			 int dora=sta[3];
			 
			 System.out.println(dora);
			 
			 
			  
			  
			  
			  
			  
	
	
	
	}

}
