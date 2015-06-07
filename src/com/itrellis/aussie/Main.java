package com.itrellis.aussie;
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

            public String candidates[] = new String[this.numberOfCandidates];

            // need to find a way to set the number of rows more dynamically
            int votes[][] = new int[5][this.numberOfCandidates];

            public int[][] getVotes() {
                return votes;
            }

            public void setVotes(int[][] votes) {
                this.votes = votes;
            }

            public String[] getCandidates() {

                return candidates;
            }

            public void setCandidates(String[] candidates) {
                this.candidates = candidates;
            }
        }

        // read the first line of the file here to get the numberOfElections
        // manually setting now
        int numberOfElections = 2;
        for (int i = 0; i < numberOfElections; i++)


            Election election = new Election(3);

        int voteArray[][] = new int[5][3];
        int i;
        int j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++) {
                // now what, genius?
            }
        }

        String[] candidates = new String[]{"Elizabeth Warren", "Bob Dole", "Mickey Mouse"};
        election.setCandidates(candidates);
        System.out.println(election.getVotes());
        for (i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i]);
        }
    }
}
