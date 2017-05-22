package io.github.skyofthinking.busline.ui.query;

import android.content.Intent;
import android.support.annotation.NonNull;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.UiUtils;

import io.github.skyofthinking.busline.R;
import timber.log.Timber;

import static com.jess.arms.utils.Preconditions.checkNotNull;

public class BusLineQueryActivity extends BaseActivity<BusLineQueryPresenter> implements BusLineQueryContract.View {

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        DaggerBusLineQueryComponent
                .builder()
                .appComponent(appComponent)
                .busLineQueryModule(new BusLineQueryModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView() {
        Timber.tag(TAG).w("initView");
        return R.layout.activity_bus_line_query;
    }

    @Override
    public void initData() {
        mPresenter.requestStation(true);
    }

    @Override
    public void showLoading() {
        Timber.tag(TAG).w("showLoading");
    }

    @Override
    public void hideLoading() {
        Timber.tag(TAG).w("hideLoading");
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        UiUtils.SnackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        UiUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }
}