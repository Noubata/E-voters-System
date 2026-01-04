package dtos.responses;

public class DeleteUserResponse {
    private int voterId;
    private String voterName;
    private String message;

    public int getVoterId() { return voterId; }
    public void setVoterId(int voterId) { this.voterId = voterId; }

    public String getVoterName() { return voterName; }
    public void setVoterName(String voterName) { this.voterName = voterName; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}

