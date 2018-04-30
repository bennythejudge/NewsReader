package android.example.com.newsreader;

import android.example.com.newsreader.model.NewsArticle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a list of NewsArticle
        List<NewsArticle> newsArticles = new ArrayList<>();

        newsArticles.add(new NewsArticle(
                "title1",
                "https://beta.techcrunch.com/wp-content/uploads/2018/02/gettyimages-914678410.jpg?w=990&crop=1",
                "https://beta.techcrunch.com/2018/03/10/alibabas-jack-ma-and-joe-tsai-invest-20-million-in-rent-the-runway/",
                "2018-10-01",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tincidunt diam et diam sollicitudin pharetra. Pellentesque suscipit, sem sed consequat pretium, risus mi mollis sapien, a pulvinar nisi nunc vel risus. In vitae ultricies erat, vel sagittis velit. Aenean sodales, elit a accumsan ultricies, massa ipsum ullamcorper nulla, aliquet rutrum diam mi nec lorem. Nulla facilisi. Curabitur vel ligula a massa molestie rutrum eget et turpis. Donec tempor ante eget enim finibus, at malesuada massa posuere. Suspendisse posuere varius aliquet. Curabitur gravida lorem ante, vitae interdum ex tincidunt id. Nam placerat lorem lacus, ac gravida libero maximus a. Donec porta erat nec nibh convallis pharetra. Ut cursus leo lorem, facilisis mattis ligula vestibulum quis. In pharetra, odio at euismod venenatis, nulla sapien accumsan augue, sit amet rutrum velit sem ut magna. Aenean sit amet condimentum libero. Nulla vestibulum sed urna sed commodo. Lorem ipsum dolor sit amet, consectetur adipiscing elit.          ")
        );
        newsArticles.add(new NewsArticle(
                "title2",
                "https://beta.techcrunch.com/wp-content/uploads/2018/03/hexapod_bot.jpg?w=730&crop=1",
                "https://beta.techcrunch.com/2018/03/10/original-content-everything-sucks/",
                "2017-10-01",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tincidunt diam et diam sollicitudin pharetra. Pellentesque suscipit, sem sed consequat pretium, risus mi mollis sapien, a pulvinar nisi nunc vel risus. In vitae ultricies erat, vel sagittis velit. Aenean sodales, elit a accumsan ultricies, massa ipsum ullamcorper nulla, aliquet rutrum diam mi nec lorem. Nulla facilisi. Curabitur vel ligula a massa molestie rutrum eget et turpis. Donec tempor ante eget enim finibus, at malesuada massa posuere. Suspendisse posuere varius aliquet. Curabitur gravida lorem ante, vitae interdum ex tincidunt id. Nam placerat lorem lacus, ac gravida libero maximus a. Donec porta erat nec nibh convallis pharetra. Ut cursus leo lorem, facilisis mattis ligula vestibulum quis. In pharetra, odio at euismod venenatis, nulla sapien accumsan augue, sit amet rutrum velit sem ut magna. Aenean sit amet condimentum libero. Nulla vestibulum sed urna sed commodo. Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
        );
        newsArticles.add(new NewsArticle(
                "title3",
                "https://beta.techcrunch.com/wp-content/uploads/2018/03/37594114336_cf327dda1b_k.jpg?w=990&crop=1",
                "https://beta.techcrunch.com/2018/03/10/original-content-everything-sucks/",
                "2017-10-01",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tincidunt diam et diam sollicitudin pharetra. Pellentesque suscipit, sem sed consequat pretium, risus mi mollis sapien, a pulvinar nisi nunc vel risus. In vitae ultricies erat, vel sagittis velit. Aenean sodales, elit a accumsan ultricies, massa ipsum ullamcorper nulla, aliquet rutrum diam mi nec lorem. Nulla facilisi. Curabitur vel ligula a massa molestie rutrum eget et turpis. Donec tempor ante eget enim finibus, at malesuada massa posuere. Suspendisse posuere varius aliquet. Curabitur gravida lorem ante, vitae interdum ex tincidunt id. Nam placerat lorem lacus, ac gravida libero maximus a. Donec porta erat nec nibh convallis pharetra. Ut cursus leo lorem, facilisis mattis ligula vestibulum quis. In pharetra, odio at euismod venenatis, nulla sapien accumsan augue, sit amet rutrum velit sem ut magna. Aenean sit amet condimentum libero. Nulla vestibulum sed urna sed commodo. Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
        );

        // store the array adapter in NewsStore
        NewsStore.setNewsArticles(newsArticles);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        HomeNewsAdapter homeNewsAdapter = new HomeNewsAdapter(NewsStore.getNewsArticles());
        recyclerView.setAdapter(homeNewsAdapter);
    }
}
