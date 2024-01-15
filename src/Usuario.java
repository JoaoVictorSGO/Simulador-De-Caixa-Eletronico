import java.util.Scanner;

public class Usuario{
    public static void main(String[] args) {
        ContaTerminal contaDoBanco = new ContaTerminal();

        contaDoBanco.nomeUsuario();
        contaDoBanco.numeroDaConta();
        contaDoBanco.agenciaBancaria();
        contaDoBanco.deposito();
        System.out.println("\nOlá " + contaDoBanco.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaDoBanco.agencia + ", conta " + contaDoBanco.conta + " e seu saldo " + contaDoBanco.saldo + " já está disponível para saque");
    }
}