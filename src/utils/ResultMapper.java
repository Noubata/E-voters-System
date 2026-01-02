package utils;

import dtos.responses.ResultResponse;
import dtos.responses.CandidateResult;
import data.models.Candidate;
import data.models.Voter;
import java.util.ArrayList;
import java.util.List;

public class ResultMapper {

    public static ResultResponse mapToResultResponse(List<Candidate> candidates, List<Voter> votes) {
        ResultResponse response = new ResultResponse();
        List<CandidateResult> candidateResults = new ArrayList<>();

        int totalVotes = votes.size();

        for (Candidate candidate : candidates) {
            CandidateResult result = new CandidateResult();
            result.setCandidateId(candidate.getCandidateId());
            result.setCandidateName(candidate.getName());
            result.setParty(candidate.getParty());

            int voteCount = countVotesForCandidate(votes, candidate.getCandidateId());
            result.setVoteCount(voteCount);

            double percentage = totalVotes > 0 ? (voteCount * 100.0) / totalVotes : 0.0;
            result.setVotePercentage(percentage);

            candidateResults.add(result);
        }

        sortCandidatesByVotes(candidateResults);

        response.setResults(candidateResults);
        response.setTotalVotes(totalVotes);
        response.setMessage("Election results retrieved successfully");

        return response;
    }

    private static int countVotesForCandidate(List<Voter> votes, int candidateId) {
        int count = 0;
        for (Voter vote : votes) {
            if (vote.getCandidateId().equals(candidateId)) {
                count++;
            }
        }
        return count;
    }

    private static void sortCandidatesByVotes(List<CandidateResult> candidates) {
        for (int count = 0; count < candidates.size() - 1; count++) {
            for (int toSort = 0; toSort < candidates.size() - count - 1; toSort++) {
                if (candidates.get(toSort).getVoteCount() < candidates.get(toSort + 1).getVoteCount()) {
                    CandidateResult temp = candidates.get(toSort);
                    candidates.set(toSort, candidates.get(toSort + 1));
                    candidates.set(toSort + 1, temp);
                }
            }
        }
    }
}