import java.util.*;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (b[0] != a[0]) return b[0] - a[0];
            else return a[1] - b[1];
        });
        List<int[]> result = new LinkedList<>();
        for (int[] person : people) {
            result.add(person[1], person);
        }
        return result.toArray(new int[people.length][]);
    }
}
