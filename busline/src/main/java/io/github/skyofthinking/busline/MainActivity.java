package io.github.skyofthinking.busline;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jess.arms.di.component.AppComponent;

import io.github.skyofthinking.busline.base.BaseToolbarActivity;
import io.github.skyofthinking.busline.utils.ToolbarSetting;

public class MainActivity extends BaseToolbarActivity {

    Button btn_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToolbarSetting toolbarSetting = getToolbarSetting();
        toolbarSetting.setImageResource(ToolbarSetting.LEFT, R.mipmap.ic_launcher);
        toolbarSetting.toolbarLeftImage.setVisibility(View.GONE);
        toolbarSetting.setText(ToolbarSetting.LEFT, "深圳");
        toolbarSetting.setText(ToolbarSetting.TITLE, "全国公交及路径规划查询");
        toolbarSetting.setText(ToolbarSetting.RIGHT, "关闭");
        toolbarSetting.toolbarRightText.setVisibility(View.GONE);
        toolbarSetting.setImageResource(ToolbarSetting.RIGHT, R.mipmap.ic_launcher);
        toolbarSetting.toolbarRightImage.setVisibility(View.GONE);

        btn_select = (Button) findViewById(R.id.btn_select);
    }

    @Override
    public void onRightClick(View view) {
        Toast.makeText(getApplicationContext(), "点击右边的按钮", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onLeftClick(View view) {
        Toast.makeText(getApplicationContext(), "点击左边的按钮", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }
}
