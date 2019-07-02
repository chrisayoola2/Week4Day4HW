package com.example.week4day4hw;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CelebListBottomFragment extends Fragment {
    RecyclerView rvRecyclerView;
    private List<Celebrity> celebList = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {  // instantiate recycler view
        super.onViewCreated(view, savedInstanceState);
       rvRecyclerView =  view.findViewById(R.id.rvRecyclerView);
       populateList();
       RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(celebList,mListener);
       rvRecyclerView.setAdapter(recyclerViewAdapter);
       RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
       rvRecyclerView.setLayoutManager(layoutManager);
    }

    public CelebListBottomFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CelebListBottomFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CelebListBottomFragment newInstance(String param1, String param2) {
        CelebListBottomFragment fragment = new CelebListBottomFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_celeb_list_bottom, container, false);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener { //NOTES
        void sendPath(int path , String description);
    }
        public void populateList(){
        celebList.add(new Celebrity("Oprah Winfrey","Former Talk show Host ",R.drawable.oprah));
        celebList.add(new Celebrity("Tom Cruise","Thomas Cruise is an American actor and producer. He has received several accolades for his work" ,R.drawable.tomcruise));
        celebList.add(new Celebrity("Mila Kunis","Actress Mila Kunis was born in Chernivtsi, Ukraine, in 1983. At the age of seven, she immigrated with her family to Los Angeles, where she began taking acting lessons. ", R.drawable.milakunis));
        celebList.add(new Celebrity("Taylor Swift","Taylor Alison Swift is a multi-Grammy award-winning American singer/songwriter who, in 2010 at the age of 20, became the youngest artist in history to win the Grammy Award for Album of the Year. ",R.drawable.taylorswift));
        celebList.add(new Celebrity("Jennifer Lopez","Former Talk show Actress ",R.drawable.jlo));
        celebList.add(new Celebrity("Lebron James","Basketball Player 4X NBA CHAMPION ",R.drawable.lebron));

}
}
