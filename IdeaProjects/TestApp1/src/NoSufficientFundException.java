public class NoSufficientFundException extends Exception {
    public NoSufficientFundException(int accountNo) {
        super("Insufficient Fund to withdraw in account: "+accountNo);
    }
}
