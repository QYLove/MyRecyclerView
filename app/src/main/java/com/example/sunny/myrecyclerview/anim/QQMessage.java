package com.example.sunny.myrecyclerview.anim;

public class QQMessage {
    private int logo;
    private String name;
    private String Msg;
    private String time;
    private int pop;

    public QQMessage() {
    }

    public QQMessage(int logo, String name, String msg, String time) {
        this.logo = logo;
        this.name = name;
        Msg = msg;
        this.time = time;
    }

    public QQMessage(int logo, String name, String msg, String time, int pop) {
        this.logo = logo;
        this.name = name;
        Msg = msg;
        this.time = time;
        this.pop = pop;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
}
