
import java.util.Locale;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        //receber os dados no terminal
        Scanner receberDados = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o numero da conta: ");
        int numeroConta = receberDados.nextInt();
        System.out.print("Digite a agência com o digito: ");
        String agencia = receberDados.next();
        System.out.print("Digite o seu nome: ");
        String nomeTitular = receberDados.next();
        System.out.print("Digite o saldo: ");
        double saldoConta = receberDados.nextDouble();
        
        //imprimir os dados informados pelo usuário
        
        System.out.println("Olá " + nomeTitular + " obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia + " conta " + numeroConta);
        System.out.println("e seu saldo de " + saldoConta + " já está disponível para saque.");
        
        
        
        
        
        
    }
}