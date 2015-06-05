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
        class VoteCase {
            int numberOfCandidates;

            public VoteCase(int numberOfCandidates) {
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

        VoteCase election = new VoteCase(3);
        System.out.println(election.getVotes());
    }
}
