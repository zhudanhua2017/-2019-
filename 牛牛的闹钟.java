package atest;

import java.util.*;


public class 牛牛的闹钟 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] clock = new int[n];
		
		
		for(int i=0;i<n;i++){
			int h = scan.nextInt();
			int m = scan.nextInt();
			
			clock[i] = h*60+m;
		}
		
		int cost = scan.nextInt();
		
		int deadLine = scan.nextInt()*60 + scan.nextInt();
		
		Arrays.sort(clock);
		
		
		for(int i=n-1;i>=0;i--){
			if(clock[i]+cost <= deadLine){
				System.out.println(clock[i]/60+" "+clock[i]%60);
				break;
			}
				
		}
		
	}

}
