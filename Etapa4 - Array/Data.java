public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (!validarData(dia, mes, ano)) {
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

    private boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1) {
            return false;
        }

        if (mes == 2) {
            // Verifica se é ano bissexto
            if (dia > 29 || (dia == 29 && !verificaAnoBissexto(ano))) {
                return false;
            }
        } else {
            // Verifica o número máximo de dias com base no mês
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                return false;
            } else if (dia > 31) {
                return false;
            }
        }

        return true;
    }

    private boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
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
        return "Dia: " + dia + ". \nMes: " + mes + ". \nAno: " + ano;
    }


    //METODO PRA VER SE O ANO É BISSEXTO
        public boolean verificaAnoBissexto () {
            return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        } 
    }