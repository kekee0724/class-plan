package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author kekee0724
 */
public enum SexType {
    @Label(value = "男")
    MALE,

    @Label(value = "女")
    FEMALE;
}
