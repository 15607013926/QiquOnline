package com.qiqu.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author itheima
 * @since 2023-04-14
 */
@Getter
@Setter
@TableName("tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 企业id
     */
    private Long companyId;

    /**
     * 所属企业
     */
    private String companyName;

    /**
     * 头像
     */
    private String userpic;

    /**
     * 用户类型
     */
    private String utype;

    private Date birthday;

    private String sex;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 个人简介
     */
    private String intro;

    private Date createDate;


}
