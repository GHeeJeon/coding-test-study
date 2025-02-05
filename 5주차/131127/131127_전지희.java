import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int count = 10;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        } 
       
        for(int i = 0; i < discount.length - count + 1; i++){
            Map<String, Integer> hashMap = new HashMap<>();
            
            for(int j = 0; j < count; j++){
                hashMap.put(discount[i + j], hashMap.getOrDefault(discount[i + j], 0) + 1);
            }
            
            Boolean isIdentical = true;
            
            for(String key : map.keySet()){
                if(map.get(key) != hashMap.get(key)){
                    isIdentical = false;
                    break;
                }
            }
            
            answer += isIdentical ? 1 : 0;
        }
        
        return answer;
    }
}
