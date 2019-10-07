package org.doit;

public class Main {
    public static void main(String[] args) {


        MessageProvider providerfFomInternet = new FromIntermentMessageProvider();
        MessageProvider provider = new SimpleMessageProvider();

        MessageRenderer renderer = new SimpleMessageRenderer(provider);
        MessageRenderer renderer2 = new SimpleMessageRenderer(providerfFomInternet);

        renderer.render();
        renderer2.render();




    }
}
