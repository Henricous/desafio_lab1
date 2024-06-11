public class Alimentacao extends Loja {
    private Data dataAlvara;
    private final String tipo;
    
    
   

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
    Endereco endereco,Data dataFundacao, Data dataAlvara, int quantidadeProdutos){
        

        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
         this.dataAlvara = dataAlvara;
         this.tipo = "alimentacao";  
        
    }
    //acessos
    public Data getDataAlvara(){
        return dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    public String getTipo(){
        return tipo;
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
    "\nData Alvara: " +dataAlvara;
    }

}
