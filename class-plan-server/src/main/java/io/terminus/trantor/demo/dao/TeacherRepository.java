package io.terminus.trantor.demo.dao;

import io.terminus.trantor.demo.model.Teacher;
import io.terminus.trantor.sdk.autumn.dao.TrantorDAO;
import org.springframework.stereotype.Repository;

/**
 * 用户 dao, 须继承 TrantorDAO，默认已包含 CRUD 操作
 *
 * @author kekee0724
 * @date 2020/9/21
 */
@Repository
public class TeacherRepository extends TrantorDAO<Teacher, Long> {
}
