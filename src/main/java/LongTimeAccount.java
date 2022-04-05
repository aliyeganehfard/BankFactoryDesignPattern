public class LongTimeAccount extends Account{
    public LongTimeAccount(String name, Long balance) {
        super(name, balance);
        if(balance < 100)
            throw new IllegalArgumentException("long time account can not be less than 100");
    }

    @Override
    protected boolean canBeIssued() {
        return false;
    }

    @Override
    protected boolean includeProfit() {
        return false;
    }
}
