package utils;

import data.models.Voter;
import dtos.requests.LoginRequest;
import dtos.requests.ViewCandidatesRequest;

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

}
