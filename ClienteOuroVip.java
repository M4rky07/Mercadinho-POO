public class ClienteOuroVip extends ClienteVip {

    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String endereco) {
        super(nome, valorDaCompra, endereco);
        this.endereco = endereco;
    }

    public double calcularPagamento() {
        return getValorDaCompra() * 0.15;
    }

    public String getEndereco() {
        return endereco;
    }

     public String toString(){
            return "Cliente  Ouro Vip: " + " Nome: " + getNome() + 
            "\n Valor da compra:" + getValorDaCompra() +
            "\n Seu endereço: " + endereco ; 
        }






}
