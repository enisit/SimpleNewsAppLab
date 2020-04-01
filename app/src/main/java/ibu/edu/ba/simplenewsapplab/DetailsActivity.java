package ibu.edu.ba.simplenewsapplab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private ImageView newsImageView;
    private TextView newsTitleView;
    private TextView newsDescView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        newsImageView = findViewById(R.id.news_image);
        newsTitleView = findViewById(R.id.news_title);
        newsDescView = findViewById(R.id.news_short_desc);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            setTitle(extras.getString(MainActivity.EXTRA_TITLE));
            newsImageView.setImageResource(extras.getInt(MainActivity.EXTRA_IMAGE));
            newsTitleView.setText(extras.getString(MainActivity.EXTRA_TITLE));
            newsDescView.setText(extras.getString(MainActivity.EXTRA_DESCRIPTION));
        }
    }
}
