package com.jkxy.bd;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/20.
 */
public class OrderPage extends Fragment {
    ListView lv;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.order_page_fragment, container, false);
        init();
        return view;
    }

    public void init() {
        lv = (ListView)view.findViewById(R.id.opListView);
        String[] str = {"title", "picture", "price", "goods"};
        int[] id = {R.id.oderShopTitle, R.id.orderShopPicture, R.id.price, R.id.goods};
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), setData(), R.layout.order_page_fragment_listview, str, id);
        lv.setAdapter(adapter);
    }

    public List<Map<String, Object>> setData() {
        ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = null;
        for (int i = 0; i < 5; i++) {
            map = new HashMap<>();
            map.put("title", "麻辣烫");
            map.put("picture", R.drawable.shopone);
            map.put("price", 30);
            map.put("goods", "云南米线");
            list.add(map);
            map = new HashMap<>();
            map.put("title", "一洋码头");
            map.put("picture", R.drawable.shoptwo);
            map.put("price", 150);
            map.put("goods", "生鱼片");
            list.add(map);
            map = new HashMap<>();
            map.put("title", "momo花店");
            map.put("picture", R.drawable.shopthree);
            map.put("price", 300);
            map.put("goods", "康乃馨");
            list.add(map);
        }
        return list;
    }
}
