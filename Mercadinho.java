public class Mercadinho{
    private Cliente [] clientes;
    private int quantidade;

    public Mercadinho(){
        clientes = new Cliente[50];
        quantidade = 0;
    }

    public void adicionarCliente(Cliente cliente){
        if(quantidade < clientes.length){
            clientes[quantidade] = cliente;
            quantidade++;
        }
    }

    public void imprimirClientes(){
        for(int i = 0; i < quantidade; i++){
            if(clientes[i] != null){
                System.out.println(clientes[i]);
            }
        }

    }


    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < quantidade; i++){
            total+=clientes[i].calcularPagamento();
        } return total;
        
    }    

}
