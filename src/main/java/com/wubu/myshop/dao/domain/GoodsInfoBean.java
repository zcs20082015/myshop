package com.wubu.myshop.dao.domain;

import java.util.Date;

public class GoodsInfoBean {
    private String oidGoods;

    private String nameGoods;

    private Integer countGoods;

    private String priceGoods;

    private String infoGoods;

    private String imageGoods;

    private String statusGoods;

    private String memo;

    private String dtCreate;

    private String dtUpdate;

    public String getOidGoods() {
        return oidGoods;
    }

    public void setOidGoods(String oidGoods) {
        this.oidGoods = oidGoods == null ? null : oidGoods.trim();
    }

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods == null ? null : nameGoods.trim();
    }

    public Integer getCountGoods() {
        return countGoods;
    }

    public void setCountGoods(Integer countGoods) {
        this.countGoods = countGoods;
    }

    public String getPriceGoods() {
        return priceGoods;
    }

    public void setPriceGoods(String priceGoods) {
        this.priceGoods = priceGoods == null ? null : priceGoods.trim();
    }

    public String getInfoGoods() {
        return infoGoods;
    }

    public void setInfoGoods(String infoGoods) {
        this.infoGoods = infoGoods == null ? null : infoGoods.trim();
    }

    public String getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(String imageGoods) {
        this.imageGoods = imageGoods == null ? null : imageGoods.trim();
    }

    public String getStatusGoods() {
        return statusGoods;
    }

    public void setStatusGoods(String statusGoods) {
        this.statusGoods = statusGoods == null ? null : statusGoods.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(String dtCreate) {
        this.dtCreate = dtCreate;
    }

    public String getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(String dtUpdate) {
        this.dtUpdate = dtUpdate;
    }
}