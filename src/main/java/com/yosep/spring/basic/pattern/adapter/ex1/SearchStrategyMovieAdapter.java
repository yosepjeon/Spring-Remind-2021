package com.yosep.spring.basic.pattern.adapter.ex1;

import com.yosep.spring.basic.pattern.strategy.ex1.SearchStrategy;

public class SearchStrategyMovieAdapter implements SearchStrategy {
    private FindAlgorithm findAlgorithm;

    public SearchStrategyMovieAdapter(FindAlgorithm findAlgorithm) {
        this.findAlgorithm = findAlgorithm;
    }

    @Override
    public void search() {
        findAlgorithm.find(true);
    }
}
