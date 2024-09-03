package org.designpattern.creational.Builder;

public  class HttpClientBuilder {
    private String url;
    private String method;
    private String userName;
    private String pwd;
    private String header;
    private String body;

    public HttpClientBuilder method(String method){
        this.method = method;
        return this;
    }

    public HttpClientBuilder url(String url){
        this.url = url;
        return this;
    }
    public HttpClientBuilder userName(String userName){
        this.userName = userName;
        return this;
    }
    public HttpClientBuilder pwd(String pwd){
        this.pwd = pwd;
        return this;
    }
    public HttpClientBuilder header (String header){
        this.header = header;
        return this;
    }
    public HttpClientBuilder body(String body){
        this.body = body;
        return this;
    }

    public HttpClient build(){
        return  new HttpClient(url,method,userName,pwd,header,body);
    }
}