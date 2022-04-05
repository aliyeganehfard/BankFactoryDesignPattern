public class Main {
    public static void main(String[] args) {
        Account account1 =
                AccountFactory.createAccount(
                        AccountType.ShortTimeAccount,
                        "ali hoseini",
                        50L
                        );

        Account account =
                AccountFactory.createAccount(
                        AccountType.CurrentTimeAccount,
                        "mohammad mohammadi",
                        100L
                );


//        Account account3 =
//                AccountFactory.createAccount(
//                        AccountType.ShortTimeAccount,
//                        "ali hoseini",
//                        30L
//                );
//
//        Account account4 =
//                AccountFactory.createAccount(
//                        AccountType.CurrentTimeAccount,
//                        "mohammad mohammadi",
//                        70L
//                );

    }
}
