package huawei;

import java.util.Scanner;

public class 大数乘法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.nextLine(); //用字符串进行数字的输入   
		
		String str2 = scan.nextLine();
		
		int length1 = str1.length();
		int length2 = str2.length();
		
		int[] nums1 = new int[length1];
		int[] nums2 = new int[length2];
		
		int maxLen = (length1 > length2 ? length1:length2);
		int[] res = new int[2*maxLen];   //积的位数最多是因数位数的两倍 
		
		for(int i=0;i<length1; i++){
			nums1[length1-1-i] = str1.charAt(i)-'0';  //字符类型转化为int型
		}
		
		
		for(int i=0;i<length2; i++){
			nums2[length2-1-i] = str2.charAt(i)-'0';
		}
		
		//将因数各个位上的数字与另一个各个位上的数字相乘   
		for(int i=0;i<length2;i++){
			int k=i;
			for(int j=0;j<length1;j++){
				res[k] = res[k] + nums1[j] * nums2[i];  //先乘起来，后面统一进行进位
				k++;
			}
		}
		
		//进行进位  
		for(int i=0;i<res.length-1;i++){
			res[i+1] = res[i+1] + res[i]/10; //将十位上数字进位
			res[i] = res[i] % 10;  //将个位上的数字留下  
		}
		
		int index = res.length-1;
		//删除0的前缀   
		for(; index>=0; index--){
			
			if(res[index] == 0)
				continue;
			else
				break;
			
		}
		
		//倒叙存入StringBuilder中
		StringBuilder s = new StringBuilder();
		for(;index>=0;index--)
			s.append(res[index]);
			
		//以字符串形式输出
		System.out.println(s.toString());
	}

}
