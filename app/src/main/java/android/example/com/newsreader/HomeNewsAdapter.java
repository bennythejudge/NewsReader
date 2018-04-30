package android.example.com.newsreader;

import android.example.com.newsreader.model.NewsArticle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neo on 10/03/2018.
 */

public class HomeNewsAdapter extends RecyclerView.Adapter<HomeNewsAdapter.HomeNewsViewsHolder> {
    private List<NewsArticle> newsArticles;

    public HomeNewsAdapter(List<NewsArticle> newsArticles) {
        this.newsArticles = newsArticles;
    }

    @Override
    public HomeNewsViewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_home_news, parent, false);
        HomeNewsViewsHolder homeNewsViewsHolder = new HomeNewsViewsHolder(view);
        return homeNewsViewsHolder;
    }

    @Override
    public void onBindViewHolder(HomeNewsViewsHolder holder, int position) {
        Log.v("HomeNewsAdapter", "position: " + position);
        NewsArticle newsArticle = newsArticles.get(position);

        Glide.with(holder.cardImageView.getContext())
                .load(newsArticle.getImageUrl())
                .centerCrop()
                .error(R.mipmap.ic_launcher)
                .into(holder.cardImageView);

        Log.v("HomeNewsAdapter", newsArticles.get(position).getImageUrl());

        holder.cardTitleTextView.setText(newsArticle.getTitle());
        holder.cardTimeTextView.setText(newsArticle.getTimestamp());
        holder.cardContentTextView.setText(newsArticle.getContent());
    }

    @Override
    public int getItemCount() {
        return newsArticles.size();
    }

    public static class HomeNewsViewsHolder extends RecyclerView.ViewHolder {
        ImageView cardImageView;
        TextView cardTitleTextView;
        TextView cardTimeTextView;
        TextView cardContentTextView;

        public HomeNewsViewsHolder(View itemView) {
            super(itemView);
            cardImageView = (ImageView) itemView.findViewById(R.id.card_news_image);
            cardTitleTextView = (TextView) itemView.findViewById(R.id.card_news_title);
            cardTimeTextView = (TextView) itemView.findViewById(R.id.card_news_timestamp);
            cardContentTextView = (TextView) itemView.findViewById(R.id.card_news_content);
        }
    }

}
