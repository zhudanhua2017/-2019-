package atest;
import java.util.*;

public class 牛牛找工作 {

		public static void main(String[] args) {
          //划重点！！！此题坑点：输入中间有空行，所以用BuffferedReader会更麻烦，所以选择用Scanner
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();
          //保存所有工作的键值对，即<工作能力，报酬>，而且也保存每个小伙伴的能力值键值对，其报酬为0
          Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         //保存所有工作的能力值以及要计算的每个小伙伴的能力值
         int[] ai = new int[m + n];
         for(int i = 0; i < n; i++) {
             int di = sc.nextInt();
             ai[i] = di;
             int pi = sc.nextInt();
             map.put(di, pi);
         }
        //保存要计算的每个小伙伴的能力值
         int[] bi = new int[m];
         for(int i = 0; i < m; i++) {
             ai[i + n] = sc.nextInt();
             bi[i] = ai[i + n];
             if(!map.containsKey(ai[i + n])) {
                 map.put(ai[i + n], 0);
             }
         }
         //对能力值进行排序
        Arrays.sort(ai);
         //保存到目前的能力值为止，所能获得的最大报酬，有种dp的味道
        int ma = 0;
        for(int i = 0; i < m + n; i++) {
             //每次都更新当前能力值所对应的最大报酬，由于ma是保存的<=当前能力值所能获得的最大报酬，所以可行
            ma = Math.max(ma, map.get(ai[i]));
            map.put(ai[i], ma);
         }
        //遍历每个小伙伴的能力值，从map中获取到其最大报酬（在上面的for循环中已经更新到了）
       for(int i = 0; i < m; i++) {
             System.out.println(map.get(bi[i]));
        }
     }

}