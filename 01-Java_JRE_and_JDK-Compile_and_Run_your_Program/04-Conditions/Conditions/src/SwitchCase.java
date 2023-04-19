public class SwitchCase {
    public static void main(String[] args) {
        int mes = 10;

//        switch (mes) {
//            case 1:
//                System.out.println("O mês é Janeiro");
//                break;
//            case 2:
//                System.out.println("O mês é Fevereiro");
//                break;
//            case 3:
//                System.out.println("O mês é Março");
//                break;
//            case 4:
//                System.out.println("O mês é Abril");
//                break;
//            case 5:
//                System.out.println("O mês é Maio");
//                break;
//            case 6:
//                System.out.println("O mês é Junho");
//                break;
//            case 7:
//                System.out.println("O mês é Julho");
//                break;
//            case 8:
//                System.out.println("O mês é Agosto");
//                break;
//            case 9:
//                System.out.println("O mês é Setembro");
//                break;
//            case 10:
//                System.out.println("O mês é Outubro");
//                break;
//            case 11:
//                System.out.println("O mês é Novembro");
//                break;
//            case 12:
//                System.out.println("O mês é Dezembro");
//                break;
//            default:
//                System.out.println("Mês inválido");
//                break;
//        }

        // The break will interrupt the execution of the case that contains it,
        // so that the other conditions are not analyzed and executed.
        // If no condition is accepted, the default code will be executed. For example,
        // if the month is 13, the printout will be Invalid Month.
        // So switch is a solution for chained ifs.

        // Or even better for reading:
        switch (mes) {
            case 1 -> System.out.println("O mês é Janeiro");
            case 2 -> System.out.println("O mês é Fevereiro");
            case 3 -> System.out.println("O mês é Março");
            case 4 -> System.out.println("O mês é Abril");
            case 5 -> System.out.println("O mês é Maio");
            case 6 -> System.out.println("O mês é Junho");
            case 7 -> System.out.println("O mês é Julho");
            case 8 -> System.out.println("O mês é Agosto");
            case 9 -> System.out.println("O mês é Setembro");
            case 10 -> System.out.println("O mês é Outubro");
            case 11 -> System.out.println("O mês é Novembro");
            case 12 -> System.out.println("O mês é Dezembro");
            default -> System.out.println("Mês inválido");
        }
    }
}
