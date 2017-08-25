package com.onion.base.wrapper;

/**
 * Created by kougin on 2017/8/25.
 */
public interface BindWrapper {

    void onBind(Object target);

    void onUnBind();
}