package com.example.internews;


import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment implements View.OnClickListener {

    LinearLayout cardVideo1;
    LinearLayout cardVideo2;
    LinearLayout cardVideo3;
    LinearLayout cardVideo4;
    LinearLayout cardVideo5;
    LinearLayout cardVideo6;



    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_video, container, false);

        cardVideo1 = (LinearLayout) view.findViewById(R.id.cardVideo1);
        cardVideo1.setOnClickListener(this);
        cardVideo2 = (LinearLayout) view.findViewById(R.id.cardVideo2);
        cardVideo2.setOnClickListener(this);
        cardVideo3 = (LinearLayout) view.findViewById(R.id.cardVideo3);
        cardVideo3.setOnClickListener(this);
        cardVideo4 = (LinearLayout) view.findViewById(R.id.cardVideo4);
        cardVideo4.setOnClickListener(this);
        cardVideo5 = (LinearLayout) view.findViewById(R.id.cardVideo5);
        cardVideo5.setOnClickListener(this);
        cardVideo6 = (LinearLayout) view.findViewById(R.id.cardVideo6);
        cardVideo6.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.cardVideo1:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 0);
                intent.putExtra("tag", "#Алматы #Жезказган #Сирия");
                intent.putExtra("title", "Религиозная ситуация в Казахстане | Не от нашего имени");
                intent.putExtra("content", "Из Казахстана на войну в Сирию уехало около 600 человек. Молодые люди из #Алматы и Жезказганского района, в котором эта проблема стоит остро, собрались поделиться опытом и обсудить религиозную ситуацию в регионах и мегаполисе.");
                startActivity(intent);

                break;
            case R.id.cardVideo2:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 1);
                intent.putExtra("tag", "#Кыргызстан #Сирия #терроризм");
                intent.putExtra("title", "Как сказать ребенку, что мама в Сирии? | Не от нашего имени");
                intent.putExtra("content", "Больше 600 граждан Кыргызстана уехало воевать в Сирию, оставив за собой семейные трагедии. Молодые люди из южного села Араван где эта проблема стоит остро, поделились своим опытом со сверстниками из Бишкека. \n" +
                        "Участники проекта обсуждают угрозу насильственного экстремизма, личную и общую ответственность.");
                startActivity(intent);

                break;
            case R.id.cardVideo3:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 2);
                intent.putExtra("tag", "#война #Азия #Сирия");
                intent.putExtra("title", "Война в Сирии и насильственный экстремизм | НЕ ОТ НАШЕГО ИМЕНИ");
                intent.putExtra("content", "Что заставляет молодых людей бросать своих родных и вступать в террористические организации? \n" +
                        "Какие последствия для семей и общества несёт #война в Сирии? \n" +
                        "Какие меры принимаются в разных странах этого региона для противодействия насильственному экстремизму? ");
                startActivity(intent);

                break;
            case R.id.cardVideo4:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 3);
                intent.putExtra("tag", "#Алматы #Казакстан #Сирия");
                intent.putExtra("title", "«Не от нашего имени»: четвертый выпуск (Казахстан)");
                intent.putExtra("content", "Я не жалею тех, кто уехал [воевать в Сирию]. Я жалею их детей, которых они забрали с собой (Гульден, Казахстан).");
                startActivity(intent);

                break;
            case R.id.cardVideo5:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 4);
                intent.putExtra("tag", "#Таджикистан #Сирия");
                intent.putExtra("title", "Трагедии граждан Таджикистана | Не от нашего имени");
                intent.putExtra("content", "Из Таджикистана в Сирию на джихад уехали 1300 человек, большинство из них — из Хатлонского региона. Молодежь Хатлона проделала долгий путь в Бишкек, чтобы обсудить причины насильственного экстремизма.");
                startActivity(intent);

                break;
            case R.id.cardVideo6:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 5);
                intent.putExtra("tag", "#Араван #Ош #Кыргызстан #Сирия");
                intent.putExtra("title", "«Не от нашего имени»: юг Кыргызстана");
                intent.putExtra("content", "Почему сотни кыргызстанцев уехали воевать в Сирию и Ирак? Как бороться с этим? Молодежь Центральной Азии обсуждает проблемы экстремизма. Выпуск первый.");
                startActivity(intent);
                break;
        }
    }
}
