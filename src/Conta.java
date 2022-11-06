

public class Conta implements ContaInterface {

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL=1;

    public Conta (Cliente cliente) {

        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.saldo = 0.0;
        this.cliente = cliente;

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double d) {
        this.saldo -= d;
    }

    @Override
    public void depositar(double d) {
        this.saldo += d;

    }


    @Override
    public void transferir(double d, Conta contaDestino) {
        this.sacar(d);
        contaDestino.depositar(d);

    }
}
