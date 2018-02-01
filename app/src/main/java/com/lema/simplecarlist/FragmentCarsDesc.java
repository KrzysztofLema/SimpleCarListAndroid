package com.lema.simplecarlist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCarsDesc extends Fragment {

    private int descryptionId;


    public FragmentCarsDesc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_cars_desc, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view !=null){
            TextView textView = (TextView)view.findViewById(R.id.textView);
            CarDescription carDescription = CarDescription.CAR_DESCRIPTIONS[descryptionId];
            textView.setText(carDescription.getName());
            TextView textViewDesc = (TextView)view.findViewById(R.id.textView2);
            textViewDesc.setText(carDescription.getDescription());

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            imageView.setImageResource(CarDescription.carImages[descryptionId]);
        }
    }

    public void setDescryptionId(int descryptionId) {
        this.descryptionId = descryptionId;
    }
}
