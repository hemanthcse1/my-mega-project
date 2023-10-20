package com.hemanth.designpatternsjava.builderdesign.example3;

import lombok.Data;

@Data
public class URL {

    private String protocol;
    private String hostName;
    private String port;
    private String pathParam;
    private String queryParam;


    public URL(String protocol, String hostName, String port, String pathParam, String queryParam) {
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }

}
