package android.example.com.newsreader;

import android.example.com.newsreader.model.NewsArticle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neo on 10/03/2018.
 */

public class NewsStore {
    private static List<NewsArticle> newsArticles = new ArrayList<>();

    public static List<NewsArticle> getNewsArticles() {
        return newsArticles;
    }

    public static void setNewsArticles(List<NewsArticle> newsArticles) {
        NewsStore.newsArticles = newsArticles;
    }
}
