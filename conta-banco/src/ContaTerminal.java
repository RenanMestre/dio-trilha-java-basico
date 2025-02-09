// Criado por Renan Mestre
// Desenvolvido no dia 08/02/25
// Importar o Scanner
import java.util.Scanner;

public class ContaTerminal {
    // Variáveis 
    static String agencia;
    static int numero;
    static String nome;
    static String sobrenome;
    static Double saldo;
    
    static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws Exception {
        // Apresentação do sistema
        System.out.println("Olá, seja muito bem vindo ao nosso banco!\nSiga as próximas estapas para a criação de conta!\n");
        
        // Exibir as mensagens para o usuário
        // Obter os valores digitados
        // Número da agência
        System.out.print("Por favor digite o número da Agência: ");
        agencia = scanner.nextLine();
        // Número de conta
        System.out.print("Informe o número de conta: ");
        numero = scanner.nextInt();
        // Segurança na requisição do nome
        System.out.print("Informe o seu primeiro nome: ");
        nome = scanner.next();
        System.out.print("Informe o seu sobrenome: ");
        sobrenome = scanner.next();
        //  Valor de saldo
        System.out.print("O valor do saldo: ");
        saldo = scanner.nextDouble();
 
        // Exibir a mensagem de conta criada e fim de sistema
        System.out.println("\nOlá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
        System.out.println("<------------Obrigado por usar nosso sistema------------>\n");    
    }
}
