package com.jkxy.bd;

import android.app.Activity;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/12/14.
 */
public class HomePage extends Fragment {
    ListView listView;
    ArrayAdapter<String> adapter;
    View view;
    Activity mActivity;
    AppCompatActivity mAppCompatActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_page_fragment, container, false);
        initListView();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolBar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        setHasOptionsMenu(true);
        toolbar.setTitle("");
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_layout, menu);
        super.onCreateOptionsMenu(menu, inflater);

    }

    public void initListView() {
        listView = (ListView) view.findViewById(R.id.listView);
        String[] data = {"adwqsx", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa", "dqweqa"};
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
}
