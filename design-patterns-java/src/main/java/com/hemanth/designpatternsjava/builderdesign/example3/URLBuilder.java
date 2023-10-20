package com.hemanth.designpatternsjava.builderdesign.example3;

public class URLBuilder {

    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;


    public URLBuilder protocol(String value) {
        protocol = value;
        return this;
    }

    public URLBuilder hostName(String value) {
        hostName = value;
        return this;
    }

    public URLBuilder port(String value) {
        port = value;
        return this;
    }

    public URLBuilder pathParam(String value) {
        pathParam = value;
        return this;
    }

    public URLBuilder queryParam(String value) {
        queryParam = value;
        return this;
    }

    public URL build() {
        return new URL(protocol, hostName, port, pathParam, queryParam);
    }
}
