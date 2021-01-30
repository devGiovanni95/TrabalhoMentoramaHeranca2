public class TestaConta {
    public static void main(String[] args) {
        Conta contas[] = new Conta[3];

        ContaCorrente cc = new ContaCorrente(1, 1, "Banco 1 ", 100, 1000);
        ContaPoupanca cp = new ContaPoupanca(1, 1, "Banco 1 ", 100, 20, 0.05);
        ContaSalario cs = new ContaSalario(1, 1, "Banco 1 ", 1000, 3);



        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cs;

        cc.sacar(300);

        System.out.println("Obtendo o saldo das contas: ");
        for (Conta conta:contas){
            System.out.println(conta);
            System.out.println("Saldo atual: R$ "+conta.getSaldo());
            System.out.println(" ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println(" ");

        }
    }
}
