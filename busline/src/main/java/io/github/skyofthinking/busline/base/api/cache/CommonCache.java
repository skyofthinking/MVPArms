package io.github.skyofthinking.busline.base.api.cache;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.skyofthinking.busline.entity.User;
import io.github.skyofthinking.busline.entity.station.Station;
import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictProvider;
import io.rx_cache2.LifeCache;
import io.rx_cache2.Reply;

/**
 * Created by jess on 8/30/16 13:53
 * Contact with jess.yan.effort@gmail.com
 */
public interface CommonCache {

    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<List<User>>> getUsers(Observable<List<User>> users, DynamicKey idLastUserQueried, EvictProvider evictProvider);

    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<Station>> station(Observable<Station> users, DynamicKey cityStation, EvictProvider evictProvider);
}
