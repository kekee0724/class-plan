package io.terminus.trantor.demo.serveraction;

import io.terminus.trantor.demo.model.Course;
import io.terminus.trantor.sdk.datasource.DataProcessorAction;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
@Component
public class CourseToCreateProcessor implements DataProcessorAction<Course, Course> {

    @Override
    public @NotNull Collection process(Collection<Course> data) {
        System.out.println("Brt-视图数据处理-0003");
/*
        for (Course obj : data) {
            System.out.println("Brt-num:" + obj.getNum());
        }*/

        Course course = new Course();
        course.setCid("CC01");
        course.setCname("CCCC");
        List<Course> list = new ArrayList<>(1);
        list.add(course);
        return list;
    }
}
