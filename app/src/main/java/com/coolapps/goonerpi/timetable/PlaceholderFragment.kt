package com.coolapps.goonerpi.timetable

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.coolapps.goonerpi.timetable.app.App
import com.coolapps.goonerpi.timetable.utils.DbDataManager
import kotlinx.android.synthetic.main.fragment_main.view.*

class PlaceholderFragment : Fragment() {


    var lessons = DbDataManager.getData(App.database)


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_main, container, false)
        with(rootView.daily_timetable) {
            layoutManager = LinearLayoutManager(activity)
            adapter = RecyclerViewAdapter(lessons[arguments?.getInt(ARG_SECTION_NUMBER)!! - 1]!!)
        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            val fragment = PlaceholderFragment()
            val args = Bundle()
            args.putInt(ARG_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}