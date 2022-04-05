public class AccountFactory {
    public static Account createAccount(AccountType accountType, String name, Long balance) {
        switch (accountType) {
            case LongTimeAccount:
                return new LongTimeAccount(name, balance);
            case ShortTimeAccount:
                return new ShortTimeAccount(name, balance);
            case CurrentTimeAccount:
                return new CurrentTimeAccount(name, balance);
            default:
                throw new IllegalArgumentException("account type is not define");
        }
    }
}
