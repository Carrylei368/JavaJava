package com.leiyan.bean;

public class Man {
    private Integer mid;
    private String mname;
    private Like like;

    public Man() {
    }

    public Man(Integer mid, String mname, Like like) {
        this.mid = mid;
        this.mname = mname;
        this.like = like;
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

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Man{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", like=" + like +
                '}';
    }
}
