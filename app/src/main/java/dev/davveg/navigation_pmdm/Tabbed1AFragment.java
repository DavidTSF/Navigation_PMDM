package dev.davveg.navigation_pmdm;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tabbed1AFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tabbed1AFragment extends Fragment {


    public static Tabbed1AFragment newInstance() {
        Tabbed1AFragment fragment = new Tabbed1AFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabbed1_a, container, false);
    }
}