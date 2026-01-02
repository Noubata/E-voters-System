package controllers;

import dtos.responses.ResultResponse;
import services.VoterService;

public class VoterControllerImplementation implements VoterController {

    private VoterService voterService;

    public VoterControllerImplementation(VoterService voterService) {
        this.voterService = voterService;
    }

    @Override
    public ResultResponse viewResults() {
        return voterService.viewResults();
    }
}