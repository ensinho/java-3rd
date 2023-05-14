import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.HashMap;
import java.io.BufferedReader;

public class MergeCpfNome {
    public static void main(String[] args) {
        String arq1 = "arquivo1.txt";
        String arq2 = "arquivo2.txt";
        String outputArq = "arquivo_merged.txt";

        HashMap<String, String> cpfNomes = new HashMap<String, String>();

        //O programa inicialmente le os dois arquivos, e armazena cada 
        //registro de PCf e Nome em um HashMap.
        //Os registros duplicados vao sendo eliminados pois a chave do
        //mapa é o CPF,logo, nao podem haver 2 chaves identicas.
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arq1));
            String linha = reader.readLine();
            while (linha != null) {
                // associando os valores as chaves
                String[] parts = linha.split(";");
                cpfNomes.put(parts[0], parts[1]);
                linha = reader.readLine();
            }

            reader.close();
            
            reader = new BufferedReader(new FileReader(arq2));
            linha = reader.readLine();
            while (linha != null) {
                // associando os valores as chaves
                String[] parts = linha.split(";");
                cpfNomes.put(parts[0], parts[1]);
                linha = reader.readLine();
            }

            reader.close();
            
            FileWriter writer = new FileWriter(outputArq);
            for (String cpf : cpfNomes.keySet()) {
                // aqui para escrever as linhas dentro do modelo solicitado
                writer.write(cpf + ";" + cpfNomes.get(cpf) + "\n");
            }

            writer.close();
            
            System.out.println("O arquivo em conjunto foi criado com sucesso. ");
            // apos o tudo ter dado certo, a mensagem final e exibida.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
