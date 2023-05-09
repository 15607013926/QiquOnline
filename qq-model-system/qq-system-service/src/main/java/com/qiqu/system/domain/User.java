package com.qiqu.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel("用户信息")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 手机号
     */
    @ApiModelProperty("用户账户")
    private String account;

    /**
     * 密码
     */
    @ApiModelProperty("用户密码")
    private String password;

    /**
     * 真实姓名
     */
    @ApiModelProperty("用户姓名")
    private String name;

    /**
     * 企业id
     */
    @ApiModelProperty("企业id")
    private Long companyId;

    /**
     * 所属企业
     */
    @ApiModelProperty("所属企业")
    private String companyName;

    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String userpic;

    /**
     * 用户类型
     */
    @ApiModelProperty("用户类型")
    private String utype;

    @ApiModelProperty("用户生日")
    private Date birthday;

    @ApiModelProperty("用户性别")
    private String sex;

    /**
     * 用户状态
     */
    @ApiModelProperty("用户状态")
    private Integer status;

    /**
     * 个人简介
     */
    @ApiModelProperty("个人简介")
    private String intro;

    private Date createDate;


}
