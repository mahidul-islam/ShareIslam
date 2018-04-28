package com.example.zihan.shareislam;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{

    private Context mCTx;
    private List<Book> bookList;

    public BookAdapter(Context mCTx, List<Book> bookList) {
        this.mCTx = mCTx;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCTx);
        View view = inflater.inflate(R.layout.book_list ,null);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

        Book book = bookList.get(position);

        holder.textViewName.setText(book.getName());
        holder.textViewCatagory.setText(book.getCatagory());

        holder.imageView.setImageDrawable(mCTx.getResources().getDrawable(book.getImage_id()));

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    class BookViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewName, textViewCatagory;
        Button button;

        public BookViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.book_name);
            textViewCatagory = itemView.findViewById(R.id.book_catagory);
            button = itemView.findViewById(R.id.book_collect);

        }

    }

}
