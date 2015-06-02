package com.itrellis.aussie;

public class Main {

    public static void main(String[] args) {
	    class VoteCase {
            public int numberOfCandidates;
            public String candidates[numberOfCandidates];

            int votes[][numberOfCandidates];

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
    }
}
