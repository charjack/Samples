package com.wangyz.ioc.runtime.annotation;

import android.view.View;

import androidx.annotation.IdRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangyz
 * @time 2020/5/8 9:57
 * @description 长按事件的注解
 */
@Event(listenerSetter = "setOnLongClickListener", listenerType = View.OnLongClickListener.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnLongClick {

    /**
     * 控件id
     *
     * @return
     */
    @IdRes int[] value();
}
