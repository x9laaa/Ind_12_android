package cl.bootcamp.ind_12;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cl.bootcamp.ind_12.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {

    FragmentSecondBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.image1.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_secondFragment_to_sakuragiFragment);
        });

        binding.image2.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_secondFragment_to_ryotaFragment);
        });

        binding.image3.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_secondFragment_to_mitsuiFragment);
        });

        binding.image4.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_secondFragment_to_rukawaFragment);
        });

        binding.image5.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_secondFragment_to_akagiFragment2);
        });

    }
}