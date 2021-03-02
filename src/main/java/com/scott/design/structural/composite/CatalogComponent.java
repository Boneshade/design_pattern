package com.scott.design.structural.composite;

import java.math.BigDecimal;

/**
 * @author xubr
 * @title: CatalogComponent
 * @projectName design_pattern
 * @description: <h1>���ģʽ �γ����</h1>
 * @date 2021/3/215:09
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
      throw new UnsupportedOperationException("��֧����Ӳ���");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("��֧��ɾ������");
    }

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("��֧�ֻ�ȡ���Ʋ���");
    }

    public BigDecimal getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("��֧�ֻ�ȡ�۸����");
    }

    public void print(){
        throw new UnsupportedOperationException("��֧�ִ�ӡ����");
    }

}
