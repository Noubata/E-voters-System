package utils;

import data.models.Voter;
import dtos.requests.ViewCandidatesRequest;
import dtos.responses.ViewCandidatesResponse;

public class VoterMapper {
    public static Voter mapVoterRequest(ViewCandidatesRequest viewCandidatesRequest)  {
        Voter voter = new Voter();
        voter.setId(viewCandidatesRequest.getVoterId());
        voter.setName(viewCandidatesRequest.getName());
        voter.setPassword(viewCandidatesRequest.getPassword());
        voter.setAge(viewCandidatesRequest.getAge());
        voter.setAddress(viewCandidatesRequest.getAddress());
        return voter;
    }
    public static ViewCandidatesResponse mapVoterResponse(Voter voter){
        ViewCandidatesResponse viewCandidatesResponse = new ViewCandidatesResponse();
        viewCandidatesResponse.setCandidateId(voter.getId());
        viewCandidatesResponse.setName(voter.getName());
        //viewCandidatesResponse.setParty(voter.getParty());
        return viewCandidatesResponse;
    }
}
