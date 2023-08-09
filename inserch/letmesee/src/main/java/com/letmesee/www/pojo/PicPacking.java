package com.letmesee.www.pojo;

import org.springframework.data.mongodb.core.mapping.MongoId;

/**
 * 图片实体类
 */
public class PicPacking {

    @MongoId
    private String _id;

    private String url;

    private String content;

    public PicPacking() {
    }

    public PicPacking(String _id, String url, String content) {
        this._id = _id;
        this.url = url;
        this.content = content;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
