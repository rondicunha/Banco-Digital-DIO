public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "ContaPoupança{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                '}';
    }
}
