package com.do_uble.ui.home;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.do_uble.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView image = root.findViewById(R.id.logo);
        try {
            PackageManager pm = root.getContext().getPackageManager();
            ApplicationInfo appInfo = pm.getApplicationInfo(root.getContext().getPackageName(),0);
            image.setImageDrawable(appInfo.loadIcon(pm));
        } catch(Throwable t){
            image.setImageResource(R.mipmap.ic_launcher);
        }
        return root;
    }
}
