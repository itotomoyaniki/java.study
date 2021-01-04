package javastudy;

public class 課題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("課題0");
		for(int a=1;a<=9;a++) {
		System.out.print(" "+7*a);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("課題１");
		int b=40;
		int c=70;
		if(b+c>=160&&b>=40&&c>=40) {
			System.out.println("優");
		}
		else if(b+c>=140&&b>=40&&c>=40) {
			System.out.println("良");
		}
		else if(b+c>=100&&b>=40&&c>=40) {
			System.out.println("可");
		}
		else {
			System.out.println("追試");
		}
		System.out.println();
		
		System.out.println("課題２−１");
		b=13;
		if(b%2==0) {
			System.out.println(b);
		}
		else {
			System.out.println(b);
		}
		
		System.out.println();
		
		System.out.println("課題２−２");
		b=2;
		System.out.println(b%2);
		if(b<0&&b%2==0) {
			System.out.println("負の偶数"+b);
		}
		
		else if(b%2==-1) {
			System.out.println("負の奇数"+b);
		}
		else if(b%2==1) {
			System.out.println("正の奇数"+b);
		}
		else {
			System.out.println("正の偶数"+b);
		}
		
		System.out.println();
		System.out.println("課題３");
		int se=1;
		for(int e=1;e<=8;e++) {
			se*=2;
			System.out.print(" "+se);
		}
			
		System.out.println();
		System.out.println("課題４");
		for(int f=1;f<=9;f++) {
			for(int i=1;i<=9;i++)
			System.out.print(" "+f*i);
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("課題５");
		double height=2.7;
		double weight=100;
		double bmi=weight/(height*height);
		if(bmi<18.5) {
			System.out.println("低体重");
		}
		else if(bmi<=25) {
			System.out.println("標準");
		}
		else {
			System.out.println("肥満");
		}
		
		System.out.println();
		System.out.println("課題６");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++)
				System.out.print("□");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("■");
			for(int j=1;j<=5-i;j++)
				System.out.print("□");
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("□");
			
			for(int k=7;k>=2*i-1;k--)
				System.out.print("■");
			for(int j=1;j<=i;j++)
				System.out.print("□");
			System.out.println();
		}
	
		
		for(int a=1;a<=3;a++) {
			for(int l=1;l<=3-a;l++)
				System.out.print(" ");
			for(int n=1;n<=2*a-1;n++)
				System.out.print("△");
			System.out.println();
			
			
		}
		for(int a=1;a<=2;a++) {
			for(int l=1;l<=a;l++)
				System.out.print(" ");
			for(int n=3;n>=2*a-1;n--)
				System.out.print("△");
			System.out.println();
		}
	}
			
		}
		

		
		
			
		
	
	
