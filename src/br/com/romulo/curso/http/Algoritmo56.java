package br.com.romulo.curso.http;

import java.net.URI; //URL - www.google.com
// cliente <<------------------>> servidor
import java.net.http.HttpClient; //Cliente (objeto)
import java.net.http.HttpRequest; //solicita uma requisição
import java.net.http.HttpResponse; //envia a resposta da requisição
public class Algoritmo56 {
       public static void main(String[] args) {
       // URL da API para buscar as raças dos gatos
       String url = "https://api.thecatapi.com/v1/breeds";
       // Criando o cliente HTTP moderno nativo do Java
       HttpClient client = HttpClient.newHttpClient();
       // Construindo a requisição GET
       
       HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(url))
              .header("Accept", "application/json")
              // Se tiver uma API Key, descomente a linha abaixo:
              .header("x-api-key",
                "live_WOuOjRIAvPzZyS98OS6mrOoY6cCPl4cYbgvZjFI5dRYyAD1y2DfMCGex0eikNe7r")
              .GET()
              .build();
        try {
           // Enviando a requisição de forma síncrona
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                    System.out.println("Resposta da API:");
                    System.out.println(response.body());
                    // Dica: Para extrair a URL de forma elegante, você} else {
                    System.out.println("Erro na requisição: " +
                    response.statusCode());
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}
