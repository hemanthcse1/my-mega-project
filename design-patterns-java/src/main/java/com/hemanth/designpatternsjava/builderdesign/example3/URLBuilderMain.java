package com.hemanth.designpatternsjava.builderdesign.example3;

public class URLBuilderMain {

    public static void main(String[] args) {


        URL urlBuilder1 = new URLBuilder()
                .protocol("https://")
                .hostName("hemanth.com")
                .port(":3325")
                .pathParam("/home")
                .build();


        System.out.println(urlBuilder1);

        System.out.println(urlBuilder1.getProtocol()+""+urlBuilder1.getHostName()+""+urlBuilder1.getPort());

        System.out.println(urlBuilder1.getProtocol()+""+urlBuilder1.getHostName()+""+urlBuilder1.getPort()+""+urlBuilder1.getPathParam());
    }
}
