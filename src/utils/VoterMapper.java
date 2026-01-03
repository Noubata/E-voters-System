package utils;

import data.models.Voter;
import dtos.requests.CheckEligibilityRequest;
import dtos.requests.LoginRequest;
import dtos.requests.ViewCandidatesRequest;
import dtos.responses.LoginResponse;

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
}
