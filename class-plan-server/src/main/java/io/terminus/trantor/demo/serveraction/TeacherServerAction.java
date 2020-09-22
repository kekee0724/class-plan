package io.terminus.trantor.demo.serveraction;

import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.api.annotation.params.TCollectionParam;
import io.terminus.trantor.api.annotation.params.TParam;
import io.terminus.trantor.demo.dao.TeacherRepository;
import io.terminus.trantor.demo.model.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户模型自定义 server action
 *
 * @author kekee0724
 * @date 2020/9/21
 */
@Slf4j
@Component
public class TeacherServerAction {
    @Autowired
    private TeacherRepository teacherRepository;

    /**
     * 批量修改教师名字
     *
     * @param id 待修改教师 id 列表
     * @param tname 批量修改的名字
     */
    @TAction(modelClass = Teacher.class)
    @DSTransaction
    public void batchUpdateName(@TCollectionParam(Long.class) List<Long> id, @TParam("tname") String tname) {
        Teacher teacher = new Teacher();
        teacher.setTname(tname);
        teacherRepository.updateManyIgnoreRelationSkipNull(id, teacher);
    }
}