import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) - 1);
                if (map.get(name) == 0) {
                    map.remove(name);
                }
            }
        }

        for (String name : map.keySet()) {
            return name;
        }

        return "";
    }
}
