public class TestEmployee {
    public static void main(String[] args) {
        Designer firstFuncionary = new Designer();
        firstFuncionary.setName("Breno Farias");
        firstFuncionary.setCpf("11111111111");
        firstFuncionary.setSalary(1250);

        System.out.println(firstFuncionary.getName());
        System.out.println(firstFuncionary.getBonus());
    }
}
