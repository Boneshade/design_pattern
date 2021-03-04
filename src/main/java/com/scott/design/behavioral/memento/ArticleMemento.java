package com.scott.design.behavioral.memento;

/**
 * @author xubr
 * @title: ArticleMemento
 * @projectName design_pattern
 * @description: <h1>Article类的快照</h1>
 * @date 2021/3/415:10
 */
public class ArticleMemento {

    private String title;

    private String content;

    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
