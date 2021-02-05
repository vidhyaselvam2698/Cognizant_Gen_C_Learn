public class InvalidPolicyIdException extends Exception {
    /**
     * Custom exception for invalid policy id
     * @param message Message passed to be thrown when the invalid policy id is detected
     */
    public InvalidPolicyIdException(String message) {
        super(message);
    }
}