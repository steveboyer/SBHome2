package com.stephenboyer.sbhome2;

/**
 * Created by steve on 5/23/17.
 */
public class Hello {
    private final long id;
    private final String content;

    public Hello(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}

