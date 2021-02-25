package com.yosep.spring.basic.pattern.strategy.ex1;

public class SearchStrategyImage implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH IMAGE");
    }
}
