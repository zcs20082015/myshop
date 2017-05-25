package com.wubu.share.wrapper;

public class ModelResult<T> extends ResultSet {

    private static final long serialVersionUID = 777825439705856154L;

    private T                 model;

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

}
