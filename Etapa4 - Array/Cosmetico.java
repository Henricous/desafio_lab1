

public class Cosmetico extends Loja {

    private double taxaComercializacao;
  

    //construtor
    public Cosmetico (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
     Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeProdutos){
        //herança
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario,endereco,dataFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;   
        

    }
    //acessos
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }


  
@Override
public String toString(){
    return 
    "Nome Loja: " + getNome() + 
    
    ".\nQuantidade Funcionario: " + getQuantidadeFuncionarios() + 
    ".\nTamanho Loja: "+ tamanhoDaLoja()+
    ".\nSalario Base Funcionarios: " +getSalarioBaseFuncionario()+ 
    "\nEndereço Loja: " +getEndereco()+
    "\nData da fundação:" +getDataFundacao()+
    "\nData de comercialização: " +taxaComercializacao;

}}