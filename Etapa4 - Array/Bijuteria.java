public class Bijuteria extends Loja {
    double metaVendas;

    public Bijuteria (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco,Data dataFundacao, double metaVendas){
        
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas=metaVendas;
    }
    //acessos
    public double getMetaVendas(){
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString (){
        return "Nome Loja: " + getNome() + ". \nQuantidade Funcionario: " + getQuantidadeFuncionarios() + 
    ".\nTamanho Loja: "+ tamanhoDaLoja()+
    ". \nSalario Base Funcionarios: " +getSalarioBaseFuncionario()+ "\nEndereço Loja: " +getEndereco()+
    "\nMeta de vendas: " +metaVendas+ "\nData da fundação:" +getDataFundacao() ;
    }
}
