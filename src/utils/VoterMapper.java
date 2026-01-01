package utils;

import data.models.Voter;
import dtos.requests.ViewCandidatesRequest;

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
}
