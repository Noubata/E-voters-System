package utils;

import data.models.Voter;
import dtos.requests.CheckEligibilityRequest;
import dtos.requests.LoginRequest;
import dtos.requests.ViewCandidatesRequest;
import dtos.requests.VoteCandidateRequest;
import dtos.responses.LoginResponse;
import dtos.responses.VoteCandidateResponse;

public class VoterMapper {
    public static Voter mapToVoterViewCandidates(ViewCandidatesRequest viewCandidatesRequest)  {
        Voter voter = new Voter();
        voter.setNationalId(viewCandidatesRequest.getVoterId());
        voter.setPassword(viewCandidatesRequest.getPassword());
        voter.setRegistered(viewCandidatesRequest.isRegistered());
        return voter;
    }
    public static Voter mapToVoterLogin(LoginRequest loginRequest){
        Voter voter = new Voter();
        voter.setNationalId(loginRequest.getVoterId());
        voter.setPassword(loginRequest.getPassword());
        return voter;
    }
    public static LoginResponse mapToLoginResponse(Voter voter, boolean hasVoted) {
        LoginResponse response = new LoginResponse();
        response.setVoterId(voter.getVoterId());
        response.setVoterName(voter.getName());
        response.setHasVoted(hasVoted);
        return response;
    }

    public static Voter mapToEligibilityResponse(CheckEligibilityRequest request) {
        Voter voter = new Voter();
        voter.setAge(voter.getNationalId());
        voter.setRegistered(voter.isRegistered());
        return  voter;
    }
    public static VoteCandidateResponse mapToVoteCandidateResponse(boolean success, String message) {
        VoteCandidateResponse response = new VoteCandidateResponse();
        response.setSuccess(success);
        response.setMessage(message);
        return response;
    }
    public static Voter mapToVote(Voter voter, VoteCandidateRequest request) {
        Voter vote = new Voter();
        vote.setVoterId((int) System.currentTimeMillis());
        vote.setNationalId(voter.getNationalId());
        vote.setCandidateId(request.getCandidateId());
        return vote;
    }
}
