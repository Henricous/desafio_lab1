//classe
public class Loja {
    //ATRIBUTOS
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;



    //METODO CONSTRUTOR todos parametros
    public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
            this.nome = nome;
            this.quantidadeFuncionarios= quantidadeFuncionarios;

            if (salarioBaseFuncionario == 0.0){
                this.salarioBaseFuncionario = -1;
            } else{
            this.salarioBaseFuncionario = salarioBaseFuncionario;
            }
        }

    //METODO CONSTRUTOR 2 parametros
    public Loja (String nome, int quantidadeFuncionarios){

    
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
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
    




    //METODO DE ACESSO nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    //METODO DE ACESSO quantidadeFuncionarios
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    
    //METODO DE ACESSO salarioBaseFuncionario   
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


//METODO toString

    @Override
    public String toString(){
    return "loja [nome=" + nome + ", quantidadeFuncionario= " + quantidadeFuncionarios + ", salarioBaseFuncionario= " +salarioBaseFuncionario + "]";
    }
}









