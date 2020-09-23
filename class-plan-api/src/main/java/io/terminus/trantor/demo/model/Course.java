package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.RelationType;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.Data;

import java.util.List;

/**
 * 建立课程表
 * create table course(cid int primary key auto_increment,
 * cname varchar(20),
 * tid int,
 * foreign key(tid) references teacher(tid));
 * 数据当初分散着设计主要有以下几个原因：
 * 1、不同的地方需要查询的数据字段不同，可能60%的数据处理只需要其中一张表的内容（比如上课时间，上课的地点来计算教室的使用情况）
 * 2、降低数据冗余度，减轻一张表的数据变更会带给其他表的影响  比方说我现在设计课程这块有3张表：
 * 1、course 这个表存储着课程资源（名称，英文名，编号，备注之类）
 * 2、course_plan 这个表存储着课程计划（课程资源ID，年度，学期，学分，学时，负责老师等）
 * 3、course_room  这个表存储着每学期具体的上课安排（课程计划ID，上课时间，上课地点，总人数，缺席人数等）
 * 其中，course_plan 有个字段 course_id 链接到 course 的id字段；course_room 有个字段 plan_id 链接到 course_plan 的id；
 * 这样的话，如果哪天，老师突然说，我们这学期的课程因为教学计划变更，不上AAA了，改上BBB，这时只要改下course_plan 里的course_id 就可以了
 * 同样，如果教师离职，变更其他教师上课，只要修改 course_plan 里的 member_id（负责老师） 就可以了
 * 通过现实的描述分解出几个实体，分别为班级、学生、课程、教师。出现了几组关系，
 * 分别为一个班级由多名学生组成（1对多）、一名学生可以选多门课程，
 * 同时一门课程可能被多名学生选修（多对多）、一名教师可传授多门课程，
 * 同时一门课程可能被多名教师传授（多对多）。这个场景里面没有一对一的关系。
 */
@Data
@TModel(name = "课程信息", mainField = "cid")
public class Course extends BaseModel<Long> {
    private static final long serialVersionUID = 1L;

    @TModelField(name = "课程编号", nullable = false)
    private String cid;

    @TModelField(name = "课程名称", nullable = false)
    private String cname;

//    @TModelField(name = "所属教师")
//    @RelationMeta(name = "Course_Teacher")
//    private Teacher teacher;// ManyToOne

    @TModelField(name = "教师")
    @RelationMeta(name = "Course_Teacher", modelClass = Teacher.class)
    private List<Teacher> teacher; //  OneToMany


//    @TModelField(name = "教师")
//    @RelationMeta(name = "Course_Teacher", modelClass = Teacher.class, opposite = RelationType.ToMany)
//    private List<Teacher> teachers; // ManyToMany

//    @TModelField(name = "教师")
//    @RelationMeta(name = "Course_Teacher", modelClass = Teacher.class)
//    private List<Teacher> teacher; // ManyToMany
}
