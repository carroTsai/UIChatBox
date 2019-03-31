package com.example.caibo.uichatbox;

public class Msg {

    public static final int TPPE_RECEIVED = 0;

    public static final int TYPE_SENT = 1;

    public String content;

    public int type;

    public Msg (String content, int type) {
        this.content = content;
        this.type = type;
    }

    public  String getContent() {
        return content;
    }

    public  int getType() {
        return type;
    }
}
