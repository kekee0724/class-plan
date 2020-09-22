package io.terminus.trantor.demo;

import io.terminus.trantor.api.ModuleDefinition;

/**
 * 请替换为自己的
 *
 * @author 可可
 * @date 2020/9/22
 */
public class DemoModuleDefinition extends ModuleDefinition {
    /**
     * module key， 请保证全局唯一
     */
    public static final String DEMO_MODULE_KEY = "class_plan";

    @Override
    protected String getKey() {
        return DEMO_MODULE_KEY;
    }

    @Override
    protected String getName() {
        return "Class Plan";
    }

    @Override
    protected String getVersion() {
        return "0.0.1-SNAPSHOT";
    }

    @Override
    protected String getDesc() {
        return "Class Plan";
    }
}
