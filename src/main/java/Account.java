public abstract class Account {
    private String name;
    private Long balance;

    public Account(String name, Long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Long getBalance() {
        return balance;
    }

    protected abstract boolean canBeIssued();
    protected abstract boolean includeProfit();

}
