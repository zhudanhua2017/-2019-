package atest;

import java.util.Scanner;

public class 被3整除 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        if(( (l+1)%3 ==0 && (r+1)%3 ==0) || (l%3 ==0 && r%3 ==0)){
        	int m = (l+1)/3;
        	int n = (r+1)/3;
        	System.out.println(2*(n-m)+1);
        }
        
        if((l-1)%3 ==0 && (r-1)%3 ==0){
        	int m = l/3;
        	int n = r/3;
        	System.out.println(2*(n-m));
        }
        
        if(((l+1)%3 ==0 && r%3 ==0) ){
        	int m = (l+1)/3;
        	int n = r/3;
        	System.out.println(2*(n-m)+2);
        }
        
        if(((l)%3 ==0 && (r+1)%3 ==0)){
        	int m = l/3;
        	int n = (r+1)/3;
        	System.out.println(2*(n-m));
        }
        if((l+1)%3==0 && (r-1)%3==0){
        	int m = (l+1)/3;
        	int n = (r-1)/3;
        	System.out.println(2*(n-m+1));
        }
        
        if(l%3==0 && (r-1)%3==0){
        	int m = (l)/3;
        	int n = (r-1)/3;
        	System.out.println(2*(n-m)+1);
        }
        
        if((l-1)%3==0 && (r+1)%3==0){
        	int m = (l-1)/3;
        	int n = (r+1)/3;
        	System.out.println(2*(n-m)-1);
        }
        if((l-1)%3==0 && (r)%3==0){
        	int m = (l-1)/3;
        	int n = (r)/3;
        	System.out.println(2*(n-m));
        }
        
	}

}
