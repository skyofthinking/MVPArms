package io.github.skyofthinking.busline.ui.query;

import android.app.Application;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.widget.imageloader.ImageLoader;

import javax.inject.Inject;

import io.github.skyofthinking.busline.entity.station.Station;
import io.github.skyofthinking.busline.utils.RxUtils;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;

@ActivityScope
public class BusLineQueryPresenter extends BasePresenter<BusLineQueryContract.Model, BusLineQueryContract.View> {
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private ImageLoader mImageLoader;
    private AppManager mAppManager;

    @Inject
    public BusLineQueryPresenter(BusLineQueryContract.Model model, BusLineQueryContract.View rootView, RxErrorHandler handler, Application application, ImageLoader imageLoader, AppManager appManager) {
        super(model, rootView);
        this.mErrorHandler = handler;
        this.mApplication = application;
        this.mImageLoader = imageLoader;
        this.mAppManager = appManager;
    }


    public void requestStation(final boolean pullToRefresh) {
        mModel.station("1c7e4d039e8a1192a18f6f1c3ef999ad", "0512", "生物纳米园", true).subscribeOn(Schedulers.io()).retryWhen(new RetryWithDelay(3, 2))//遇到错误时重试,第一个参数为重试几次,第二个参数为重试的间隔
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();//显示上拉刷新的进度条
                }).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).doAfterTerminate(() -> {
            mRootView.hideLoading();//隐藏上拉刷新的进度条
        }).compose(RxUtils.bindToLifecycle(mRootView))//使用RXlifecycle,使subscription和activity一起销毁
                .subscribe(new ErrorHandleSubscriber<Station>(mErrorHandler) {
                    @Override
                    public void onNext(Station station) {

                    }
                });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }

}