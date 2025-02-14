
import java.util.Scanner;



public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm + 1;
        if (contagem >= 18)
            contagem =18;
          
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i));
        }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

}
