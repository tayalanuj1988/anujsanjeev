package com.anujtayal.ixicode2017.bean;

import java.io.Serializable;

/**
 * Created by sanjeev on 08/04/17.
 */

public class CityModel implements Serializable
{
    private String text;
    private String url;
    private String ct;
    private String address;
    private String _id;
    private String cn;
    private boolean en;
    private String st;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public boolean isEn() {
        return en;
    }

    public void setEn(boolean en) {
        this.en = en;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public Integer get_oid() {
        return _oid;
    }

    public void set_oid(Integer _oid) {
        this._oid = _oid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public boolean isUseNLP() {
        return useNLP;
    }

    public void setUseNLP(boolean useNLP) {
        this.useNLP = useNLP;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    private String co;
    private Integer _oid;
    private String eid;
    private String cid;
    private boolean useNLP;
    private double lat;
    private double lon;
    private Integer xid;
}
