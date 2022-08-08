public class Entrevistado{
    
    private String genero;
    private String idade;
    private String escolaridade;
    private String regiao;
    private String tecnologia;
    private String areaPrioritaria;  
    
    public Entrevistado(String genero, String idade, String escolaridade, String regiao, String tecnologia, String areaPrioritaria ){
        this.genero = genero;
        this.idade = idade;
        this.escolaridade = escolaridade;
        this.regiao = regiao;
        this.tecnologia = tecnologia;
        this.areaPrioritaria = areaPrioritaria;
    }
    
    // genero
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    // idade
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public String getIdade(){
        return idade;
    }
    
    // escolaridade
    public void setEscolaridade(String escolaridade){
        this.escolaridade = escolaridade;
    }
    
    public String getEscolaridade(){
        return escolaridade;
    }
    
    //regiao
    public void setRegiao(String regiao){
        this.regiao = regiao;
    }
    
    public String getRegiao(){
        return regiao;
    }
    
     //tecnologia
    public void setTecnologia(String tecnologia){
        this.tecnologia = tecnologia;
    }
    
    public String getTecnologia(){
        return tecnologia;
    }
    
    //areaPrioritaria
    public void setAreaPrioritaria(String areaPrioritaria){
        this.areaPrioritaria = areaPrioritaria;
    }
    
    public String getAreaPrioritaria(){
        return areaPrioritaria;
    }
    
    //métodos facilitadores
    //genero
    public boolean isFeminino(){
        if(this.genero.equals("f")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isMasculino(){
        if(this.genero.equals("m")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isOutro(){
        if(this.genero.equals("o")){
            return true;
        }else{
            return false;
        }
    }
    //idade
    public boolean ate15Anos(){
        if(this.idade.equals(" Até 15 anos")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean de16A29Anos(){
        if(this.idade.equals(" De 16 a 29 anos")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean de39A59Anos(){
        if(this.idade.equals(" De 30 a 59 anos")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean acimaDe60Anos(){
        if(this.idade.equals(" Acima de 60 anos")){
            return true;
        }else{
            return false;
        }
    }

    public boolean ensinoMedioCompleto(){
        if(this.escolaridade.equals(" Ensino médio completo")){
            return true;
        }else{
            return false;
        }
    }

    public boolean ensinoSuperiorCompleto(){
        if(this.escolaridade.equals(" Ensino superior completo")){
            return true;
        }else{
            return false;
        }
    }

    public boolean ensinoMedioIncompleto(){
        if(this.escolaridade.equals(" Ensino médio incompleto")){
            return true;
        }else{
            return false;
        }
    }

    public boolean ensinoSuperiorIncompleto(){
        if(this.escolaridade.equals(" Ensino superior incompleto")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean ensinoFundamentalIncompleto(){
        if(this.escolaridade.equals(" Ensino fundamental incompleto")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean ensinoFundamentalCompleto(){
        if(this.escolaridade.equals(" Ensino fundamental completo")){
            return true;
        }else{
            return false;
        }
    }

    public boolean regiaoExtremoOeste(){
        if(this.regiao.equals(" Região Extremo Oeste")){
            return true;
        }else{
            return false;
        }
    }

    public boolean regiaoLesteIbirapuita(){
        if(this.regiao.equals(" Região Leste/Ibirapuitã")){
            return true;
        }else{
            return false;
        }
    }

    public boolean regiaoOesteRegalado(){
        if(this.regiao.equals(" Região Oeste/Regalado")){
            return true;
        }else{
            return false;
        }
    }

    public boolean regiaoSul(){
        if(this.regiao.equals(" Região Sul")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean regiaoCidadeAltaAguateiros(){
        if(this.regiao.equals(" Região Cidade Alta/Aguateiros")){
            return true;
        }else{
            return false;
        }
    }

    public boolean regiaoExtremoLeste(){
        if(this.regiao.equals(" Região Extremo Leste")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean regiaoNorte(){
        if(this.regiao.equals(" Região Norte")){
            return true;
        }else{
            return false;
        }
    }

    public boolean notebookOuNetbook(){
        if(this.tecnologia.equals(" Notebook ou Netbook")){
            return true;
        }else{
            return false;
        }
    }

    public boolean smartphone(){
        if(this.tecnologia.equals(" Smartphone")){
            return true;
        }else{
            return false;
        }
    }

    public boolean tablet(){
        if(this.tecnologia.equals(" Tablet")){
            return true;
        }else{
            return false;
        }
    }

    public boolean computadorPessoal(){
        if(this.tecnologia.equals(" Computador Pessoal")){
            return true;
        }else{
            return false;
        }
    }

    public boolean nenhumaTecnologia(){
        if(this.tecnologia.equals(" Nenhuma")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean areaAlimentacao(){
        if(this.areaPrioritaria.equals(" Alimentação")){
            return true;
        }else{
            return false;
        }
    }  
    
    public boolean areaEducacao(){
        if(this.areaPrioritaria.equals(" Educação")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean areaCultura(){
        if(this.areaPrioritaria.equals(" Cultura")){
            return true;
        }else{
            return false;
        }
    } 

    public boolean areaLazer(){
        if(this.areaPrioritaria.equals("  Lazer")){
            return true;
        }else{
            return false;
        }
    } 

    public boolean areaTransporte(){
        if(this.areaPrioritaria.equals(" Transporte")){
            return true;
        }else{
            return false;
        }
    }

    public boolean areaEmprego(){
        if(this.areaPrioritaria.equals(" Emprego")){
            return true;
        }else{
            return false;
        }
    }

    public boolean areaSaude(){
        if(this.areaPrioritaria.equals(" Saúde")){
            return true;
        }else{
            return false;
        }
    }

    public boolean areaSeguranca(){
        if(this.areaPrioritaria.equals(" Segurança")){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
//    @Override
//    public String toString(){
//        return "hello"+this.genero;
//    }
}