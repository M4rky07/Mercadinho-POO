public class ClienteVip extends Cliente{

    private String numeroCartao;


    public ClienteVip(String nome, double valorCompra, String numeroCartao){
        super(nome, valorCompra);
        this.numeroCartao = numeroCartao;
    }

    public double calcularPagamento(){
            return getValorDaCompra() * 0.10;
        }

    public String toString(){
            return "Cliente Vip: " + super.toString()
             + "\n O numero do cartão: " + numeroCartao; 
        }




    }
