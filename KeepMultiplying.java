import java.util.ArrayList;
import java.util.List;

public class KeepMultiplying {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> temp = new ArrayList<>();

        for(int a: nums){
            temp.add(a);
        }

        while(temp.contains(original)){
            original *= 2;
        }
        return original;
    }
}
