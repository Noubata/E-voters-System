package utils;

import data.models.Candidate;
import dtos.responses.ViewCandidatesResponse;

import java.util.ArrayList;
import java.util.List;

public class CandidateMapper {
    public static ViewCandidatesResponse mapToCandidateResponse(Candidate candidate) {
        ViewCandidatesResponse response = new ViewCandidatesResponse();
        response.setCandidateId(candidate.getCandidateId());
        response.setName(candidate.getName());
        response.setParty(candidate.getParty());
        return response;
    }

    public static List<ViewCandidatesResponse> mapToCandidateResponseList(List<Candidate> candidates) {
        List<ViewCandidatesResponse> responses = new ArrayList<>();
        for (Candidate candidate : candidates) {
            ViewCandidatesResponse response = mapToCandidateResponse(candidate);
            responses.add(response);
        }

        return responses;
    }
}