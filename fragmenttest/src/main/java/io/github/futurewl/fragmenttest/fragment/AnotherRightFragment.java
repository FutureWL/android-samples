package io.github.futurewl.fragmenttest.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.futurewl.fragmenttest.R;

/**
 * 功能描述：
 *
 * @author weilai create by 2019/2/26:10:26 PM
 * @version 1.0
 */
public class AnotherRightFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.another_right_fragment, container, false);
    }
}
