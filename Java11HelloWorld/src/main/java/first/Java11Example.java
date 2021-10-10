package first;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.HashMap;

public class Java11Example {

    public static void main(String[] args) throws IOException, InterruptedException {
        httpMethod();
    }

    private static void httpMethod() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //.uri(URI.create("http://webcode.me"))
                //.uri(URI.create("http://208.71.174.227:3007"))
                //.uri(URI.create("http://localhost:8080/resources"))
                .uri(URI.create("http://localhost:8081/test/timeout/"))
                .GET()
                .build();

        HttpResponse<Void> response = client.send(request,
                HttpResponse.BodyHandlers.discarding());

        System.out.println(response.statusCode());
    }

    private static void redirect() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS).build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/redirect/1"))
                .GET()
                .build();

        HttpResponse response = client.send(request,
                HttpResponse.BodyHandlers.discarding());

        System.out.println(response.statusCode());
    }

    private static void postRequest() throws IOException, InterruptedException {
        var values = new HashMap<String, String>() {
            {
                put("name", "John Doe");
                put("occupation", "gardener");
            }
        };

        var objectMapper = new ObjectMapper();

        String requestBody = objectMapper.writeValueAsString(values);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/post"))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private static void fileBodyHandler() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://webcode.me"))
                .GET() // GET is default
                .build();
        var fileName = "src/main/resources/index.html";

        HttpResponse response = client.send(request,
                HttpResponse.BodyHandlers.ofFile(Paths.get(fileName)));

        System.out.println(response.statusCode());
    }

    private static void bodyRequest() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://webcode.me"))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }



    private static void headRequest() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(URI.create("http://webcode.me"))
                .method("HEAD", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<Void> response = client.send(request,
                HttpResponse.BodyHandlers.discarding());

        HttpHeaders headers = response.headers();

        headers.map().forEach((key, value) -> {
            System.out.printf("%s: %s%n", key, value);
        });
    }



    private static void stringMethod() {
        String foo = "   ";
        if (foo.isBlank() || foo.isEmpty()) {
            System.out.printf("It is blank or empty");
        }
    }

    private static void varMethod() {
        var variable = "hello world";
        System.out.println(variable);
    }
}
