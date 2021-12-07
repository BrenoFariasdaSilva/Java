public class Test {
    public static void main(String[] args) {
        
        FuncionaryTest me = new FuncionaryTest();
        me.setSalary(1250);
        System.out.println (me.getType());
        System.out.println (me.getBonus());

        FuncionaryTest you = new FuncionaryTest();
        you.setType(1);
        you.setSalary(1000);
        System.out.println (you.getType());
        System.out.println (you.getBonus());

    }
}
