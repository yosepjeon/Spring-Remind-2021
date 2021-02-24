package com.yosep.spring.basic.pattern.adapter.useAdapter;

import com.yosep.spring.basic.pattern.adapter.noAdapter.ServiceA;

public class AdapterServiceA {
    ServiceA sa1 = new ServiceA();

    public void runService() {
        sa1.runServiceA();
    }
}
