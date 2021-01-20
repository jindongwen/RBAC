package com.ylb.pojo;

public class Menu {
    private Integer mid;
    private String mname;
    private String murl;
    private Integer parentid;
    private String mdesc;

    public Menu() {
    }

    public Menu(Integer mid, String mname, String murl, Integer parentid, String mdesc) {
        this.mid = mid;
        this.mname = mname;
        this.murl = murl;
        this.parentid = parentid;
        this.mdesc = mdesc;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", murl='" + murl + '\'' +
                ", parentid=" + parentid +
                ", mdesc='" + mdesc + '\'' +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getMdesc() {
        return mdesc;
    }

    public void setMdesc(String mdesc) {
        this.mdesc = mdesc;
    }
}
