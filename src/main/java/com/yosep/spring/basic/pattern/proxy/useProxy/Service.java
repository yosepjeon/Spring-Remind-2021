package com.yosep.spring.basic.pattern.proxy.useProxy;

public class Service implements InterfaceService {
    @Override
    public String runSomething() {
        return "서비스짱!!!";
    }
}
