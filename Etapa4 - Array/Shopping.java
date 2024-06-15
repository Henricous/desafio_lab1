import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[]lojas;
    private int quantidadeMaximaLojas;
    
    




public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
    this.nome = nome;
    this.endereco = endereco;
    this.quantidadeMaximaLojas = quantidadeMaximaLojas;
    this.lojas = new Loja[quantidadeMaximaLojas];

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

public void setLojas(Loja[] lojas) {
    this.lojas = lojas;
}

public int getQuantidadeMaximaLojas(){
    return quantidadeMaximaLojas;
}

public void setQuantidadeMaximaLojas(int quantidadeMaximaLojas){
    this.quantidadeMaximaLojas = quantidadeMaximaLojas;
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
public boolean removeLoja(String nomeLoja){

    for (int i=0; i<lojas.length; i++){
        if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
        lojas[i] = null;
        return true;
        }
    }
    return false;
}

//metodo quantidadeLojasPorTipo
public int quantidadeLojasPorTipo(String tipo){

    if(!tipo.equals("Alimentacao") && !tipo.equals("Bijuteria") && !tipo.equals("Cosmetico")
    && !tipo.equals("Informática") && !tipo.equals("Vestuario")){
        return -1;
    }

    int cont = 0;
    for (Loja loja : lojas){
        if(loja != null && loja.getClass().getSimpleName().equals(tipo)){
            cont++;
        }
    }
    return cont;
}


public Informática lojaSeguroMaisCaro(){
    Informática lojaSeguroMaisCaro = null;
    double maiorValorSeguro = 0.0;

    for(Loja loja : lojas){
        if (loja instanceof Informática){
            Informática informatica = (Informática) loja;
            double valorSeguro = informatica.getSeguroEletronicos();

            if(valorSeguro > maiorValorSeguro){
                maiorValorSeguro = valorSeguro;
                lojaSeguroMaisCaro = informatica;
            }


        }

    }
    return lojaSeguroMaisCaro;

}
    

@Override
public String toString(){
    return 
    "\nNome shopping: "+nome+ 
    "\n Endereço: " +endereco +
    "\nLojas: " + Arrays.toString(lojas);
}
}


