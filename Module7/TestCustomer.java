public class TestCustomer {

    public static void main(String[] args) {

        Customer c1 = new Customer ( 294, "Natthanan Rungjarudnon", 'm' );

        System.out.println( "Customer id : " + c1.getId() );
        System.out.println( "Customer name : " + c1.getName() );
        System.out.println( "Customer gender : " + c1.getGender());

    }

}
