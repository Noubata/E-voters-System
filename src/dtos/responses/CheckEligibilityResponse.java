package dtos.responses;

public class CheckEligibilityResponse {
    private boolean isEligible;
    private String message;

    public CheckEligibilityResponse(boolean isEligible, String message) {
        this.isEligible = isEligible;
        this.message = message;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
