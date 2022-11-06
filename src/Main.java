public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Rondinelle");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupança(cliente);

        cc.depositar(100.0);

        System.out.println(cc.toString());
        System.out.println(cp.toString());

        cc.transferir(100. , cp);

        System.out.println(cc.toString());
        System.out.println(cp.toString());




    }
}