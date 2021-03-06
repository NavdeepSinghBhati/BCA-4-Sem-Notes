package com.example.bca4semnotes.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bca4semnotes.R;
import com.example.bca4semnotes.adapter.RecycleViewAdapter;
import com.example.bca4semnotes.adapter.suitCaseAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class conam_fragment extends Fragment {
    private RecyclerView recyclerView;
    ArrayList<suitCaseAdapter> arrlist =new ArrayList<>();
    public conam_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conam_fragment, container, false);

        recyclerView=view.findViewById(R.id.recyleView_conam);

        addData(R.drawable.ic_launcher_background,"CONAM Unit 1");
        addData(R.drawable.ic_launcher_background,"CONAM Unit 2");
        addData(R.drawable.ic_launcher_background,"CONAM Unit 3");
        addData(R.drawable.ic_launcher_background,"CONAM Unit 4");
        addData(R.drawable.ic_launcher_background,"CONAM Unit 5");
        addData(R.drawable.ic_launcher_background,"CONAM Syllabus");
        RecycleViewAdapter adapter= new RecycleViewAdapter(view.getContext(),arrlist);


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);

        return view;
    }
    public void addData(int image, String name){
        suitCaseAdapter suitCaseAdapter = new suitCaseAdapter(image,name);
        suitCaseAdapter.image=image;
        suitCaseAdapter.name=name;
        arrlist.add(suitCaseAdapter);

    }
}

