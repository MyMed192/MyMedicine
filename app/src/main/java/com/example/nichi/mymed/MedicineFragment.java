package com.example.nichi.mymed;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class MedicineFragment extends Fragment {

    private Activity mActivity;
    private Context mContext;

    private LinkedHashMap<String, GroupItemsInfo> songsList = new LinkedHashMap<String, GroupItemsInfo>();
    private ArrayList<GroupItemsInfo> deptList = new ArrayList<GroupItemsInfo>();

    private MyExpandableAdapter myExpandableListAdapter;
    private ExpandableListView simpleExpandableListView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_medicine, container, false);

        loadData();

        simpleExpandableListView = (ExpandableListView) view.findViewById(R.id.simpleExpandableListView);

        myExpandableListAdapter = new MyExpandableAdapter(mActivity, deptList);

        simpleExpandableListView.setAdapter(myExpandableListAdapter);

        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //get the group header
                GroupItemsInfo headerInfo = deptList.get(groupPosition);
                //get the child info
                ChildItemsInfo detailInfo = headerInfo.getSongName().get(childPosition);
                //display it or do something with it
                Toast.makeText(getActivity().getBaseContext(), " List And Song Is :: " + headerInfo.getName()
                        + "/" + detailInfo.getName(), Toast.LENGTH_LONG).show();
                return true;
            }
        });
        // setOnGroupClickListener listener for group Song List click
        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupItemsInfo headerInfo = deptList.get(groupPosition);
                //display it or do something with it
                Toast.makeText(getActivity().getBaseContext(), " List Name :: " + headerInfo.getName(),
                        Toast.LENGTH_LONG).show();

                return false;
            }
        });


        return view;
    }

    // load some initial data into out list
    private void loadData() {

        addProduct("Latest Punjabi Songs", "Tere Bagair - Amrinder Gill");
        addProduct("Latest Punjabi Songs", "Khaab - Akhil");
        addProduct("Latest Punjabi Songs", "Dil - Ninja");

        addProduct("Top 50 Songs", "Tere Bagair- Amrinder Gill");
        addProduct("Top 50 Songs", "Attt Karti - Jassi Gill");

        addProduct("Top Of This Week", "Khaab- Akhil");
        addProduct("Top Of This Week", "Tere Bagair- Amrinder Gill");
        addProduct("Top Of This Week", "Gal Sun Ja - Kanwar Chahal");

    }


    // here we maintain songsList and songs names
    private int addProduct(String songsListName, String songName) {

        int groupPosition = 0;

        //check the hashmap if the group already exists
        GroupItemsInfo headerInfo = songsList.get(songsListName);
        //add the group if doesn't exists
        if (headerInfo == null) {
            headerInfo = new GroupItemsInfo();
            headerInfo.setName(songsListName);
            songsList.put(songsListName, headerInfo);
            deptList.add(headerInfo);
        }

        // get the children for the group
        ArrayList<ChildItemsInfo> productList = headerInfo.getSongName();
        // size of the children list
        int listSize = productList.size();
        // add to the counter
        listSize++;

        // create a new child and add that to the group
        ChildItemsInfo detailInfo = new ChildItemsInfo();
        detailInfo.setName(songName);
        productList.add(detailInfo);
        headerInfo.setPlayerName(productList);

        // find the group position inside the list
        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }


}

