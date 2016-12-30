package com.jkxy.bd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SignInPage extends Fragment {
    private GridView gridView;
    View view;
    private List<Map<String, Object>> data;
    private SimpleAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sign_in, container, false);

        init();
        return view;
    }

    public void init() {
        gridView = (GridView) view.findViewById(R.id.gv);
        data = new ArrayList<Map<String, Object>>();
        setData();
        String[] from = {"image", "text"};
        int[] to = {R.id.gridViewImage, R.id.gridViewText};
        adapter = new SimpleAdapter(getActivity(), data, R.layout.sign_grid_view, from, to);
        gridView.setAdapter(adapter);
    }

    public List<Map<String, Object>> setData() {
        int[] icon = {R.drawable.my_balance_icon, R.drawable.my_messages, R.drawable.icon_business_entry, R.drawable.mypage_list_icon_comment,
                R.drawable.mypage_list_icon_daijinjuan, R.drawable.mypage_list_icon_location, R.drawable.mypage_list_icon_refund, R.drawable.mypage_list_icon_star,
                R.drawable.mypage_list_icon_wallet, R.drawable.online_service, R.drawable.icon_common_problem, R.drawable.mypage_navigationbar_icon_setting};
        String[] iconName = {"我的余额", "我的消息", "订购商家", "订单记录",
                "代金券", "我的位置", "我的退款", "收藏店铺",
                "百度钱包", "在线客服", "常见问题", "设置"};
        for (int i = 0; i < icon.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", icon[i]);
            map.put("text", iconName[i]);
            data.add(map);
        }
        return data;
    }

}
