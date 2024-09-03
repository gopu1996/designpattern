package org.designpattern.Builder;

public class Test {
    public static void main(String[] args) {

        HttpClientBuilder builder =  new HttpClientBuilder();
       HttpClient client = builder.url("localhost:8080").method("Post").build();
        System.out.println(client);

    }
}
