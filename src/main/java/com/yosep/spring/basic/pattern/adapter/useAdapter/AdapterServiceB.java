package com.yosep.spring.basic.pattern.adapter.useAdapter;

import com.yosep.spring.basic.pattern.adapter.noAdapter.ServiceB;

public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    void runService() {
        sb1.runServiceB();
    }
}
