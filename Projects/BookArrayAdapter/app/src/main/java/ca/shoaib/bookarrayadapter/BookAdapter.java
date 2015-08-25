package ca.shoaib.bookarrayadapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, int resourceId,
                         List<Book> items) {
        super(context, resourceId, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater) getContext()
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        Book book = getItem(position);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.book_row, null);
        }

        TextView bookTitle = (TextView) convertView.findViewById(R.id.book_title);
        bookTitle.setText(book.getTitle());

        TextView bookAuthor = (TextView) convertView.findViewById(R.id.book_author);
        bookAuthor.setText(book.getAuthor());

        return convertView;
    }
}
