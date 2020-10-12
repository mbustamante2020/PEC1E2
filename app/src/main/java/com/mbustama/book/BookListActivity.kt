package com.mbustama.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.book_list.*
import modelo.BookModel.ITEMS

class BookListActivity : AppCompatActivity() {

    private var mTwoPane: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        if (book_detail_container != null) { // values-w900dp
            mTwoPane = true
        }
        setupRecyclerView(book_list)
    }

    private fun setupRecyclerView(recyclerView: RecyclerView) {
        recyclerView.adapter = SimpleItemRecyclerViewAdapter(this, ITEMS, mTwoPane)
    }
}