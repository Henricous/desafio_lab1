public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[]lojas;

public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
    Loja[]Loja = new Loja[quantidadeMaximaLojas];
}

//Acessos getters e setters 
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Endereco getEndereco() {
    return endereco;
}

public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}

public Loja[] getLojas() {
    return lojas;
}

public void setLoja(Loja[] lojas) {
    this.lojas = lojas;
}

//metodo insereLoja
public boolean insereLoja(Loja loja){
    for (int i=0; i<lojas.length; i++){
    if(lojas[i] == null){
        lojas[i] = loja;
        return true;
    }
}
return false;
}

//metodo removeLojas
public boolean removeLoja(String loja){
    for (int i=0; i<lojas.length; i++){
        if(lojas[i] != null && lojas[i].getNome().equals(loja)){
        lojas[i] = null;
        return true;
        }
    }
    return false;
}

//metodo quantidadeLojasPorTipo
public int quantidadeLojasPorTipo(String tipo){
    
    String[]tiposValidos ={"alimentacao", "bujuteria", "costemtico" , "informatica"};
    if(!tiposValidos.equals(tipo)){
        return -1;
    }

    int cont = 0;
    for (int i=0; i<lojas.length; i++){        
        if(lojas[i]!= null && lojas[i].getNome().equalsIgnoreCase(tipo)){
        cont += 1;
        }
    }
    return cont;
}

    

@Override
public String toString() {
    return "\nNome shopping: "+nome+ "\n Endereço: " +endereco + "\nLojas: " +lojas ;
}


}


