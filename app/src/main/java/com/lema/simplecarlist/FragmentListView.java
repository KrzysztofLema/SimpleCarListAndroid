package com.lema.simplecarlist;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListView extends Fragment {
    private ListView mListView;
    private String[] names;
    private int[]photots;


    public FragmentListView() {
        // Required empty public constructor
    }

    CarDescListener mCarDescListener;


    public interface CarDescListener {
        public void elementClick(int id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_list_view, container,false);
        ListView listView = (ListView)view.findViewById(R.id.list_view);
        names = new String[CarDescription.CAR_DESCRIPTIONS.length];
        for (int i = 0;i<names.length;i++){
            names[i] = CarDescription.CAR_DESCRIPTIONS[i].getName();
        }
        photots = new int[CarDescription.carImages.length];
        for (int i = 0;i<photots.length;i++){
            photots[i]=CarDescription.carImages[i];
        }
            CarAdapter carAdapter = new CarAdapter(inflater.getContext(),names,photots);
        listView.setAdapter(carAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mCarDescListener.elementClick(position);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCarDescListener = (CarDescListener)activity;
        } catch (Exception e) {
            throw new ClassCastException(activity.toString()+" Musi implementować CarDescListener");
        }

    }
}
