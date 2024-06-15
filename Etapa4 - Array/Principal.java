import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class Principal {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);

    

    Loja loja = null;
    Endereco enderecoLoja = new Endereco(null,null,null,
    null,null,null,null);
    
    
    Alimentacao lojaAlimentacao = new Alimentacao(null, 0, 0,
     enderecoLoja, null, null, 0);
     Data dataAlvara = new Data(0, 0, 0);

    Bijuteria lojaBijuteria = new Bijuteria(null, 0, 0, 
    enderecoLoja, null, 0, 0);
    Double metaVendas = new Double (0);

    Cosmetico lojaCosmetico = new Cosmetico(null, 0, 0,
     enderecoLoja, null, 0, 0);

    Informática lojaInformática = new Informática(null, 0, 0,
     enderecoLoja, null, 0, 0);

    Vestuario lojaVestuario = new Vestuario(null, 0, 0, 
    enderecoLoja, null, false, 0);


    Data fundacao = new Data(01, 01, 2000);

    Produto produto1 = null; 
    Data dataValidade = new Data(01,01,2000);   
    Data dataAtual = new Data(20, 10, 2023);


    Shopping shopping =new Shopping(null, null, 0);
    Endereco enderecoShopping = new Endereco(null, null, null, null,
    null, null, null);


    
    System.out.println("Nome do shopping?");
    shopping.setNome(scanner.nextLine());

    System.out.println("Quantidade maxima de lojas: ");
    shopping.setQuantidadeMaximaLojas(0);

    //endereco shopping
    System.out.println("Endereço shopping");
    
    System.out.println("Rua: ");
    enderecoShopping.setNomeDaRua(scanner.nextLine());
    
    System.out.println("Cidade: ");
    enderecoShopping.setCidade(scanner.nextLine());
    
    System.out.println("Estado: ");
    enderecoShopping.setEstado(scanner.nextLine());

    System.out.println("Pais: ");
    enderecoShopping.setPais(scanner.nextLine());
    
    System.out.println("Cep: ");
    enderecoShopping.setCep(scanner.nextLine());
    
    System.out.println("Numero: ");
    enderecoShopping.setNumero(scanner.nextLine());

    System.out.println("Complemento: ");
    enderecoShopping.setComplemento(scanner.nextLine());

    shopping.toString();


    
    
        
       

    //OPÇOES PARA O USUARIO DIGITAR
    int opcao = 0;

    while (opcao !=3){
    //Enquanto verdade repita 
    
        
      System.out.println("\n(1) Criar loja");
      System.out.println("(2) Criar produto");
      System.out.println("(3) Sair");
    
     

      opcao = scanner.nextInt();
      scanner.nextLine();
  
     
  
      

      //OBJETO LOJA
      switch(opcao){

      case 1:

        System.out.println("Tipo da loja (Alimentacao, Bijuteria, Cosmetico, Informatica, Vestuario):");
        String tipoLoja = scanner.nextLine();
    
        System.out.println("nome da loja : ");
        loja.setNome(scanner.nextLine());

        System.out.println("Quantidade de funcionarios: ");
        loja.setQuantidadeFuncionarios(scanner.nextInt());
        scanner.nextLine();
        //consumir linha pendente

        System.out.println("Salario base funcionarios: ");
        loja.setSalarioBaseFuncionario(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("quantidade de produtos.");
        loja.setQuantidadeProdutos(scanner.nextInt());

        //Endereço loja
        
        System.out.println("\nEndereço da loja: ");

        System.out.println("Rua: ");
        enderecoLoja.setNomeDaRua(scanner.nextLine());
        
        System.out.println("Cidade: ");
        enderecoLoja.setCidade(scanner.nextLine());
        
        System.out.println("Estado: ");
        enderecoLoja.setEstado(scanner.nextLine());

        System.out.println("Pais: ");
        enderecoLoja.setPais(scanner.nextLine());
        
        System.out.println("Cep: ");
        enderecoLoja.setCep(scanner.nextLine());
        
        System.out.println("Numero: ");
        enderecoLoja.setNumero(scanner.nextLine());

        System.out.println("Complemento: ");
        enderecoLoja.setComplemento(scanner.nextLine());

        

        //Data fundação

        System.out.println("\nData da fundação");
        System.out.println("Dia ");
        fundacao.setDia(scanner.nextInt());

        System.out.println("Mes: ");
        fundacao.setMes(scanner.nextInt());

        System.out.println("Ano: ");
        fundacao.setAno(scanner.nextInt());
        scanner.nextLine();
        
        for (int i=0; i<shopping.getLojas().length; i++){

          if(loja == null){
            switch (tipoLoja) {
              case "Alimentacao":
                System.out.println("Data alvara?");
                dataAlvara.setDia(scanner.nextInt());
                dataAlvara.setMes(scanner.nextInt()); 
                dataAlvara.setAno(scanner.nextInt());
                scanner.nextLine();
                loja = new Alimentacao(tipoLoja, i, i, enderecoShopping, fundacao, dataAlvara, i);

                break;

              case "Bijuteria":
                System.out.println("Meta vendas: ");
                metaVendas = new Double(i);

            }

          }

        }
        break;    
        
        
  
      //OBJETO PRODUTO

      case 2 :
        if(loja != null){
          produto1 = new Produto(null, 0, dataValidade);

          System.out.println("Nome Produto: ");
          produto1.setNome(scanner.nextLine());
          System.out.println("Preço: ");
          produto1.setPreco(scanner.nextDouble());

          System.out.println("Data de Validade: ");
          System.out.println("Dia:");
          dataValidade.setDia(scanner.nextInt());
          dataValidade.setMes(scanner.nextInt());
          dataValidade.setAno(scanner.nextInt());

          
          
          scanner.nextLine(); // Consumir a nova linha
        }
          break;
      

      case 3:
        System.out.println("Saindo....");
        
        }   

        if(opcao != 1 && opcao != 2 && opcao !=3){
          System.out.println("opcao invalida.");  
        }


        //metodo esta vencido
        if(!produto1.estaVencido(dataAtual)){
        System.out.println("\nPRODUTO VENCIDO");
        }
        else{
          System.out.println("\nPRODUTO NÃO VENCIDO");
      }

      //imprimir produto
      System.out.println(produto1.toString());
      //imprimir loja
      System.out.println("\nInformações da Loja: \n" + loja.toString()+ produto1.toString());
      
    }
      scanner.close();
  }
    
}