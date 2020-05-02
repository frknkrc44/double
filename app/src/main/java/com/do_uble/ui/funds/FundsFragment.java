package com.do_uble.ui.funds;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.do_uble.R;

public class FundsFragment extends Fragment {

    private FundsViewModel fundsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fundsViewModel =
                ViewModelProviders.of(this).get(FundsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_funds, container, false);

        return root;
    }
}
