import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int cnt = 0;
        Arrays.sort(people);
        int idx = 0;
        for(int i= people.length-1; i>=idx; i--){
            if(people[i] + people[idx] <= limit) {
                idx++;
                cnt++;
            }
            else cnt++;
        }
        return cnt;
    }
}