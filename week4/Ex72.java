package week4;

public class Ex72 {
    public static void main(String[] args) {

       /* EX 72.1
       Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
        */

      /* EX 72.2
        Account mattsAccount = new Account("matt", 1000.00);
        Account myAccount = new Account("me", 0.00);
        mattsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(mattsAccount);
        System.out.println(myAccount);
       */

        // EX 72.3
        Account accountA = new Account("A",100.00);
        Account accountB = new Account("B", 0.00);
        Account accountC = new Account("C", 0.00);

        accountA.withdrawal(50.00);
        accountB.deposit(50.00);
        accountB.withdrawal(25.00);
        accountC.deposit(25.00);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
        }
    }

