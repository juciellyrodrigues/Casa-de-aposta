public class Aposta { // declaração da classe chamada Aposta
    private Usuario usuario; // referência ao usuário que fez a aposta (campo privado)
    private String evento; // descrição/nome do evento (ex: "Time A x Time B")
    private String escolha; // a escolha do usuário dentro do evento (ex: "Time A")
    private double valor; // valor apostado (em reais, por exemplo)
    private boolean venceu; // flag que indica se a aposta venceu (true) ou não (false)

    public Aposta(Usuario usuario, String evento, String escolha, double valor){ // construtor da classe Aposta
        this.usuario = usuario; // atribui o usuário passado ao campo usuario da instância
        this.evento = evento; // atribui o evento passado ao campo evento da instância
        this.escolha = escolha; // atribui a escolha passada ao campo escolha da instância
        this.valor = valor; // atribui o valor passado ao campo valor da instância
        this.venceu = false; // inicializa venceu como false (por padrão, a aposta ainda não venceu)
    }

    public void setVenceu(boolean venceu){ // método setter para marcar a aposta como vencedora ou não
        this.venceu = venceu; // atualiza o campo venceu com o valor recebido
    }

    public void pagarPremio(double odd){ // método que paga o prêmio ao usuário caso a aposta tenha vencido
        if (venceu) { // verifica se a aposta venceu
            double premio = valor * odd; // calcula o prêmio multiplicando o valor apostado pela odd
            usuario.getConta().depositar(premio); // deposita o prêmio na conta do usuário (assume que Usuario tem getConta().depositar)
            System.out.println(usuario.getNome() + "ganhou R$" + premio + "!"); // imprime mensagem de vitória (observação abaixo)
        } else {
            System.out.println(usuario.getNome() + "perdeu a aposta."); // imprime mensagem de perda
        }
    }

    public double getValor(){ // getter que retorna o valor apostado
        return valor; // retorna o campo valor
    }

    public Usuario getUsuario(){ // getter que retorna o usuário associado à aposta
        return usuario; // retorna o campo usuario
    }

    public String getEvento(){ // getter que retorna o evento da aposta
        return evento; // retorna o campo evento
    }

    public String getEscolha() { // getter que retorna a escolha do usuário
        return escolha; // retorna o campo escolha
    }

} // fim da classe Aposta
