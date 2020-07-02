package com.zou.blog.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章内容
 * </p>
 *
 * @author ZouJunJie
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ArticleContent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章内容id
     */
    private Long articleContentId;

    /**
     * 文章内容
     */
    private String articleContent;


}
