package ibu.edu.ba.simplenewsapplab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_IMAGE = MainActivity.class.getPackage().getName()+".extra.IMAGE";
    public static final String EXTRA_TITLE = MainActivity.class.getPackage().getName()+".extra.TITLE";
    public static final String EXTRA_DESCRIPTION = MainActivity.class.getPackage().getName()+".extra.DESCRIPTION";
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.list_view_container);
        CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter(this,getNews());
        mListView.setAdapter(customListViewAdapter);
        mListView.setOnItemClickListener(onItemClickListener);
    }
    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            News news = (News) parent.getItemAtPosition(position);

            Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra(EXTRA_IMAGE,news.getImageId());
            intent.putExtra(EXTRA_TITLE,news.getTitle());
            intent.putExtra(EXTRA_DESCRIPTION,news.getShortDescription());
            startActivity(intent);
        }
    };
    private List<News> getNews(){
        List<News> news = new ArrayList<>();
        news.add(new News(R.drawable.fox_news,"Fox news", "Fox news desc"));
        news.add(new News(R.drawable.sky_news,"Sky news", "Sky news desc"));
        news.add(new News(R.drawable.news_sample1, "Sample news","Sample news description"));
        return news;
    }
}
