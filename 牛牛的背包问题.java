package atest;

import java.util.Scanner;

public class 牛牛的背包问题 {
	
	public static int count = 0;
	
	public static void dfs(long sum, int cur, int n, int[] v, int w){
		
		if(sum > w)
			return ;
		
		if(cur < n){  
			
			dfs(sum, cur + 1, n, v, w);
			
			if(sum + v[cur] <= w){
				count++;
				dfs( sum + v[cur],  cur+1,  n,  v,  w);
			}
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //零食数量
		
		int w = scan.nextInt(); //背包容量
		
		int[] v = new int[n];  //每袋零食的体积
		
		long sum = 0;  //所有零食体积的和,不能是int型，int型的数据范围不够
		
		for(int i=0; i<n; i++){
			v[i] = scan.nextInt();
			sum = sum + v[i];       //求所有零食体积的和
		}
			
		if(sum <= w)
			System.out.println((int)Math.pow(2, n)); //当所有零食的体积之和不大于背包的总体积时，总共有2^n种方法
		
		else{
			dfs( 0,  0,  n,  v,  w);
			
			// 均不添加也是一种情况
			System.out.println(count+1);
			
		}
			
	}

}
