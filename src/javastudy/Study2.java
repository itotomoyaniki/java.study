package javastudy;

public class Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println((a+b)/2);
	
		a=2000;
		b=2000;
		System.out.println((a+b)*110/100);
		
		if(a<b) {
			System.out.println(b);
		}
		else if(a==b) {
			System.out.println("同じです");
		}
		else{
		System.out.println(a);
		}
		int age=2;
		if(age<=19) {
			System.out.println("10だい");
		}
		else if(age<=29) {
			System.out.println("20だい");	
		}
		else if(age<=39) {
			System.out.println("30だい")	;
		}
		else if(age<=49) {
			System.out.println("40だい");	
		}
		else {
			
			System.out.println("50才以上")	;
		}
}
}