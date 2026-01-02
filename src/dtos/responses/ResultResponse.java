package dtos.responses;

import java.util.List;

public class ResultResponse {
    private List<CandidateResult> results;
    private String message;
    private int totalVotes;

    public ResultResponse() {}

    public ResultResponse(List<CandidateResult> results, String message, int totalVotes) {
        this.results = results;
        this.message = message;
        this.totalVotes = totalVotes;
    }

    public List<CandidateResult> getResults() {
        return results;
    }

    public void setResults(List<CandidateResult> results) {
        this.results = results;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
}
