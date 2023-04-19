// Crie um programa sobre Imposto de Renda (IR) e verificou as regras de alíquota.
// Menor que 1900.0, não paga imposto
// De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
// De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
// De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636

public class ExerciseIncomeTaxRate {
    public static void main(String[] args) {
        double salary = 3330.0;
        double taxes = 0.0;

        if (salary >= 1900.0 && salary <= 2800.0) {
            taxes = salary * 0.075;
        } else if (salary >= 2800.01 && salary <= 3751.0) {
            taxes = salary * 0.075;
        } else if (salary >= 3751.01 && salary <= 4664.0) {
            taxes = salary * 0.075;
        }

        System.out.println("Amount of taxes to be paid: " + taxes);
    }
}
