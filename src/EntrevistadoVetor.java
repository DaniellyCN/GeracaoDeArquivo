

public class EntrevistadoVetor {
    private Entrevistado listaEstudantes[];


    public EntrevistadoVetor(int quantidade){
        this.listaEstudantes = new Entrevistado[quantidade];
    }

    public void adiciona(Entrevistado entrevistado){
        for(int i = 0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i]==null){
                listaEstudantes[i] = entrevistado;
                break;
            }
        }
    }

    public void exibirRelatorioString(){
        System.out.println(this.getTotalEntrevistados());
        System.out.println(this.exibirPercentualGenero());
        System.out.println(this.exibirPercentualFaixaEtaria());
        System.out.println(this.exibirPercentualEnsinoSuperiorCompleto());
        System.out.println(this.exibirFaixaEtariaMaisUsaSmartphone());
        System.out.println(this.exibirtecnologiaMenosUsadaAte15Anos());
        System.out.println(this.exibirAreaPrioritaria());
    }

    public String exibirRelatorio(){
        return "Total de entrevistados: "+this.getTotalEntrevistados()+"\nQuantidade por genero: "+this.exibirPercentualGenero()+"\nPercentual por faixa etária: "+this.exibirPercentualFaixaEtaria()+"\nPercentual de ensino superior completo: "+this.exibirPercentualEnsinoSuperiorCompleto()+"\nFaixa etária que mais usa smartphones: "+this.exibirFaixaEtariaMaisUsaSmartphone()+"\nTecnologia menos usada até os 15 anos: "+this.exibirtecnologiaMenosUsadaAte15Anos()+"\nÁrea prioritária: "+this.exibirAreaPrioritaria();
    }
  
    public String exibirAreaPrioritaria(){
        int contAlimentacao = 0;
        int contEducacao = 0;
        int contLazer = 0;
        int contSeguranca = 0;
        int contCultura = 0;
        int contEmprego = 0;
        int contSaude = 0;
        int contTransporte = 0;
        for(int i = 0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i].areaAlimentacao()){
                contAlimentacao++;
            }else if(listaEstudantes[i].areaEducacao()){
                contEducacao++;
            }else if(listaEstudantes[i].areaLazer()){
                contLazer++;
            }else if(listaEstudantes[i].areaSeguranca()){
                contSeguranca++;
            }else if(listaEstudantes[i].areaCultura()){
                contCultura++;
            }else if(listaEstudantes[i].areaEmprego()){
                contEmprego++;
            }else if(listaEstudantes[i].areaSaude()){
                contSaude++;
            }else if(listaEstudantes[i].areaTransporte()){
                contTransporte++;
            }
        }
    return "Alimentação: "+contAlimentacao+"\nEducação: "+contEducacao+"\nLazer: "+contLazer+"\nSegurança: "+contSeguranca+"\nCultura: "+contCultura+"\nEmprego: "+contEmprego+"\nSaúde: "+contSaude+"\nTransporte: "+contTransporte;
    }

    public String exibirtecnologiaMenosUsadaAte15Anos(){
        int computador = 0;
        int smartphone = 0;
        int notbook = 0;
        int tablet = 0;
        for(int i = 0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i].ate15Anos()){
                if(listaEstudantes[i].computadorPessoal()){
                    computador++;
                }else if(listaEstudantes[i].smartphone()){
                    smartphone++;
                }else if(listaEstudantes[i].notebookOuNetbook()){
                    notbook++;
                }else if(listaEstudantes[i].tablet()){
                    tablet++;
                }
            }
        }
            int tecnologia[] = {computador,smartphone,notbook,tablet};
            int menor = tecnologia[0];
            String tecnologiaString = "";
            for(int j = 0; j < tecnologia.length; j++){
                if(tecnologia[j] <= menor){
                    menor = tecnologia[j];
                }
            }

            if(menor==computador){
                tecnologiaString = "Computador";
            }else if(menor==smartphone){
                tecnologiaString = "Smartphone";
            }else if(menor==notbook){
                tecnologiaString = "Notbook ou Netbook";
            }else if(menor==tablet){
                tecnologiaString = "Tablet";
            }
        
        return "A tecnologia menos utilizada por adolescentes até 15 anos é: "+tecnologiaString;
    }

    public String exibirFaixaEtariaMaisUsaSmartphone(){
        int ate15 = 0;
        int ate29 = 0;
        int ate59 = 0;
        int acima60 = 0;
        for(int i = 0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i].smartphone()){
                if(listaEstudantes[i].ate15Anos()){
                    ate15++;
                }else if(listaEstudantes[i].de16A29Anos()){
                    ate29++;
                }else if(listaEstudantes[i].de39A59Anos()){
                    ate59++;
                }else{
                    acima60++;
                }
            }
        }
        int idades[] = {ate15,ate29,ate59,acima60};
        int maior = 0;
        String faixaEtaria = "";
        for(int j = 0; j < idades.length; j++){
            if(idades[j] >= maior){
                maior = idades[j];
            }
        }

        if(maior==ate15){
            faixaEtaria = "Até 15 anos";
        }else if(maior==ate29){
            faixaEtaria = "De 16 a 29 anos";
        }else if(maior==ate59){
            faixaEtaria = "De 30 a 59 anos";
        }else{
            faixaEtaria = "Acima de 60 anos";
        }
        return "A faixa etária que mais utiliza smartphones: "+faixaEtaria;
    }

    public String exibirPercentualGenero(){
        float contMasculino = 0;
        float contFeminino = 0;
        float contOutro = 0;
        for(int i =0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i].isMasculino()==true){
                contMasculino++;
            }
            if(listaEstudantes[i].isFeminino()==true){
                contFeminino++;
            }
            if(listaEstudantes[i].isOutro()==true){
                contOutro++;
            }
        }
        contMasculino = (contMasculino/listaEstudantes.length)*100;
        contFeminino = (contFeminino/listaEstudantes.length)*100; 
        contOutro = (contOutro/listaEstudantes.length)*100;
        return "Percentual feminino: "+contFeminino+ "% \nPercentual masculino: "+contMasculino+"% \nPercentual Outro: "+contOutro+"%";
    }

    public String exibirPercentualFaixaEtaria(){
        float ate15 = 0;
        float ate29 = 0;
        float ate59 = 0;
        float acima60 = 0;
        for(int i =0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i].ate15Anos()==true){
                ate15++;
            }else if(listaEstudantes[i].de16A29Anos()==true){
                ate29++;
            }else if(listaEstudantes[i].de39A59Anos()==true){
                ate59++;
            }else{
                acima60++;
            }
        }

        return "Até 15: "+ate15+ "\nDe 16 a 29: "+ate29+"\nDe 30 ate 59: "+ate59+"\nAcima de 60 "+acima60;
    }

    public String exibirPercentualEnsinoSuperiorCompleto(){
        float contSuperiorCompleto = 0;
        for(int i =0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i].ensinoSuperiorCompleto()==true){
              contSuperiorCompleto++;
            }
        }

        return "Ensino superior completo: "+contSuperiorCompleto;
    }

    public String exibirPercentualGrauEscolaridade(){
        float ate15 = 0;
        float ate29 = 0;
        float ate59 = 0;
        float acima60 = 0;
        for(int i =0; i < listaEstudantes.length; i++){
            if(listaEstudantes[i].ate15Anos()==true){
                ate15++;
            }else if(listaEstudantes[i].de16A29Anos()==true){
                ate29++;
            }else if(listaEstudantes[i].de39A59Anos()==true){
                ate59++;
            }else{
                acima60++;
            }
        }

        return "Até 15: "+ate15+ "\nDe 16 a 29: "+ate29+"\n De 30 ate 59: "+ate59+"\n Acima de 60 "+acima60;
    }

    public int getTotalEntrevistados(){
        return this.listaEstudantes.length;
    }

    public void setListaEstudantes(Entrevistado entrevistado[]){
        this.listaEstudantes = entrevistado;
    }

    public Entrevistado[] getListaEstudantes(){
        return this.listaEstudantes;
    }
}
