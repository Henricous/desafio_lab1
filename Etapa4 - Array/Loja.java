//classe
public class Loja {
    //ATRIBUTOS
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[]estoqueProdutos;
    private int quantidadeProdutos;


    //METODO CONSTRUTOR todos parametros
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
     Endereco endereco,Data dataFundacao, int quantidadeProdutos){

        this.quantidadeProdutos = quantidadeProdutos;
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;

        estoqueProdutos = new Produto[quantidadeProdutos];

            if (salarioBaseFuncionario == 0.0){
                this.salarioBaseFuncionario = -1;
            } 
            else{
            this.salarioBaseFuncionario = salarioBaseFuncionario;
            }
        }


    //METODO CONSTRUTOR 2 parametros
    public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, 
    Data dataFundacao,int quantidadeProdutos){

        this.quantidadeProdutos = quantidadeProdutos;
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;

        estoqueProdutos = new Produto[quantidadeProdutos];
    }


    //imprimir produtos
    public Produto[] imprimeProdutos(){
        for (int i=0;i<estoqueProdutos.length; i++){
        System.out.println(estoqueProdutos[i]);
    }
    return estoqueProdutos;
}


    public boolean insereProduto(Produto produto){
        for (int i=0; i < estoqueProdutos.length; i++){
        if (estoqueProdutos[i]==null){
            estoqueProdutos[i] = produto;
            return true;

        }
    }
    return false;
    }


public boolean removeProduto(String nomeProduto){
    for (int i=0; i < estoqueProdutos.length; i++){
        if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
            estoqueProdutos[i] = null;
            return true;
       }
    }
return false;
}

    
    //METODO gastoComSalario
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        else {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
    }

    
    //METODO tamanhoDaLoja
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';
        }
        else{
            return 'G';
        }
    }
    

    //getters e setters

    public void setQuantidadeProdutos(int quantidadeProdutos){
        this.quantidadeProdutos = quantidadeProdutos;
    }
    public int getQuantidadeProdutos(){
        return quantidadeProdutos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

     
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double getSalarioBaseFuncionario(){
        if(salarioBaseFuncionario ==0.0){
            return -1;
        } else{
        return salarioBaseFuncionario;
        }
    }
    
    

   
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return endereco;
    }


    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    public Data getDataFundacao(){
        return dataFundacao;
    }


    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }


    //METODO toString
    @Override
    public String toString(){
    return "Nome Loja: " + nome + ". \nQuantidade Funcionario: " + quantidadeFuncionarios + 
    ".\nTamanho Loja: "+ tamanhoDaLoja()+
    ". \nSalario Base Funcionarios: " +salarioBaseFuncionario+ "\nEndereço Loja: " +endereco+
     "\nData da fundação:" +dataFundacao+ "\nQuantidade estoque"+estoqueProdutos;
    }

    
}









