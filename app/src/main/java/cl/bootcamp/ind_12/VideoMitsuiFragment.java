package cl.bootcamp.ind_12;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cl.bootcamp.ind_12.databinding.FragmentVideoMitsuiBinding;

public class VideoMitsuiFragment extends Fragment {

    FragmentVideoMitsuiBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentVideoMitsuiBinding.inflate(inflater, container, false);

        WebView webView = binding.webview;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true; // Mantener dentro de la app
            }
        });

        webView.loadUrl("https://www.youtube.com/watch?v=rg1XnlQ-k0U");

        binding.fabBack.setOnClickListener(v -> Navigation.findNavController(v).navigateUp());
        binding.fabHome.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_videoMitsuiFragment_to_firstFragment));

        return binding.getRoot();
    }
}