package com.herprogramacion.scrum.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.herprogramacion.scrum.R;

/**
 * Created by Maria Guadalupe Hernandez Tovar on 27/03/2016.
 */

public class FragmentDesarrollador extends Fragment {

    private Button btnCorreo;


    public FragmentDesarrollador() {
        // Requiere de un contructor vacio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.developer_layout, container, false);
        return view;
    }

}
