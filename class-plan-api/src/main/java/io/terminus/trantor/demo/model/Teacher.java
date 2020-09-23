package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.Data;

import java.util.List;

/**
 * 教师表
 * create table teacher(tid int primary key auto_increment,
 * tname varchar(20));
 */
@Data
@TModel(name = "教师信息", mainField = "tid")
public class Teacher extends BaseModel<Long> {
    private static final long serialVersionUID = 1L;

    @TModelField(name = "教师工号", nullable = false)
    private String tid;

    @TModelField(name = "教师名", nullable = false)
    private String tname;

//    @TModelField(name = "课程")
//    @RelationMeta(name = "Teacher_Course", modelClass = Course.class)
//    private List<Course> course; // OneToMany

    @TModelField(name = "课程")
    @RelationMeta(name = "Course_Teacher", modelClass = Course.class)
    private List<Course> course; //  ManyToMany
}