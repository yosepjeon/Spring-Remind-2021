package com.yosep.spring.basic.pattern.strategy.ex1;

public class SearchStrategyNews implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH NEWS");
    }
}
