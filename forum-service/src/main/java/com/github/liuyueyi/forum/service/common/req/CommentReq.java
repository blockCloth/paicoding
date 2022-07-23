package com.github.liuyueyi.forum.service.common.req;

import lombok.Data;

/**
 * 评论列表入参
 *
 * @author louzai
 * @date 2022-07-24
 */
@Data
public class CommentReq {

    /**
     * 评论ID
     */
    private Long commentId;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 父评论ID
     */
    private Long parentCommentId;
}
