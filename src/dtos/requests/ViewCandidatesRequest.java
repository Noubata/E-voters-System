package dtos.requests;

public class ViewCandidatesRequest {

    private String password;
    private int voterId;
    private boolean isRegistered;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}
