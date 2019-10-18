package com.leiyan.bean;

public class Like {
    private String lname;
    private String loc;

    public Like() {
    }

    public Like(String lname, String loc) {
        this.lname = lname;
        this.loc = loc;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Like{" +
                "lname='" + lname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
