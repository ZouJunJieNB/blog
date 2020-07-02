package com.zou.blog.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *  博客标签实体
 * </p>
 *
 * @author ZouJunJie
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BlogLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    private Long labelId;

    /**
     * 标签名称
     */
    private String labelName;


}
