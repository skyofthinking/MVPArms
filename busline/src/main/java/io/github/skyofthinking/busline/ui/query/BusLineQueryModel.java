package io.github.skyofthinking.busline.ui.query;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

import io.github.skyofthinking.busline.base.api.cache.CommonCache;
import io.github.skyofthinking.busline.base.api.service.BusLineService;
import io.github.skyofthinking.busline.entity.station.Station;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictDynamicKey;
import io.rx_cache2.Reply;

@ActivityScope
public class BusLineQueryModel extends BaseModel implements BusLineQueryContract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public BusLineQueryModel(IRepositoryManager repositoryManager, Gson gson, Application application) {
        super(repositoryManager);
        this.mGson = gson;
        this.mApplication = application;
    }

    @Override
    public Observable<Station> station(String key, String city, String station, boolean update) {
        Observable<Station> result = mRepositoryManager.obtainRetrofitService(BusLineService.class).station(key, city, station);
        //使用rxcache缓存,上拉刷新则不读取缓存,加载更多读取缓存
        return mRepositoryManager.obtainCacheService(CommonCache.class).station(result, new DynamicKey(city + station), new EvictDynamicKey(update)).flatMap(new Function<Reply<Station>, ObservableSource<Station>>() {
            @Override
            public ObservableSource<Station> apply(@NonNull Reply<Station> listReply) throws Exception {
                return Observable.just(listReply.getData());
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

}