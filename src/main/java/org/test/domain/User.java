package org.test.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer uid;
    private String uuid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLangcode() {
        return langcode;
    }

    public void setLangcode(String langcode) {
        this.langcode = langcode;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uuid='" + uuid + '\'' +
                ", langcode='" + langcode + '\'' +
                '}';
    }

    private String langcode;

}
