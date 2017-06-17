package com.wubu.myshop.dao.domain;

import java.util.Date;

import com.wubu.share.domain.base.BaseBean;

public class UserInfoBean extends BaseBean{
    private String oidUserno;

    private String statUser;

    private String userId;

    private String mobUser;

    private String levelSecurity;

    private String nameUser;

    private String sexUser;

    private String dateBirthday;

    private String typeIdcard;

    private String noIdcard;

    private String telUser;

    private String addrPro;

    private String addrCity;

    private String addrDist;

    private String addrConn;

    private String noPostcode;

    private String dtReg;

    private String dtUnreg;

    private String dtLastupdate;

    private String preservingInfo;

    private String nationUser;

    private String expIdcard;

    private String typeUser;

    private String oidJob;

    private String oidChnl;

    private String statMarry;

    private String statJob;

    private String flagReal;

    private String openid;
    
    private String password;

    private String memo;

    public String getOidUserno() {
        return oidUserno;
    }

    public void setOidUserno(String oidUserno) {
        this.oidUserno = oidUserno == null ? null : oidUserno.trim();
    }

    public String getStatUser() {
        return statUser;
    }

    public void setStatUser(String statUser) {
        this.statUser = statUser == null ? null : statUser.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMobUser() {
        return mobUser;
    }

    public void setMobUser(String mobUser) {
        this.mobUser = mobUser == null ? null : mobUser.trim();
    }

    public String getLevelSecurity() {
        return levelSecurity;
    }

    public void setLevelSecurity(String levelSecurity) {
        this.levelSecurity = levelSecurity == null ? null : levelSecurity.trim();
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser == null ? null : nameUser.trim();
    }

    public String getSexUser() {
        return sexUser;
    }

    public void setSexUser(String sexUser) {
        this.sexUser = sexUser == null ? null : sexUser.trim();
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday == null ? null : dateBirthday.trim();
    }

    public String getTypeIdcard() {
        return typeIdcard;
    }

    public void setTypeIdcard(String typeIdcard) {
        this.typeIdcard = typeIdcard == null ? null : typeIdcard.trim();
    }

    public String getNoIdcard() {
        return noIdcard;
    }

    public void setNoIdcard(String noIdcard) {
        this.noIdcard = noIdcard == null ? null : noIdcard.trim();
    }

    public String getTelUser() {
        return telUser;
    }

    public void setTelUser(String telUser) {
        this.telUser = telUser == null ? null : telUser.trim();
    }

    public String getAddrPro() {
        return addrPro;
    }

    public void setAddrPro(String addrPro) {
        this.addrPro = addrPro == null ? null : addrPro.trim();
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity == null ? null : addrCity.trim();
    }

    public String getAddrDist() {
        return addrDist;
    }

    public void setAddrDist(String addrDist) {
        this.addrDist = addrDist == null ? null : addrDist.trim();
    }

    public String getAddrConn() {
        return addrConn;
    }

    public void setAddrConn(String addrConn) {
        this.addrConn = addrConn == null ? null : addrConn.trim();
    }

    public String getNoPostcode() {
        return noPostcode;
    }

    public void setNoPostcode(String noPostcode) {
        this.noPostcode = noPostcode == null ? null : noPostcode.trim();
    }

    public String getDtReg() {
        return dtReg;
    }

    public void setDtReg(String dtReg) {
        this.dtReg = dtReg;
    }

    public String getDtUnreg() {
        return dtUnreg;
    }

    public void setDtUnreg(String dtUnreg) {
        this.dtUnreg = dtUnreg;
    }

    public String getDtLastupdate() {
        return dtLastupdate;
    }

    public void setDtLastupdate(String dtLastupdate) {
        this.dtLastupdate = dtLastupdate;
    }

    public String getPreservingInfo() {
        return preservingInfo;
    }

    public void setPreservingInfo(String preservingInfo) {
        this.preservingInfo = preservingInfo == null ? null : preservingInfo.trim();
    }

    public String getNationUser() {
        return nationUser;
    }

    public void setNationUser(String nationUser) {
        this.nationUser = nationUser == null ? null : nationUser.trim();
    }

    public String getExpIdcard() {
        return expIdcard;
    }

    public void setExpIdcard(String expIdcard) {
        this.expIdcard = expIdcard == null ? null : expIdcard.trim();
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser == null ? null : typeUser.trim();
    }

    public String getOidJob() {
        return oidJob;
    }

    public void setOidJob(String oidJob) {
        this.oidJob = oidJob == null ? null : oidJob.trim();
    }

    public String getOidChnl() {
        return oidChnl;
    }

    public void setOidChnl(String oidChnl) {
        this.oidChnl = oidChnl == null ? null : oidChnl.trim();
    }

    public String getStatMarry() {
        return statMarry;
    }

    public void setStatMarry(String statMarry) {
        this.statMarry = statMarry == null ? null : statMarry.trim();
    }

    public String getStatJob() {
        return statJob;
    }

    public void setStatJob(String statJob) {
        this.statJob = statJob == null ? null : statJob.trim();
    }

    public String getFlagReal() {
        return flagReal;
    }

    public void setFlagReal(String flagReal) {
        this.flagReal = flagReal == null ? null : flagReal.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}