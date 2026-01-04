package dtos.responses;

public class CreateAccountResponse {
    private int voterId;
    private String voterName;
    private String password;

    public CreateAccountResponse(int voterId, String voterName, String password) {
        this.voterId = voterId;
        this.voterName = voterName;
        this.password = password;
    }

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
