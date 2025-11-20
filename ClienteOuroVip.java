public class ClienteOuroVip extends Cliente {

    private String numeroCartao;
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
        this.endereco = endereco;
    }

    public double calcularPagamento() {
        return getValorDaCompra() * 0.15;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getEndereco() {
        return endereco;
    }

     public String toString(){
            return "Cliente Vip: " + super.toString() + "\n O numero do cartão: "
             + numeroCartao +
             "\n Seu endereço: " + endereco ; 
        }






}
