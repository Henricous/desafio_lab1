
import java.util.Scanner;

public class Principal {


     public static void main(String[] args) {


      
        Scanner scanner = new Scanner(System.in);

        Loja loja = new Loja(null, 0, 0.0, null, null);
        Endereco enderecoLoja = new Endereco(null,null,null,null,null,null,null);
        Data fundacao = new Data(01, 01, 2000);

        Produto produto1 = null; 
        Data dataValidade = new Data(01,01,2000);   
        Data dataAtual = new Data(20, 10, 2023)  ;

        
        
        

        //OPÇOES PARA O USUARIO DIGITAR
        int opcao = 0;
        //Enquanto verdade repita 
        while (opcao !=  3 ){
        System.out.println("\n(1) Criar loja");
        System.out.println("(2) Criar produto");
        System.out.println("(3) Sair");

        opcao = scanner.nextInt();
        scanner.nextLine();
        
      

           //OBJETO LOJA
        switch(opcao){

        case 1:
            System.out.println("Nome da loja: ");
            loja.setNome(scanner.nextLine());

            System.out.println("Quantidade de funcionarios: ");
            loja.setQuantidadeFuncionarios(scanner.nextInt());
            scanner.nextLine();
          //consumir linha pendente

            System.out.println("Salario base funcionarios: ");
            loja.setSalarioBaseFuncionario(scanner.nextDouble());
            scanner.nextLine();
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
            System.out.println("Dia");
            fundacao.setDia(scanner.nextInt());

            System.out.println("Mes:");
            fundacao.setMes(scanner.nextInt());

            System.out.println("Ano:");
            fundacao.setAno(scanner.nextInt());
            scanner.nextLine();
                         
          
      
      
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
      
      default:
          System.out.println("opcao invalida.");

      }   }


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
      System.out.println("\nInformações da Loja: \n" + loja.toString()+ enderecoLoja.toString()
            +"\nData Fundação: \n"+ fundacao.toString());



      



    }
      
  }
    
