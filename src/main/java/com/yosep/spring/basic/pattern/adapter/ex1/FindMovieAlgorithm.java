package com.yosep.spring.basic.pattern.adapter.ex1;

public class FindMovieAlgorithm implements FindAlgorithm {
    @Override
    public void find(boolean global) {
        System.out.println("find movie" + (global ? " globally" : ""));

        // 동영상 검색하는 코드
    }
}
