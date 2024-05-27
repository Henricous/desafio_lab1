public class Vestuario extends Loja {
    boolean  produtosImportados;

    public Vestuario (String nome,int quantidadeFuncionarios, double salarioBaseFuncionario, 
    Endereco endereco,Data dataFundacao, boolean produtosImportados){
        //superclasse
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;

    }
    //acessos
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString(){
    return "Nome Loja: " + getNome() + ". \nQuantidade Funcionario: " + getQuantidadeFuncionarios() + 
    ".\nTamanho Loja: "+ tamanhoDaLoja()+". \nSalario Base Funcionarios: "
     +getSalarioBaseFuncionario()+ "\nEndereço Loja: " +getEndereco()+
     "\nData da fundação:" +getDataFundacao()+"\nProduto importado: " +produtosImportados;
    }
}

