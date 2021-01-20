package com.ylb.pojo;

public class User {
   private Integer uid;
   private String uname;
   private String pwd;
   private Integer rid;

    public User() {
    }

    public User(Integer uid, String uname, String pwd, Integer rid) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", rid=" + rid +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}
