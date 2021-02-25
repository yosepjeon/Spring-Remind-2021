package com.yosep.spring.basic.pattern.proxy.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyProgram {
    public static void main(String[] args) {
        List<Thumbnail> thumbnails = new ArrayList<>();

        thumbnails.add(new ProxyThumbnail("Git 강좌", "/git.mp4"));
        thumbnails.add(new ProxyThumbnail("Rest API란?", "/rest-api.mp4"));
        thumbnails.add(new ProxyThumbnail("도커 사용법", "/docker.mp4"));
        thumbnails.add(new ProxyThumbnail("객체지향 프로그래밍", "/oodp.mp4"));
        thumbnails.add(new ProxyThumbnail("블록체인의 원리", "/blockchain.mp4"));

        List<Thumbnail> immutableThumbnails = Collections.unmodifiableList(thumbnails);

        for (Thumbnail thumbnail : immutableThumbnails) {
            thumbnail.showTitle();
        }

        immutableThumbnails.get(2).showPreview();
        immutableThumbnails.get(2).showPreview();
        immutableThumbnails.get(4).showPreview();
        immutableThumbnails.get(1).showPreview();

    }
}
