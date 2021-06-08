package Exercicio4_InputOutputStream;

import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream inputStream;
        InputStream properties = new
        FileInputStream(System.getProperty("user.dir") + File.separator +
                "src" + File.separator + "main" + File.separator + "resources" +
                File.separator + "caminhos.properties");

        Properties prop = new Properties();
        prop.load(properties);

        String caminho1 = prop.getProperty("caminho1");
        String caminho2 = prop.getProperty("caminho2");

        System.out.println(caminho1);
        System.out.println(caminho2);

        try {
            inputStream = new FileInputStream(caminho1);

            int data = inputStream.read();
            while (data != -1) {
                System.out.println(data);
                data = inputStream.read();
            }
            inputStream.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final String CAMINHO_ARQUIVO =
                System.getProperty("user.dir") + File.separator + "src"
                        + File.separator + "main" + File.separator + "java" +
                        File.separator + "Exercicio4_InputOutputStream" +
                        File.separator;

        final String NOME_ARQUIVO = "write.txt";
        System.out.println(CAMINHO_ARQUIVO);

        File meuArquivo = new File(CAMINHO_ARQUIVO, NOME_ARQUIVO);

        OutputStream outputStream = new FileOutputStream(meuArquivo);

        byte[] bytes = {67, 97, 112, 97, 99, 105, 116, 97, (byte) 195, (byte) 167, (byte) 195, (byte) 163, 111, 32, 74, 97, 118, 97};

        outputStream.write(bytes);
    }
}
