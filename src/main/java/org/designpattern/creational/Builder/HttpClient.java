package org.designpattern.creational.Builder;

public class HttpClient {

    private String url;
    private String method;
    private String userName;
    private String pwd;
    private String header;
    private String body;

    public HttpClient() {

    }
    public String url() {
        return url;
    }

    public String method() {
        return method;
    }

    public String userName() {
        return userName;
    }

    public String pwd() {
        return pwd;
    }

    public String header() {
        return header;
    }

    public String body() {
        return body;
    }

    public HttpClient(String url, String method, String userName, String pwd, String header, String body) {
        this.url = url;
        this.method = method;
        this.userName = userName;
        this.pwd = pwd;
        this.header = header;
        this.body = body;
    }


    @Override
    public String toString() {
        return "HttpClient{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }


}
