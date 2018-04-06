package atest;

import java.util.Scanner;

public class 安置路灯 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        
        while(t-- > 0){
        	
        	int longs = sc.nextInt();
        	
        	String s =  sc.next();
        	
        	int count =0;
        	
        	for(int i=0;i<s.length();i++){
        		if(s.charAt(i) == 'X')
        			continue;
        		count++;
        		i=i+2;
        	}
        	
        	System.out.println(count);
        }
        
	}

}
