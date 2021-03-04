package com.scott.design.behavioral.memento;

import java.util.Stack;

/**
 * @author xubr
 * @title: ArticleMementoManager
 * @projectName design_pattern
 * @description: <h1>手记备忘录管理者</h1>
 * @date 2021/3/415:14
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

    @Override
    public String toString() {
        return "ArticleMementoManager{" +
                "ARTICLE_MEMENTO_STACK=" + ARTICLE_MEMENTO_STACK +
                '}';
    }
}
