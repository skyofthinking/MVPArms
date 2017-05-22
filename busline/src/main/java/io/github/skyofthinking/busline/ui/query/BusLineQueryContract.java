package io.github.skyofthinking.busline.ui.query;

import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;

import io.github.skyofthinking.busline.entity.station.Station;
import io.reactivex.Observable;

public interface BusLineQueryContract {
    // 对于经常使用的关于UI的方法可以定义到BaseView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {

    }

    // Model层定义接口,外部只需关心model返回的数据,无需关心内部细节,及是否使用缓存
    interface Model extends IModel {
        Observable<Station> station(String key, String city, String station, boolean update);
    }
}