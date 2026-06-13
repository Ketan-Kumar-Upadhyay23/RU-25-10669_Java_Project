import java.util.ArrayList;
import java.util.List;

public class PasswordValidationResult {
    private boolean valid;
    private String message;
    private List<String> errors;

    public PasswordValidationResult() {
        this.errors = new ArrayList<>();
        this.message = "";
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void addError(String error) {
        this.errors.add(error);
    }

    public void displayResults() {
        System.out.println("\n=== Password Validation Results ===");
        System.out.println("Valid: " + valid);
        
        if (!message.isEmpty()) {
            System.out.println("Message: " + message);
        }
        
        if (!errors.isEmpty()) {
            System.out.println("Errors:");
            for (String error : errors) {
                System.out.println("  - " + error);
            }
        }
    }
}
