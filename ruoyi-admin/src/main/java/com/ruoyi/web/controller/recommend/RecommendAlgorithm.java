package com.ruoyi.web.controller.recommend;

import java.util.*;

public class RecommendAlgorithm {
    private static final int PENALTY_RATIO = 9;

    public int similarity(int[][] prefs, int person,int other){

        return 0;
    }

    public int getRecommandations(int[][] prefs,int person){
        HashMap<Integer,Integer> totals = new HashMap<>();
        HashMap<Integer,Integer> simSums = new HashMap<>();
        for (int other : prefs[person]) {
            if (other == person)
                continue;
            int sim = similarity(prefs, person, other);
            if (sim <= 0)
                continue;

            for (int item : prefs[other]){
                if (Arrays.asList(prefs[person]).contains(item) || prefs[person][item] == 0){
                    totals.put(item, 0);
                    totals.put(item,totals.get(item) + prefs[other][item] * sim);
                    simSums.put(item, 0);
                    simSums.put(item,simSums.get(item) + sim);
                }
            }
        }

        int max = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = totals.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int rankings = entry.getValue()/simSums.get(entry.getKey());
            if (rankings>max)
                max = rankings;
        }
        return max;
    }

}
