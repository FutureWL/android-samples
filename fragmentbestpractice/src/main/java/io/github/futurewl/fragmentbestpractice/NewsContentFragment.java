package io.github.futurewl.fragmentbestpractice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 功能描述：
 *
 * @author weilai create by 2019/2/26:10:58 PM
 * @version 1.0
 */
public class NewsContentFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_frag, container, false);
        return view;
    }

    public void refresh(String newsTitle, String newsContent) {
        View visibilityLayout = view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleTextView = view.findViewById(R.id.new_title);
        TextView newsContentTextView = view.findViewById(R.id.new_content);
        newsTitleTextView.setText(newsTitle);
        newsContentTextView.setText(newsContent);
    }
}
