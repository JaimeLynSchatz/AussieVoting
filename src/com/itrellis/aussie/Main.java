package com.itrellis.aussie;

public class Main {

    public static void main(String[] args) {
        class VoteCase {
            int numberOfCandidates;

            public VoteCase(int numberOfCandidates) {
                this.numberOfCandidates = numberOfCandidates;
            }

            // this code doesn't work yet

            public String candidates[this.numberOfCandidates];

            int votes[][this.numberOfCandidates];

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

        VoteCase election = new VoteCase(5);
        election.
    }
}
