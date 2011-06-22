package com.tsumego.copyPaste;

public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String sayHello(boolean isHtmlRequired) {
        if (isHtmlRequired) {
            return sayHelloHtml();
        } else {
            return sayHello();
        }
    }

    private String sayHello() {
        return "Hello " + name + " !";
    }

    private String sayHelloHtml() {
        return "<html><body><h1>Hello " + name + " !</h1></body></html>";
    }
}
