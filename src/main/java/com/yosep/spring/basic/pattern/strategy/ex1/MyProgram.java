package com.yosep.spring.basic.pattern.strategy.ex1;

import com.yosep.spring.basic.pattern.adapter.ex1.FindMovieAlgorithm;
import com.yosep.spring.basic.pattern.adapter.ex1.SearchStrategyMovieAdapter;

public class MyProgram {
    private SearchButton searchButton = new SearchButton(this);

    public void setMode(SearchStrategy searchStrategy) {
        this.searchButton.setSearchStrategy(searchStrategy);
    }

    public void testProgram() {
        // Mode All
        searchButton.onClick();

        // Mode Image
        searchButton.setSearchStrategy(new SearchStrategyImage());
        searchButton.onClick();

        // Mode News
        searchButton.setSearchStrategy(new SearchStrategyNews());
        searchButton.onClick();

        // Mode Map
        searchButton.setSearchStrategy(new SearchStrategyMap());
        searchButton.onClick();

        // Mode Movie
        searchButton.setSearchStrategy(new SearchStrategyMovieAdapter(new FindMovieAlgorithm()));
        searchButton.onClick();
    }
}
