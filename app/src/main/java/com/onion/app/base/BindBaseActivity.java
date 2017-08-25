package com.onion.app.base;

import android.app.Activity;

import com.onion.base.BaseActivity;
import com.onion.base.wrapper.BindWrapper;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by kougin on 2017/8/25.
 */
public abstract class BindBaseActivity extends BaseActivity implements BindWrapper {
    private Unbinder unbinder;

    @Override
    protected void bindContentView() {
        onBind(this);
    }

    @Override
    public void onBind(Object target) {
        unbinder = ButterKnife.bind((Activity) target);
    }

    @Override
    protected void onDestroy() {
        onUnBind();
        super.onDestroy();
    }

    @Override
    public void onUnBind() {
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

}
