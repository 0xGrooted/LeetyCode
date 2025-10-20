import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
    
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        for (int element : elements) {
            int currentCount = countsMap.getOrDefault(element, 0);
            
            if (currentCount < maxOccurrences) {
                resultList.add(element);
                countsMap.put(element, currentCount + 1);
            }
        }
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
		return answer;
	}
}
