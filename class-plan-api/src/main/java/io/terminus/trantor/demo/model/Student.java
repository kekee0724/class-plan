package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.Data;

import java.util.Date;

/**
 * 建立student表
 * 属性有:编号：id (主键，自动增长),姓名:sname,出生年月:sage,性别:ssex(枚举)
 * create table student(sid int primary key auto_increment,
 * sname varchar(20),
 * sage date,
 * ssex enum(‘男’,’女’));
 */
@Data
@TModel(name = "学生信息", mainField = "sid")
public class Student extends BaseModel<Long> {
    private static final long serialVersionUID = 1L;

    @TModelField(name = "学号", nullable = false)
    private String sid;

    @TModelField(name = "学生姓名", nullable = false)
    private String sname;

    @TModelField(name = "出生日期")
    private Date sage;

    @TModelField(name = "性别类型")
    private SexType sexType;
}
