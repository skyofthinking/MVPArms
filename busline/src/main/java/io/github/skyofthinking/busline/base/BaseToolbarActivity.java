package io.github.skyofthinking.busline.base;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jess.arms.base.delegate.IActivity;
import com.jess.arms.mvp.IPresenter;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import javax.inject.Inject;

import io.github.skyofthinking.busline.R;
import io.github.skyofthinking.busline.utils.ToolbarSetting;

import static com.jess.arms.base.delegate.ActivityDelegate.LAYOUT_FRAMELAYOUT;
import static com.jess.arms.base.delegate.ActivityDelegate.LAYOUT_LINEARLAYOUT;
import static com.jess.arms.base.delegate.ActivityDelegate.LAYOUT_RELATIVELAYOUT;

/**
 * 作者： Zero
 * 时间： 2016/6/1
 */
public abstract class BaseToolbarActivity<P extends IPresenter> extends RxAppCompatActivity implements IActivity {
    protected final String TAG = this.getClass().getSimpleName();
    @Inject
    protected P mPresenter;

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View view = null;
        if (name.equals(LAYOUT_FRAMELAYOUT)) {
            view = new AutoFrameLayout(context, attrs);
        }
        if (name.equals(LAYOUT_LINEARLAYOUT)) {
            view = new AutoLinearLayout(context, attrs);
        }
        if (name.equals(LAYOUT_RELATIVELAYOUT)) {
            view = new AutoRelativeLayout(context, attrs);
        }
        return view == null ? super.onCreateView(name, context, attrs) : view;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.onDestroy();//释放资源
        this.mPresenter = null;
    }

    /**
     * 是否使用eventBus,默认为使用(true)，
     *
     * @return
     */
    @Override
    public boolean useEventBus() {
        return true;
    }

    /**
     * 这个Activity是否会使用Fragment,框架会根据这个属性判断是否注册{@link android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks}
     * 如果返回false,那意味着这个Activity不需要绑定Fragment,那你再在这个Activity中绑定继承于 {@link com.jess.arms.base.BaseFragment} 的Fragment将不起任何作用
     *
     * @return
     */
    @Override
    public boolean useFragment() {
        return true;
    }

    private ToolbarSetting toolbarSetting = null;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        setToolbar();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        setToolbar();
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        setToolbar();
    }

    /**
     * xml 界面默认添加 <include layout="@layout/base_toolbar" /></p>
     * 可使用 Toolbar 自定义标题头;<p/>
     * 控件 ID 必须 默认的 ID 相同 否则无法使用本类定义的方法<p/>
     * <p>
     * Toolbar 初始化
     */
    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.base_toolbar);
        if (toolbar == null)
            return;
        setSupportActionBar(toolbar);
        ImageView left_image = (ImageView) findViewById(R.id.toolbar_left_image);
        TextView left_text = (TextView) findViewById(R.id.toolbar_left_text);
        ImageView title_image = (ImageView) findViewById(R.id.toolbar_title_image);
        TextView title_text = (TextView) findViewById(R.id.toolbar_title_text);
        ImageView right_image = (ImageView) findViewById(R.id.toolbar_right_image);
        TextView right_text = (TextView) findViewById(R.id.toolbar_right_text);
        toolbarSetting = new ToolbarSetting(left_image, left_text, right_image, right_text, title_image, title_text);
    }

    /**
     * 获取 Toolbar 的控制
     *
     * @return ToolbarSetting
     */
    public ToolbarSetting getToolbarSetting() {
        return toolbarSetting;
    }

    /**
     * 点击右边的控件
     *
     * @param view Toolbar.LinearLayout
     */
    public abstract void onRightClick(View view);

    /**
     * 点击左边的控件
     *
     * @param view Toolbar.LinearLayout
     */
    public abstract void onLeftClick(View view);
}
