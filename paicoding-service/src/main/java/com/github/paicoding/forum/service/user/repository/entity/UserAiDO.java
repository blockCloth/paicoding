package com.github.paicoding.forum.service.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.paicoding.forum.api.model.entity.BaseDO;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ai用户表
 *
 * @ClassName: UserAiDO
 * @Author: ygl
 * @Date: 2023/6/25 21:38
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_ai")
public class UserAiDO extends BaseDO {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 知识星球编号
     */
    private String starNumber;

    /**
     * 星球来源 1=java进阶之路 2=技术派
     */
    private Integer starType;

    /**
     * 当前用户绑定的邀请者
     */
    private Integer inviterUserId;

    /**
     * 邀请码
     */
    private String inviteCode;

    /**
     * 当前用户邀请的人数
     */
    private Integer inviteNum;

    /**
     * 0 审核中 1 试用中 2 审核通过 3 审核拒绝
     */
    private Integer state;

    /**
     * 是否删除
     */
    private Integer deleted;

}