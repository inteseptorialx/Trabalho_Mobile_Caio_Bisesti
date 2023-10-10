package com.example.trabalho_mobile_caio_bisesti;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    //===============================exercicios==========================================

    String[] items = {"Caminhada", "Corrida", "Bicicleta"};

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;
//===============================exercicios fim==========================================

//===============================unidade de velocidade==========================================


    String[] unidades = {"Km/h (kilometro po hora)", "M/s (Metros por segundos)"};

    AutoCompleteTextView autoCompleteTextUnidadeVelocidade;

    ArrayAdapter<String> adapterUnidadesVelocidade;


//===============================unidade de velocidade fim==========================================

//===============================orientaçãp do mapa==========================================


    String[] orientacaoMapa = {"Nenhuma", "North up (Alinhado a norte)", "Course up (Alinhado ao deslocamento)"};

    AutoCompleteTextView autoCompleteTextViewOrientacaoMapa;

    ArrayAdapter<String> adapterOrientacaoMapa;


//===============================orientaçãp do mapa fim==========================================

//===============================tipo do mapa==========================================


    String[] tipoMapa = {"Vetorial", "Satelite"};

    AutoCompleteTextView autoCompleteTextViewTipoMapa;

    ArrayAdapter<String> adapterTipoMapa;


//===============================tipo do mapa fim==========================================







    public SettingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();
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

        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        //===============================exercicios==========================================
        autoCompleteTxt = view.findViewById(R.id.auto_complete_txt);

        adapterItems = new ArrayAdapter<String>(view.getContext(),R.layout.list_item,items);

        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
//                Toast.makeText(getApplicationContext(),"Item: "+item,Toast.LENGTH_SHORT);
            }
        });
//===============================exercicios fim==========================================

//===============================unidade de velocidade==========================================


        autoCompleteTextUnidadeVelocidade = view.findViewById(R.id.auto_complete_txt_unidade);

        adapterUnidadesVelocidade = new ArrayAdapter<String>(view.getContext(),R.layout.list_unidadevelocidade,unidades);

        autoCompleteTextUnidadeVelocidade.setAdapter(adapterUnidadesVelocidade);

        autoCompleteTextUnidadeVelocidade.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String unidadesVelocidade = parent.getItemAtPosition(position).toString();
            }
        });


//===============================unidade de velocidade fim==========================================

//===============================orientaçãp do mapa==========================================


        autoCompleteTextViewOrientacaoMapa = view.findViewById(R.id.auto_complete_txt_orientacaoMapa);

        adapterOrientacaoMapa = new ArrayAdapter<String>(view.getContext(),R.layout.list_orientacaomapa,orientacaoMapa);

        autoCompleteTextViewOrientacaoMapa.setAdapter(adapterOrientacaoMapa);

        autoCompleteTextViewOrientacaoMapa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String orientacaoMapa = parent.getItemAtPosition(position).toString();
            }
        });


//===============================orientaçãp do mapa fim==========================================

//===============================tipo do mapa==========================================


        autoCompleteTextViewTipoMapa = view.findViewById(R.id.auto_complete_tipoMapa);

        adapterTipoMapa = new ArrayAdapter<String>(view.getContext(),R.layout.list_tipomapa,tipoMapa);

        autoCompleteTextViewTipoMapa.setAdapter(adapterTipoMapa);

        autoCompleteTextViewTipoMapa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tipoMapa = parent.getItemAtPosition(position).toString();
            }
        });


//===============================tipo do mapa fim==========================================




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);














    }
}