package me.majiajie.pagerbottomtabstrip;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationBar bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar
                .addItem(new BottomNavigationItem(android.R.drawable.ic_menu_save, "看什么看").setActiveColor(0xFFFF0000))
                .addItem(new BottomNavigationItem(android.R.drawable.ic_menu_save, "图书").setActiveColor(0xFF00FF00))
                .addItem(new BottomNavigationItem(android.R.drawable.ic_menu_save, "音乐").setActiveColor(0xFF0000FF))
                .addItem(new BottomNavigationItem(android.R.drawable.ic_menu_save, "通知").setActiveColor(0xFFFF0000))
                .addItem(new BottomNavigationItem(android.R.drawable.ic_menu_save, "个人").setActiveColor(0xFF00FF00))
                .initialise();

        PagerBottomTabStrip pagerBottomTabStrip = (PagerBottomTabStrip) findViewById(R.id.tab);

        pagerBottomTabStrip.builder()
                .addTabItem(android.R.drawable.ic_menu_save, "看什么看")
                .addTabItem(android.R.drawable.ic_menu_save, "图书")
                .addTabItem(android.R.drawable.ic_menu_save, "音乐")
                .addTabItem(android.R.drawable.ic_menu_save, "通知")
                .addTabItem(android.R.drawable.ic_menu_save, "个人")
                .setMode(TabStripMode.HIDE_TEXT)
                .build();
    }

}