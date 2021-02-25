package com.yosep.spring.basic.pattern.proxy.ex1;

public class RealThumbnail implements Thumbnail {
    private String title;
    private String movieUrl;

    public RealThumbnail(String title, String movieUrl) {
        this.title = title;
        this.movieUrl = movieUrl;

        System.out.println(movieUrl + "로부터 " + title + "의 영상 데이터 다운");
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        System.out.println(title + "의 프리뷰 재생");
    }
}
