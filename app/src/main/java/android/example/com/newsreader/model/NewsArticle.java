package android.example.com.newsreader.model;

/**
 * Created by neo on 10/03/2018.
 */

public class NewsArticle {
    private String mTitle;
    private String mImageUrl;
    private String mUrl; // the URL that contains the news article
    private String mTimestamp;
    private String mContent;


    public NewsArticle(String title, String imageUrl, String url, String timestamp, String content) {
        this.mTitle = title;
        this.mImageUrl = imageUrl;
        this.mUrl = url;
        this.mTimestamp = timestamp;
        this.mContent = content;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public String getContent() {
        return mContent;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setImageUrl(String imageUrl) {
        this.mImageUrl = imageUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public void setTimestamp(String timestamp) {
        this.mTimestamp = timestamp;
    }

    public void setContent(String content) {
        this.mContent = content;
    }
}
