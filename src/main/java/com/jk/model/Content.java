package com.jk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 内容
 * @author cuiP
 * Created by JK on 2017/4/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Content extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 内容分类ID
     */
    private Long contentCatId;

    /**
     * 图片
     */
    private String img;

    /**
     * 内容标题
     */
    private String title;

    /**
     * 子标题
     */
    private String subTitle;

    /**
     * 标题描述
     */
    private String titleDesc;

    /**
     * 内容
     */
    private String content;

    /**
     * 链接
     */
    private String url;

    /**
     * 时间
     */
    private Date time;

	public Long getContentCatId() {
		return contentCatId;
	}

	public void setContentCatId(Long contentCatId) {
		this.contentCatId = contentCatId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTitleDesc() {
		return titleDesc;
	}

	public void setTitleDesc(String titleDesc) {
		this.titleDesc = titleDesc;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
    
    

}
