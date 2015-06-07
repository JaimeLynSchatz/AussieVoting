package com.itrellis.aussie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Sample Input
 * 1
 *
 * 3
 * John Doe
 * Jane Smith
 * Jane Austen
 * 1 2 3
 * 2 1 3
 * 2 3 1
 * 1 2 3
 * 3 1 2
 *
 */
public class Main {

    public static void main(String[] args) {
        class Election {

            class Candidate {
                public String candidateName = "";

                private int voteCount = 0;

                public void incrementVote() {
                    this.voteCount++;
                }

                public int getVoteCount() {
                    return this.voteCount;
                }
            }

            class Vote {
                public Vote(int numberOfCandidates) {
                    int[] voterChoices = new int[numberOfCandidates];
                }
            }

            // use a Collection/List to set the number of rows dynamically
            List<Vote> votes = new ArrayList<>();

        }

        // read the first line of the file here to get the numberOfElections
        // manually setting now
        int numberOfElections = 2;

        Election.Candidate[] candidates = new Election.Candidate[3];

        String[] names = {"Bob Dole", "Elizabeth Warren", "Mickey Mouse"};

        // Question to ask
        // What's the proper way to say this?
        // for (Election.Candidate candidate : candidates, String name : names) {
        //    candidate.candidateName = name;
        // }

        // what the heck am I even doing here? Am I thinking of this as a Collection?

//        for (int i = 0; i < names.length; i++) {
//            candidates[i].candidateName = names[i];
//        }

        // why doesn't this work?
        candidates[0].candidateName = "Bob Hope";

        for (Election.Candidate candidate : candidates) {
            System.out.println(candidate);
        }

//        for (int i = 0; i < numberOfElections; i++) {
//            Election election = new Election(3);
//
//            Election myElection = new Election(1);
//
//            myElection.Candidates.add("Bob Dole");
//
//            System.out.println(election.getVotes());
//            for (i = 0; i < candidates.length; i++) {
//                System.out.println(candidates[i]);
//            }e numbers
//        }
    }
}
