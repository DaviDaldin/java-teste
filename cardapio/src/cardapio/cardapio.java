package cardapio;

public class cardapio {

    private String nome;
    private int codigo;
    private double preco;
    private boolean disponivel;

    public cardapio(String nome, double preco, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public void atualizarItem(String novoNome, double novoPreco, int novoCodigo, boolean novaDisponibilidade) {
        this.nome = novoNome;
        this.preco = novoPreco;
        this.codigo = novoCodigo;
        this.disponivel = novaDisponibilidade;
    }
}
