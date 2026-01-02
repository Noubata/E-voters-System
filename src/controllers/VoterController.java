package controllers;

import dtos.requests.ViewCandidatesRequest;
import dtos.responses.ResultResponse;
import dtos.responses.ViewCandidatesResponse;

public interface VoterController {
    ResultResponse viewResults();
}