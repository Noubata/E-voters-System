package dtos.responses;

public class LoginResponse {
    private String voterName;
    private int voterId;
    private String votingDeadline;
    private boolean hasVoted;

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public String getVotingDeadline() {
        return votingDeadline;
    }

    public void setVotingDeadline(String votingDeadline) {
        this.votingDeadline = votingDeadline;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}
