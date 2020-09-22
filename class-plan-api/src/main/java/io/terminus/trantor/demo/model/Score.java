package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.RelationType;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.Data;

/**
        建立成绩表
        create table sc(sid int,
        cid int,
        score int);
 */
@Data
@TModel(name = "成绩信息", mainField = "sid")
public class Score extends BaseModel<Long> {
    private static final long serialVersionUID = 1L;
//    @TModelField(name = "所属学生")
//    @RelationMeta(name = "Student_Score")
//    private Student student;

    @TModelField(name = "所属学生")
    @RelationMeta(name = "Score_Student", opposite = RelationType.ToOne)
    // OneToOne
    private Student student;

    @TModelField(name = "成绩编号")
    private String sid;

//    @TModelField(name = "课程编号")
//    private String cid;

    @TModelField(name = "所属课程")
    @RelationMeta(name = "Score_Course", opposite = RelationType.ToOne)
    private Course course; // OneToOne

    @TModelField(name = "成绩")
    private String score;
}
