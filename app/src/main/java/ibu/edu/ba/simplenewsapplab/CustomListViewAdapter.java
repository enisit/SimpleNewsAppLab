package ibu.edu.ba.simplenewsapplab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListViewAdapter extends BaseAdapter {
    private Context context;
    private List<News> newsList;

    public CustomListViewAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return newsList.indexOf(newsList.get(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.custom_list_view_item,parent,false);
        News news = newsList.get(position);

        ImageView image = convertView.findViewById(R.id.list_item_image);
        TextView title = convertView.findViewById(R.id.list_item_title);
        TextView short_desc = convertView.findViewById(R.id.list_item_short_description);

        image.setImageResource(news.getImageId());
        title.setText(news.getTitle());
        short_desc.setText(news.getShortDescription());
        return convertView;
    }
}
