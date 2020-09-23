package io.terminus.trantor.demo.serveraction;

import io.terminus.trantor.demo.dao.CourseRepository;
import io.terminus.trantor.demo.model.Course;
import io.terminus.trantor.sdk.datasource.SingleDataAction;
import io.terminus.trantor.sdk.datasource.SingleDataParams;
import io.terminus.trantor.sdk.datasource.SingleDataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CourseToCreateDataAction implements SingleDataAction<Course> {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public SingleDataResult<Course> load(SingleDataParams singleDataParams) {
        System.out.println("Brt-视图数据获取-0001");
//        Optional<Course> course = this.courseRepository.findById(1L);
//        Object maxNum = this.courseRepository.max("num", null);
        Course obj = new Course();
        return new SingleDataResult<>(obj);
    }
}
