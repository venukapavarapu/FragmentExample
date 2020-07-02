package com.venu.fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A fragment representing a list of Items.
 */
class ListFragment : androidx.fragment.app.ListFragment() {

    private var columnCount = 1
    var dataArray: Array<String> = arrayOf("One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten")
    lateinit var sharedViewModel : SharedViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listAdapter: ListAdapter = ArrayAdapter(
            activity!!,
            android.R.layout.simple_list_item_1, dataArray
        )
        setListAdapter(listAdapter)

        sharedViewModel=activity?.run {
            ViewModelProviders.of(this).get(SharedViewModel::class.java)
        }!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        return view
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        sharedViewModel.setData(dataArray.get(position))
    }
}