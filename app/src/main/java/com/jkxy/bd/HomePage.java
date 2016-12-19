package com.jkxy.bd;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2016/12/14.
 */
public class HomePage extends Fragment {
    ListView listView;
    ArrayAdapter<String> adapter;
    View view, view1;
    Activity mActivity;
    AppCompatActivity mAppCompatActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view1 = inflater.inflate(R.layout.home_page_fragment_listview, container, false);
        view = inflater.inflate(R.layout.home_page_fragment, container, false);

        initListView();
        initToolbar();

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_layout, menu);
        super.onCreateOptionsMenu(menu, inflater);

    }

    public void initToolbar() {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolBar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        setHasOptionsMenu(true);
    }

    public void initListView() {
        listView = (ListView) view.findViewById(R.id.listView);
        String[] str = {"title", "picture"};
        int[] id = {R.id.shopTitle, R.id.shopImage};
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), setData(), R.layout.home_page_fragment_listview, str, id);
        listView.setAdapter(simpleAdapter);
    }

    public List<Map<String, Object>> setData() {
        ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = null;
        for (int i = 0; i < 10; i++) {
            map = new HashMap<>();
            map.put("title", "麻辣烫");
            map.put("picture", R.drawable.shopone);
            list.add(map);
            map = new HashMap<>();
            map.put("title", "一洋码头");
            map.put("picture", R.drawable.shoptwo);
            list.add(map);
            map = new HashMap<>();
            map.put("title", "momo花店");
            map.put("picture", R.drawable.shopthree);
            list.add(map);
        }
        return list;


    }
}
