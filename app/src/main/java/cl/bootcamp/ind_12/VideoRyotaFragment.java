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

import cl.bootcamp.ind_12.databinding.FragmentVideoAkagiBinding;
import cl.bootcamp.ind_12.databinding.FragmentVideoRukawaBinding;

public class VideoRyotaFragment extends Fragment {

    FragmentVideoRukawaBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentVideoRukawaBinding.inflate(inflater, container, false);

        WebView webView = binding.webview;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true; // Mantener dentro de la app
            }
        });

        webView.loadUrl("https://www.youtube.com/watch?v=3FocobH9g88");

        binding.fabBack.setOnClickListener(v -> Navigation.findNavController(v).navigateUp());

        return binding.getRoot();
    }
}