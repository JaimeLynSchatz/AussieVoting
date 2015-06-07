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

            int numberOfCandidates;

            public Election(int numberOfCandidates) {
                this.numberOfCandidates = numberOfCandidates;
            }

            // not sure yet, but fairly sure this isn't needed anymore
            //
//            public String candidates[] = new String[this.numberOfCandidates];
//            public String[] getCandidates() { return candidates; }
//            public void setCandidates(String[] candidates) { this.candidates = candidates; }

            class Candidate {
                public Candidate(String name) {
                    String candidateName = name;
                }
            }

            List<Candidate> Candidates = new ArrayList<>();

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

        for (int i = 0; i < numberOfElections; i++) {
            Election election = new Election(3);

            int voteArray[][] = new int[5][3];
            int j;
            int k;
            for (j = 0; j < 5; j++) {
                for (k = 0; k < 3; k++) {
                    // now what, genius?
                }
            }

            Election myElection = new Election(1);

            myElection.Candidates.add(new Election.Candidate("Bob Dole"));

            String[] candidates = new String[]{"Elizabeth Warren", "Bob Dole", "Mickey Mouse"};
            election.setCandidates(candidates);
            System.out.println(election.getVotes());
            for (i = 0; i < candidates.length; i++) {
                System.out.println(candidates[i]);
            }
        }
    }
}
