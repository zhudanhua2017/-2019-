package atest;

import java.util.Scanner;

public class 数对 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        long n = sc.nextInt();
        
        long k = sc.nextInt();
        
        long count=0;
        
        if(k == 0){
        	System.out.println(n*n);
        	return ;
        }
       
    	for(long y=k+1;y<=n;y++){
    		count += (n/y)*(y-k);
    		if(n%y >= k)
    		count = count + n%y-k+1;
    	}
        
        
        System.out.println(count);
	}

}
