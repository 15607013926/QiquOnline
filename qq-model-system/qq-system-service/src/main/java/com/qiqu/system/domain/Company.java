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
 * 教育机构
 * </p>
 *
 * @author itheima
 * @since 2023-04-14
 */
@Getter
@Setter
@TableName("tb_company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * c机构 p个人
     */
    private String orgType;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 联系人名称
     */
    private String linkname;

    /**
     * 手持证件照
     */
    private String handPhotos;

    /**
     * 机构地址
     */
    private String address;

    /**
     * logo
     */
    private String logo;

    private String email;

    /**
     * 承诺书
     */
    private String promiseLetter;

    /**
     * 商标注册证
     */
    private String trademarkPic;

    /**
     * 简介
     */
    private String intro;

    private String briefIntro;

    /**
     * 主营类目
     */
    private String mainCategory;

    /**
     * 身份证照片
     */
    private String identityPic;

    /**
     * 工具性质
     */
    private String workType;

    /**
     * 营业执照
     */
    private String businessPic;

    /**
     * 营业执照有效期
     */
    private Date businessTerm;

    /**
     * 营业执照注册号
     */
    private String businessRegistNo;

    /**
     * 教育资质/学历证书照片
     */
    private String eduCertImg;

    /**
     * 教育资质证书有效期
     */
    private Date eduCertTerm;

    /**
     * 教育资质/学历编号
     */
    private String eduCertNo;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 审核状态
     */
    private String approvalStatus;

    /**
     * 审批意见
     */
    private String approvalComment;

    /**
     * 审批人
     */
    private String approvalPeople;

    /**
     * 审批日期
     */
    private Date approvalDate;

    /**
     * 审核次数
     */
    private Integer approvalNums;

    /**
     * 备注
     */
    private String remark;

    private Date createDate;

    private Date changeDate;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 教师资格证照片
     */
    private String teacherCertImg;

    /**
     * 教师资格证号码
     */
    private String teacherCertNo;

    /**
     * 专业证件照片
     */
    private String majorCertImg;

    /**
     * 专业证件号码
     */
    private String majorCertNo;

    /**
     * 教学工作经历
     */
    private String workExperience;

    /**
     * 教学工作成果
     */
    private String workResults;

    /**
     * 机构名称
     */
    private String title;


}
