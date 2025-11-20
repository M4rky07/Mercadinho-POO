public class Cliente {
    private String nome;
    private  double valorCompra;

    public Cliente(String nome, double valorCompra){
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public double calcularPagamento(){
        return valorCompra;
    }

    public double getValorDaCompra(){
        return valorCompra;
    }

    public String getNome() {
        return nome;
    }

    public String toString(){
        return "Nome do cliente: " + nome + "\n Valor a se pagar: " + valorCompra;
    }

    
}
