package huawei;

import java.util.*;
/*
 * 如：输入的字符串为eeeffgghhh，输出结果为efghefgheh
 */
public class 字符串排序后输出 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		str = str.trim();
		
		char[] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		List<Character> list = new ArrayList<Character>();
		
		for(int i=0;i<ch.length;i++){
			if(map.containsKey(ch[i])){
				int count =  map.get(ch[i]);
				map.put(ch[i], ++count);
			}else{
				map.put(ch[i], 1);
			}
			
			if(!list.contains(ch[i]))
				list.add(ch[i]);
		}
		
		int max = 0;
		for(int i=0;i<list.size();i++){
			int count = map.get(list.get(i));
			if(max < count)
				max = count;
		
		}
		
		System.out.println(map.entrySet());
		
		StringBuilder builder = new StringBuilder();
		
		while(max>0){
			
			for(int i=0;i<list.size();i++){
				
				if(map.containsKey(list.get(i))){
					
					if(map.get(list.get(i)) == 0 ){
						map.remove(list.get(i));
					}else{
						int count = map.get(list.get(i));
						map.put(list.get(i),--count);
					}
				}
				
				if(map.containsKey(list.get(i)) && map.get(list.get(i)) >= 0){
					builder.append(list.get(i));
				}
				
			}
				--max;
		}
		System.out.println(builder.toString());
	}

}
