package atest;

import java.util.Scanner;

public class 迷路的牛牛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        
        String s = sc.next();
        
        String direction  = "N";
        
        for(int i=0;i<N;i++){
        	if(s.charAt(i) == 'L' && direction  == "N")
        		direction = "W";
        	else if(s.charAt(i) == 'R' && direction  == "N")
        		direction = "E";
        	else if(s.charAt(i) == 'L' && direction  == "E")
        		direction = "N";
        	else if(s.charAt(i) == 'R' && direction  == "E")
        		direction = "S";
        	else if(s.charAt(i) == 'L' && direction  == "W")
        		direction = "S";
        	else if(s.charAt(i) == 'R' && direction  == "W")
        		direction = "N";
        	else if(s.charAt(i) == 'L' && direction  == "S")
        		direction = "E";
        	else 
        		direction = "W";
        }
        System.out.println(direction);
	}

}
