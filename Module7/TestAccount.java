public class TestAccount {

    public static void main(String[] args) {

        Customer c1 = new Customer ( 294, "Natthanan Rungjarudnon", 'm' );

        Account a1 = new Account ( 24094, c1, 70.00);

        System.out.println( "Account id : " + a1.getId() );
        System.out.println( "Account name : " + c1.getName() );
        System.out.println( "Account balance : " + a1.getBalance() );
        // System.out.println( "Deposit : " + a1.deposit() );

    }
    
}
