package dtos.responses;

public class CandidateResult {
    private int candidateId;
    private String candidateName;
    private String party;
    private int voteCount;
    private Double votePercentage;

    // Constructor
    public CandidateResult() {}

    public CandidateResult(int candidateId, String candidateName, String party, int voteCount) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.party = party;
        this.voteCount = voteCount;
    }

    // Getters and setters
    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
    public double getVoterPercentage(){
        return votePercentage;
    }
    public void setVotePercentage(double votePercentage){
        this.votePercentage = votePercentage;
    }
}