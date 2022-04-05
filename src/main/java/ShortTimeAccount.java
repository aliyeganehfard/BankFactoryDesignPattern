public class ShortTimeAccount extends Account{
    public ShortTimeAccount(String name, Long balance) {
        super(name, balance);
        if(balance <50)
            throw new IllegalArgumentException("short time account can not be less than 50");
    }

    @Override
    protected boolean canBeIssued() {
        return false;
    }

    @Override
    protected boolean includeProfit() {
        return true;
    }
}
