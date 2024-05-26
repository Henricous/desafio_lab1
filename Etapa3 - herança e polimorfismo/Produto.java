//CLASSE Produto
public class Produto{

    //ATRIBUTOS
    private String nome;
    private double preco;

    private Data dataValidade;
    private Data dataAtual;
   
    
    
    //METODO CONSTRUTOR
    public Produto (String nome, double preco, Data dataValidade){
    
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        
        //INSTANCIAR DATA ATUAL = FIXAR DATA.

    }

    //METODO estaVencido
    public boolean estaVencido (Data dataAtual){

        //SE A DATA ATUAL FOR MAIOR QUE A DATA DE VALIDADE, RETORNA TRUE

        if (dataAtual.getDia() > dataValidade.getDia() && dataAtual.getMes() >= dataValidade.getMes() 
        || (dataAtual.getAno() > dataValidade.getAno())){
            
            return true;
        }
          
        else{

            return false;
        }
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

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    public Data getDataValidade(){
        return dataValidade;
    }




    //METOTO toString

    @Override
    public String toString(){
        return "\nProduto Nome: " + nome + ".\nPreço: " + preco + ".\nData de validade:\n" +dataValidade;
    }
}
