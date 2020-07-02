package com.zou.blog.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  博客评论
 * </p>
 *
 * @author ZouJunJie
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BlogComments implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    private Long commentId;

    /**
     * 是否是游客
     */
    private Integer isTourist;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * 评论点赞数
     */
    private Long commentLikeCount;

    /**
     * 评论日期
     */
    private Date createTime;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 父评论id
     */
    private Long parentId;


}
