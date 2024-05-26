//CLASSE Produto
public class Produto{

    //ATRIBUTOS
    private String nome;
    private double preco;
    
    //METODO CONSTRUTOR
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }

    //METODOS DE ACESSO
    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }


    //METOTO toString

    @Override
    public String toString(){
        return "Produto [nome =" + nome + ", preco =" + preco + "]";
    }
}
