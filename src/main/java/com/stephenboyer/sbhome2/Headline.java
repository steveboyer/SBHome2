package com.stephenboyer.sbhome2;

/**
 * Created by steve on 8/1/17.
 */
public class Headline {
    private final long id;
    private final String content;

    public Headline(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}
