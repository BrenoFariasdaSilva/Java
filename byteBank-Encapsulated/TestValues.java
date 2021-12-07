public class TestValues {   
    public static void main(String[] args) {
        Account firstAccount = new Account(30, 30);
        Account secondAccount = new Account(40, 40);
        Account thirdAccount = new Account(40);

        System.out.println(firstAccount.getAgency());
        System.out.println(secondAccount.getAgency()); 
        System.out.println("Third account agency: " + thirdAccount.getAgency());
        System.out.println("Total of accounts: " + Account.getTotal());
    }   
}