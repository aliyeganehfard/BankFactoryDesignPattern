public class CurrentTimeAccount extends Account{
    public CurrentTimeAccount(String name, Long balance) {
        super(name, balance);
        if(balance < 100)
            throw new IllegalArgumentException("current time account can not be less than 100");
    }
    @Override
    protected boolean canBeIssued() {
        return true;
    }

    @Override
    protected boolean includeProfit() {
        return false;
    }
}
