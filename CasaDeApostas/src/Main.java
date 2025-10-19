public class Main {
    public static void main(String[] args) {
           // Método principal que roda quando o programa é executado.
        Usuario jj = new Usuario("JJ");   // Cria um usuário chamado "JJ" e automaticamente cria a conta dele.
        jj.getConta().depositar(100.0);   // Deposita R$100,00 na conta do JJ.

        Usuario maria = new Usuario("Maria");  // Cria outro usuário chamado "Maria", também com conta própria.
        maria.getConta().depositar(50.0);  // Deposita R$50,00 na conta da Maria.

        System.out.println("--- Saldo inicial ---");
         // Exibe o saldo inicial de JJ e Maria.
        jj.mostrarSaldo();
        maria.mostrarSaldo(); 

        System.out.println("\n--- Apostas ---");
        // Cria a primeira aposta: JJ aposta R$20,00 no Time A.
        Aposta aposta1 = new Aposta(jj, "Time A vs Time B", "Time A", 20.0);
               // Retira R$20,00 da conta da JJ, porque ele apostou esse valor.
        jj.getConta().sacar(aposta1.getValor());

           // Cria a segunda aposta: Maria aposta R$10,00 no Time B.
        Aposta aposta2 = new Aposta(maria, "Time A vs Time B", "Time B", 10.0);
        // Retira R$10,00 da conta da Maria.
        maria.getConta().sacar(aposta2.getValor());

        // Simular resultado
        System.out.println("\nResultado: Time A venceu!");
        aposta1.setVenceu(true);  // Marca a aposta de JJ como vencedora.
        aposta2.setVenceu(false); // Marca a aposta de Maria como perdedora.

        aposta1.pagarPremio(2.0); // odd 2.0
         // Calcula o prêmio de JJ: 20 * 2 = 40, e deposita na conta dela.
        aposta2.pagarPremio(1.8); // odd 1.8
           // Calcula o prêmio de Maria, mas como perdeu, só mostra mensagem de perda.

        System.out.println("\n--- Saldo final ---");
        jj.mostrarSaldo();
        maria.mostrarSaldo();
         // Exibe o saldo final de JJ e Maria.
        
    }
}
