import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal{
    
    String nome, agencia;
    int conta;
    double saldo;
    public void nomeUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite o seu nome: ");
        nome = input.nextLine();
        System.out.println("\nO seu nome foi cadastrado com sucesso!");
        
        
   }

    public void numeroDaConta() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o número da conta: ");
        conta = input.nextInt();
        System.out.println("\nO número da sua conta foi cadastrado com sucesso!");
        
        
    }

    public void agenciaBancaria() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite o número da sua agencia: ");
        agencia = input.next();
        System.out.println("\nA Sua Agencia foi cadastrada com sucesso!");
        
    }

    public void deposito() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("\nDigite o valor a ser depositado: ");
        saldo = input.nextDouble();
        System.out.println("\nSaldo depositado com sucesso!");
    }
}
