package cl.bootcamp.ind_12;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cl.bootcamp.ind_12.databinding.FragmentRukawaBinding;

public class RukawaFragment extends Fragment {

    FragmentRukawaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRukawaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnVideo.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_rukawaFragment_to_videoRukawaFragment));
        binding.fabBack.setOnClickListener(v -> Navigation.findNavController(v).navigateUp());
        binding.fabHome.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_rukawaFragment_to_firstFragment));

    }
}