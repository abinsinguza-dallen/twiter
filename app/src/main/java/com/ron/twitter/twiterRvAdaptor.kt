package com.ron.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class twiterRvAdaptor(var twiterlist:List<Contacts>):RecyclerView.Adapter<TweetViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
            var itemView= LayoutInflater .from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
            return TweetViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
            var currentTweets=twiterlist.get(position)
            holder.tvName.text=currentTweets.name
            holder.tvHandle.text=currentTweets.handle
            holder.tvTweet.text=currentTweets.tweet
            holder.tvName.text=currentTweets.name
            holder.tvreplies.text=currentTweets.numResponse
            holder.tvlikes.text=currentTweets.numlikes
            holder.tvRetweet.text=currentTweets.numRetweets

        }

        override fun getItemCount(): Int {
            return twiterlist.size

        }
    }
    class TweetViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName=itemView.findViewById<TextView>(R.id.tvName)
        var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
        var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
        var ivReplies=itemView.findViewById<ImageView>(R.id.ivReplies)
        var tvreplies=itemView.findViewById<TextView>(R.id.tvReplies)
        var ivLikes=itemView.findViewById<ImageView>(R.id.ivLikes)
        var tvlikes=itemView.findViewById<TextView>(R.id.tvlikes)
        var ivRetweet=itemView.findViewById<ImageView>(R.id.ivRetweet)
        var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)





    }
