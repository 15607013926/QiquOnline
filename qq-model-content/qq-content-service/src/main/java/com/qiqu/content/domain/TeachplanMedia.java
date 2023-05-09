package com.qiqu.content.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 12441
 * @since 2023-05-06
 */
@Getter
@Setter
@TableName("tb_teachplan_media")
public class TeachplanMedia implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 媒资信息标识
     */
    private Long mediaId;

    /**
     * 课程计划标识
     */
    private Long teachplanId;

    /**
     * 课程标识
     */
    private Long courseId;

    /**
     * 课程发布标识
     */
    private Long coursePubId;

    /**
     * 媒资文件原始名称
     */
    private String mediaFilename;

    private Date createDate;

    /**
     * 创建人
     */
    private String createPeople;

    /**
     * 修改人
     */
    private String changePeople;

    /**
     * 机构id
     */
    private Long companyId;


}
