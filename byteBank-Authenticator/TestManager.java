public class TestManager {
    public static void main(String[] args) {
        Manager me = new Manager();

        me.setName("Breno Farias");
        me.setCpf("11111111111");
        me.setSalary(5000);

        System.out.println(me.getName());
        System.out.println(me.getCpf());
        System.out.println(me.getSalary());

        me.setPassword(2222);
        System.out.println(me.authenticate(2222));
        
        System.out.println(me.getBonus());
    }
}
