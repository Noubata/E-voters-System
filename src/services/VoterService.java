package services;

import dtos.requests.ViewCandidatesRequest;
import dtos.responses.ViewCandidatesResponse;

public interface VoterService {
    ViewCandidatesResponse viewCandidates(ViewCandidatesRequest viewCandidatesRequest);
}
