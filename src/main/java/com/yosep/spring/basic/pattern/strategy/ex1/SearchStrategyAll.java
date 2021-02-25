package com.yosep.spring.basic.pattern.strategy.ex1;

public class SearchStrategyAll implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("SEARCH ALL");
    }
}
