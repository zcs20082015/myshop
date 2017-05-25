package com.wubu.share.wrapper;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 封装一个list的返回结果：包括count和list
 * 
 * @author haitao.chenht 2011-3-23 下午03:01:36
 */
public class ListResult<T extends Serializable> implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7857809226229021737L;
    // 总数
    private int               totalCount;
    // 结果列表
    private List<T>           modelList;

    public static <T extends Serializable> ListResult<T> newListResult() {
        return new ListResult<T>();
    }

    public static <T extends Serializable> ListResult<T> newListResult(int total) {
        ListResult <T> result = new ListResult<T>();
        result.setTotalCount(total);
        return result;
    }
    
    public static <T extends Serializable> ListResult<T> newListResult(int total, List<T> list) {
        ListResult <T> result = new ListResult<T>();
        result.setTotalCount(total);
        result.setModelList(list);
        return result;
    }

    /**
     * 获取结果列表
     * 
     * @return
     */
    public List<T> getModelList() {
        return modelList;
    }

    /**
     * 设置结果列表
     * 
     * @param modelList
     */
    public void setModelList(List<T> modelList) {
        this.modelList = modelList;
    }

    /**
     * 获取当前返回的列表条数
     * 
     * @return
     */
    public int getCount() {
        return modelList != null ? modelList.size() : 0;
    }

    /**
     * 获取总数
     * 
     * @return
     */
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
