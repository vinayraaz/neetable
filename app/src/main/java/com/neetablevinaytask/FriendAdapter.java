package com.neetablevinaytask;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendViewHolder> {
    private Context context;
    List<FriendListModel> friendListModels = new ArrayList<>();
    public FriendAdapter(Context context, List<FriendListModel> friendListModels) {
        this.context = context;
        this.friendListModels =friendListModels;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.friendlist_details, parent, false);
        // set the view's size, margins, paddings and layout parametersÂ¥
        FriendViewHolder friendViewHolder = new FriendViewHolder(v); // pass the view to View Holder
        return friendViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
        holder.Name.setText(friendListModels.get(position).getName());
        holder.Message.setText(friendListModels.get(position).getMessage());
        holder.MsgCount.setText(friendListModels.get(position).getMsgcount());
        holder.DateTime.setText(friendListModels.get(position).getDateTime());
        holder.userImage.setImageResource(friendListModels.get(position).getUserImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(context,ChatMassegsActivity.class);
                context.startActivity(i2);
            }
        });

    }

    @Override
    public int getItemCount() {
        return friendListModels.size();
    }

    public class FriendViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView Name,Message,MsgCount,DateTime;
        public CircleImageView userImage;
        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = (TextView) itemView.findViewById(R.id.tvname);
            Message =(TextView)itemView.findViewById(R.id.tvmsg);
            MsgCount =(TextView)itemView.findViewById(R.id.tvmsgcount);
            DateTime =(TextView)itemView.findViewById(R.id.tvtdatetime);
            userImage =(CircleImageView)itemView.findViewById(R.id.profile_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
