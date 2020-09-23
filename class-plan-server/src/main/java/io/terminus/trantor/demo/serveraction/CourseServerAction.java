package io.terminus.trantor.demo.serveraction;

import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantor.api.TContext;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.demo.dao.CourseRepository;
import io.terminus.trantor.demo.model.Course;
import io.terminus.trantor.module.base.model.User;
import io.terminus.trantor.sdk.action.ActionBusinessMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户模型自定义 server action
 *
 */
@Slf4j
@Component
public class CourseServerAction {
    @Autowired
    private CourseRepository courseRepository;

    /**
     * 重写新增课程Action
     *
     */
    @TAction(modelClass = Course.class)
    @DSTransaction
    public ActionBusinessMessage create(Course course) {
        System.out.println("Brt-自定义新增处理-0005");
        System.out.println("Brt-course.getCid=" + course.getCid());
        System.out.println("Brt-course.getCname=" + course.getCname());
        System.out.println("Brt-course.getTeacher=" + course.getTeacher());
        User user = TContext.getCurrentUser();
        System.out.println("Brt-currentUser.id=" + user.getId());
        //TODO
        return ActionBusinessMessage.error("内部错误，保存失败。");
    }
}