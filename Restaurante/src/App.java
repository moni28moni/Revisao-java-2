import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        //registrando os pratos 
        Restaurante rest = new Restaurante();
        Restaurante.adicionarPrato("Batata Frita Grande", 17.00);

        Mesa mesa = new Mesa(true, "Mendes", true);
        rest.adicionarMesa(mesa);
        Conta conta = new Conta();
        conta.adicionarPrato("Batata Frita Grande", 2);
        mesa.setConta(conta);

        conta.imprimirConta();

        //criando um cardapio (os pratos com os valores e a mesa)
    }
}