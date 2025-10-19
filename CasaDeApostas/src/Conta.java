public class Conta{
    private double saldo;

    public Conta(){
        this.saldo = 0.0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            //se o valor for positivo, soma ao saldo
        } else {
            System.out.println("Valor inválido para depósito");
            //se for zero ou negativo, mostra mensagem de erro.
        }
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
            //Não tem dindin -> erro
        } else if (valor <= 0){
            System.out.println("Valor inválido para saque!");
          // valor zero ou negativp
        } else {
            saldo -= valor;
              //valor válido e suficiente -> subtrai do saldo
        }
    }
}