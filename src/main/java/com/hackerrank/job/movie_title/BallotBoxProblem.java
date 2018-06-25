package com.hackerrank.job.movie_title;

import apple.laf.JRSUIConstants;

import java.util.*;

public class BallotBoxProblem {

    static String electionWinner(String[] votes) {
        /*
         * Write your code here.
         */

        Map<String, Integer> votesMap = new HashMap<>();


        int maxVotes = Integer.MIN_VALUE;


        for (String vote : votes) {

            Integer voteCount = votesMap.get(vote);

            if (voteCount == null) {
                voteCount = 0;
            }
            voteCount++;
            votesMap.put(vote, voteCount);

            if (maxVotes < voteCount)
                maxVotes = voteCount;


        }
      //  System.out.println(votesMap);

      //  System.out.println(maxVotes);
        List<String> winners = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : votesMap.entrySet())
            if(entry.getValue()==maxVotes)
                winners.add(entry.getKey());

        System.out.println(winners);

        Collections.sort(winners);

        return winners.get(winners.size()-1);


    }


    public static void main(String[] args) {
        String[] votes = {
                "Victor",
                "Veronica",
                "Ryan",
                "Dave",
                "Maria",
                "Maria",
                "Farah",
                "Farah",
                "Ryan",
                "Veronica"
        };
        System.out.println(electionWinner(votes));
    }
}
