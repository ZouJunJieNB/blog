package com.zou.blog.entity;


import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  博客分类实体
 * </p>
 *
 * @author ZouJunJie
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BlogClassify implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    private Long classifyId;

    /**
     * 分类名称
     */
    private String classifyName;


}
