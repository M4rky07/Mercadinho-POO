public class Principal {
    public static void main(String[] args) {

        // 1. Criar o mercadinho
        Mercadinho mercado = new Mercadinho();

        // 2. Criar vários clientes
        ClienteRegular c1 = new ClienteRegular("João", 100.0);
        ClienteVip c2 = new ClienteVip("Maria", 200.0, "1234");
        ClienteOuroVip c3 = new ClienteOuroVip("Ana", 300.0, "5678", "Rua A, 123");

        // 3. Adicionar os clientes ao mercadinho
        mercado.adicionarCliente(c1);
        mercado.adicionarCliente(c2);
        mercado.adicionarCliente(c3);

        // 4. Imprimir todos os clientes cadastrados
        System.out.println("\n--- CLIENTES CADASTRADOS ---");
        mercado.imprimirClientes();

        // 5. Mostrar o valor total das compras
        System.out.println("\nTotal das compras: R$ " + mercado.calcularTotal());
    }
}

