public class Usuario {
    private String nome;
    // Atributo privado que guarda o nome do usuário.
    private Conta conta;
      // Atributo privado que guarda a conta bancária do usuário.

public Usuario(String nome){
    this.nome = nome; //atribui o nome passado como parâmetro ao atributo 'nome' do user.
    this.conta = new Conta(); //cria uma nova conta para o usuário automatic.
}

public String getNome(){
    //método público que retorna p nome usuário
    return  nome;
}

public Conta getConta(){
    //método público que retorna a conta do user.
    return conta;
}

public void mostrarSaldo() {
    // Método que exibe o saldo atual do usuário no console.
    System.out.println(nome + "Saldo de R$" + conta.getSaldo());
    // Mostra o nome do usuário seguido do saldo da conta.
    }
}
