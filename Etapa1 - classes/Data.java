//CLASSE DATA
public class Data {
    //ATRIBUTOS
    private int dia;
    private int mes;
    private int ano;

    //METODO CONSTRUTOR
    public Data(int dia, int mes, int ano){
        if(!validarData(dia, mes, ano)){
            System.out.println("[ERRO] a data será alterada para data padrão: 01/01/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000; 
            return;
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;   
    }

    //METODO VALIDAR MESES
    public boolean validarData(int dia, int mes, int ano){
        //verificar se mes esta entre 1 e 12
        if (mes < 1 || mes > 12) {
            return false;
        }

        //se dia menor que 1 retorna falso
        if (dia < 1){
            return false;
        }

        if (mes == 2) {
            // Se for fevereiro, verifica se é bissexto e retorna 29 se for, caso contrário retorna 28
            return verificaAnoBissexto() ? dia <= 29 : dia <= 28;
        } else {
            // Se não for fevereiro, verifique o número máximo de dias com base no mês
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                return dia <= 30; // Meses com 30 dias
            } else {
                return dia <= 31; // Meses com 31 dias
            }
        }

    }





        

    //METODOS DE ACESSO
    
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
        return mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }


    //METODO toString
    @Override
    public String toString (){
        return "Data [dia =" + dia + ", mes =" + mes + ", ano =" + ano + "]";
    }


    //METODO PRA VER SE O ANO É BISSEXTO
        public boolean verificaAnoBissexto () {
            return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        } 
    }