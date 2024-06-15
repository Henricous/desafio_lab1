public class Informática extends Loja{

    private double seguroEletronicos;

    

    public Informática(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco,Data dataFundacao, double seguroEletronicos, int quantidadeProdutos){
        
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 
        quantidadeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    //acessos
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }


@Override
public String toString(){
    return 
    "Nome Loja: " + getNome() + 
    
    "\nQuantidade Funcionario: " + getQuantidadeFuncionarios() + 
    "\nTamanho Loja: "+ tamanhoDaLoja()+
    "\nSalario Base Funcionarios: " +getSalarioBaseFuncionario()+ 
    "\nEndereço Loja: " +getEndereco()+
    "\nData da fundação:" +getDataFundacao() + 
    "\nSeguro eletronicos: " +seguroEletronicos;
}
}    