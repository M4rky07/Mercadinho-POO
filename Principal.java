public class Principal {
    public static void main(String[] args) {

  
        Mercadinho mercado = new Mercadinho();


        ClienteRegular c1 = new ClienteRegular("João", 100.0);
        ClienteVip c2 = new ClienteVip("Maria", 200.0, "1234");
        ClienteOuroVip c3 = new ClienteOuroVip("joão, ", 324, "Rua carmelia guedes");


        mercado.adicionarCliente(c1);
        mercado.adicionarCliente(c2);
        mercado.adicionarCliente(c3);

    
        System.out.println("\n--- CLIENTES CADASTRADOS ---");
        mercado.imprimirClientes();

        System.out.println("\nTotal das compras: R$ " + mercado.calcularTotal());
    }
}

