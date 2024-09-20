package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class XbbStudentApply {

    private Long dataId;
    // 创建人
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbOwner text_16;
    // 姓名
    private String text_1;
    // 性别
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_23;
    // 手机号
    @JsonDeserialize(using = XbbStudentPhoneSubForm.XbbStudentPhoneSubFormDeserializer.class)
    private XbbStudentPhoneSubForm[] subForm_1;
    // 身份证号
    private String text_2;
    // 电子邮件
    private String text_24;
    // 微信号 to be added
    private String text_25;
    // 当前学历
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_9;
    // 目前就读学校
    private String text_35;
    // 年级
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_6;
    // 专业
    private String text_37;
    // 是否身处国内 (text_38) :下拉框
    private XbbSelectBox text_38;
    // 签约阶段
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_18;
    // 所在城市
    private String text_39;
    // 学生机构来源 (text_12) :关联数据(10008)
    private Long text_12;
    // 项目名称 (text_27) :下拉框(3)
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_27;
    // 课题版本 (text_30) :关联数据(10008)
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_30;
    // 反馈邮箱
    private String text_86;
    // 反馈抄送邮箱
    private String text_32;
    // 产品名称 (text_29) :关联数据(10008)
    private String text_29;
    // 课题名称 (text_33) :关联数据(10008)
    private String text_33;
    // //是否有推荐顾问 (text_10) :下拉框(3)
    // private String text_10;
    // //原跟进人
    // private String text_11;
    // 课题状态 (text_31) :下拉框
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_31;
    // 剩余名额
    private Integer quote_3;
    // 课题情况
    private String quote_1;
    // 负责人 (ownerId) :负责人(10017)
    private XbbOwner[] ownerId;
    // 签约状态 (text_78) :下拉框(3)
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_78;
    // 缴费情况 (text_69) :下拉框(3)
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_69;
    // 科研经历 (text_34): 下拉框(3)
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_34;
    // 科研经历内容 (text_47) :多行文本(7)
    private String text_47;
    // 英语能力分数
    private Float num_5;
    // 英语能力
    private String text_46;
    // 面试进度状态 (text_50) :下拉框
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_50;
    // 是否需要语言测试 (text_56) :下拉框
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_56;
    // 面试老师 (text_36) :单行文本
    private String text_36;
    // 面试时间 (date_6) :日期
    private Long date_6;
    // 语测其他建议 (text_62) :多行文本
    private String text_62;
    // offer是否发放 (text_63) :下拉框
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_63;
    // 插班-审批状态 (text_73) :下拉框(3) (必填)
    @JsonSerialize(using = ToStringSerializer.class)
    private XbbSelectBox text_73;
    // offer发放时间 (date_1) :日期
    private Long date_1;
    // warm up时间 (date_12) :日期
    private Long date_12;
    // 产品部专员（中方教授） (text_77) :关联数据
    private String text_77;
    // 产品部专员（外方教授） (text_53) :关联数据
    private String text_53;
    // 教务老师用户 (text_54) :关联数据
    private String text_54;
    // 论文专员用户 (text_55) :关联数据
    private String text_55;
    // 论文行政用户 (text_65) :关联数据
    private String text_65;
    // zohoid(学生) (text_74)
    private String text_74;
    // 课题开始时间 (quote_4) :(22)
    private String quote_4;
    // 课题结束时间 (quote_5)
    private String quote_5;

}