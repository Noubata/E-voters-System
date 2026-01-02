package services;

import dtos.requests.LoginRequest;
import dtos.requests.ViewCandidatesRequest;
import dtos.responses.LoginResponse;
import dtos.responses.ViewCandidatesResponse;

import java.util.List;

public interface VoterService {
    List<ViewCandidatesResponse> viewCandidates(ViewCandidatesRequest request);
    LoginResponse login (LoginRequest request);
}
