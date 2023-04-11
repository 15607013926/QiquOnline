package com.xuecheng.commons.constants;

/**
 * <p>
 *      课程作业记录审批状态
 * </p>
 */
public enum WorkRecordCorrectionStatusEnum{

    RECORD_CORRECT_UNSUBMIT("306001", "未提交"),
    RECORD_CORRECT_PENDING("306002", "待批改"),
    RECORD_CORRECT_PENDED("306003", "已批改"),
    ;

    String code;
    String desc;

    WorkRecordCorrectionStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static WorkRecordCorrectionStatusEnum getTeachModeEnum(String code) {
        if (code == null) {
            return null;
        }
        for (WorkRecordCorrectionStatusEnum ctme : WorkRecordCorrectionStatusEnum.values()) {
            if (ctme.getCode().equals(code.trim())) {
                return ctme;
            }
        }
        return null;
    }
}
