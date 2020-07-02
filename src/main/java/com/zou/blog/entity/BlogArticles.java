package com.zou.blog.entity;


import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 博客文章
 * </p>
 *
 * @author ZouJunJie
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BlogArticles implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 文章内容id
     */
    private Long articleContentId;

    /**
     * 浏览量
     */
    private Long articleViews;

    /**
     * 点赞数
     */
    private Long articleLikeCount;


    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 标题图片
     */
    private String articleTitlePhoto;


}
