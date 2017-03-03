import java.util.*;

/**
 * Created by tpusers on 2017/2/11.
 */
public class AnySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.next().split(",");
        int target = s.nextInt();
        int[] candidates = new int[in.length];
        for (int i = 0; i < in.length; i++){
            candidates[i] = Integer.parseInt(in[i]);
        }
        AnySum anySum = new AnySum();
        List<List<Integer>> l = anySum.combinationSum2(candidates, target);
        System.out.print(l);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int remain, int start) {

        if(remain < 0) return; /** no solution */
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else if (start >= cand.length) return;
        else{
//            for (int i = start; i < cand.length; i++) {
//                if(i > start && cand[i] == cand[i-1]) continue; /** skip duplicates */
//                tempList.add(cand[i]);
//                backtrack(list, tempList, cand, remain - cand[i], i+1);
//                tempList.remove(tempList.size() - 1);
            tempList.add(cand[start]);
            backtrack(list, tempList, cand, remain - cand[start], start + 1);
            tempList.remove(tempList.size() - 1);
            while (start + 1 < cand.length && cand[start + 1] == cand[start]) start ++;

            backtrack(list, tempList, cand, remain, start + 1);
        }
    }
}

