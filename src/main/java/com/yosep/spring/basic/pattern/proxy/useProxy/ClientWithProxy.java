package com.yosep.spring.basic.pattern.proxy.useProxy;

public class ClientWithProxy {
    public static void main(String[] args) {
        // 프록시를 이용한 호출
        InterfaceService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
