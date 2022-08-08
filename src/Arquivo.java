import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Arquivo {

    public static EntrevistadoVetor carregarEntrevistadoVetor(String nomeArquivo) throws Exception {
        // declaração das variáveis        
       	//abre o arquivo para leitura
       	String linha="";
        FileInputStream inFile = new FileInputStream (new File(nomeArquivo));
        BufferedReader buff = new BufferedReader (new InputStreamReader(inFile, "UTF-8"));
        int quantidade = Integer.parseInt(buff.readLine());
        EntrevistadoVetor entVet = new EntrevistadoVetor(quantidade);
		//lê as demais linhas do arquivo
		

        while (linha != null){
            try{
    			linha = buff.readLine ();
    			String dados[] = linha.split(";");
    			Entrevistado entrevistado = new Entrevistado(dados[0],dados[1],dados[2],dados[3],dados[4],dados[5]);
    			entVet.adiciona(entrevistado);
		    }catch(Exception ex){
		        ex.printStackTrace();
		    }
        }
            
        //fecha o arquivo
        buff.close ();
        inFile.close ();
		
		return entVet;
    }


    public static void gravar (String conteudo, String nomeArquivo) throws Exception {
		//abre o arquivo para escrita
		FileOutputStream outFile = new FileOutputStream (new File(nomeArquivo));
		BufferedWriter buff = new BufferedWriter (new OutputStreamWriter(outFile, "UTF-8"));

		//escreve no arquivo
		buff.write (conteudo);

		// fecha o arquivo
		buff.close ();  
		outFile.close ();
	}

}
