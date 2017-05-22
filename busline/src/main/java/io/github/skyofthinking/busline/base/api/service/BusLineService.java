package io.github.skyofthinking.busline.base.api.service;

import io.github.skyofthinking.busline.entity.station.Station;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * @author JiangYH
 */
public interface BusLineService {

    String HEADER_API_VERSION = "Accept: application/vnd.github.v3+json";

    @Headers({HEADER_API_VERSION})
    @GET("/189/bus//station")
    Observable<Station> station(@Query("key") String key, @Query("city") String city, @Query("station") String station);

    @Headers({HEADER_API_VERSION})
    @GET("/189/bus//station")
    Observable<Station> station(@Query("key") String key, @Query("city") String city, @Query("station") String station, @Query("dtype") String dtype);
}
