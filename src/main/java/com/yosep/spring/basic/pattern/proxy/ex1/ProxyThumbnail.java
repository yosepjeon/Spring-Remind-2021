package com.yosep.spring.basic.pattern.proxy.ex1;

public class ProxyThumbnail implements Thumbnail {
    private String title;
    private String movieUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String title, String movieUrl) {
        this.title = title;
        this.movieUrl = movieUrl;
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, movieUrl);
        }

        realThumbnail.showPreview();
    }
}
