import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            scanner.close();

            try {
                if (num1 > num2) {
                    throw new ClassException.ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
                }

                for (int i = num1; i <= num2; i++) {
                    System.out.println("Imprimindo o número " + i);
                }
            } catch (ClassException.ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }

    }
}



