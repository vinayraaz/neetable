package com.neetablevinaytask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendList extends AppCompatActivity {
    RecyclerView recyclerView;
    List<FriendListModel> friendListModels = new ArrayList<>();
    FriendAdapter friendAdapter;
    String [] name={"Vinay", "Mohan","Alex","Trom","Vinay", "Mohan","Alex","Trom"};
    String [] datetime = {"10:12 AM","02:20 PM","12-10-19","22-04-19","10:12 AM","02:20 PM","12-10-19","22-04-19"};
    String [] message = {"Hello, how are you.","Whree are you going", "welcome to home", "CSK won match from 2 wickets","Hello, how are you.","Whree are you going", "welcome to home", "CSK won match from 2 wickets"};
    String [] msgcount ={"2","5","1","3","2","5","1","3"};
    Integer [] image ={R.drawable.flower,R.drawable.tomcruise,R.drawable.flower,R.drawable.tomcruise,R.drawable.tomcruise,R.drawable.flower,R.drawable.flower,R.drawable.tomcruise};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friendlist);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        for (int i=0;i<name.length;i++){
            friendListModels.add(new FriendListModel(name[i],datetime[i],message[i],msgcount[i],image[i]));
        }
loadmethod();
    }

    private void loadmethod() {
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        friendAdapter = new  FriendAdapter (this,friendListModels);
        recyclerView.setAdapter(friendAdapter);
    }
}
