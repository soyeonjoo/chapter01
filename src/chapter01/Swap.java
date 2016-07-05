package chapter01;

public class Swap {

	public static void main(String[] args) {
		
		//Q1: n1이 항상크도록
		int n1 = 10;
		int n2 = 30;
		int sw;
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		if(n1<n2){
			sw=n1;
			n1=n2;
			n2=sw;					
		}
		System.out.println("n1: " + n1);
		
		
		//Q2 : 최대값 판별
		int a1 = 10;
		int a2 = 50;
		int a3 = 20;
		
		
		if (a1 >= a2) {
		 if(a1>=a3) {
			System.out.println("최대값은 a1: " + a1);
		 }
		 if(a1<a3){//그냥 else로 써도 됨
			System.out.println("최대값은 a3: " + a3);
			}
		}else if(a2>=a3) {
		 if(a2>=a3) {
			System.out.println("최대값은 a2: " + a2);
		 }
		 if(a2<a3){//그냥 else로 써도 됨 
			System.out.println("최대값은  a3 : " + a3);
		 }
		}
	}
}

	

