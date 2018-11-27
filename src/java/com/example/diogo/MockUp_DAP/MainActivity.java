//Aplicativo desenvolvido para minha sobrinha em âmbito de estudo de desenvolvimento de aplicativos móveis.

package com.example.diogo.app_elisa;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.constraint.Constraints;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageView imageAnimals;
    Constraints tela;
    TextView nomeAnimal;

    Random i;
    Integer a;
    private MediaPlayer mp;
    Integer[] nomes = {
            R.string.nameAnimals0,
            R.string.nameAnimals1,
            R.string.nameAnimals2,
            R.string.nameAnimals3,
            R.string.nameAnimals4,
            R.string.nameAnimals5,
            R.string.nameAnimals6,
            R.string.nameAnimals7,
            R.string.nameAnimals8,
            R.string.nameAnimals9,
            R.string.nameAnimals10,
            R.string.nameAnimals11,
            R.string.nameAnimals12,
            R.string.nameAnimals13,
            R.string.nameAnimals14,
            R.string.nameAnimals15,
            R.string.nameAnimals16,
            R.string.nameAnimals17,
            R.string.nameAnimals18,
            R.string.nameAnimals19,
            R.string.nameAnimals20,
            R.string.nameAnimals21,
            R.string.nameAnimals22,
            R.string.nameAnimals23
    };
    Integer[] images = {
            R.drawable.cow,
            R.drawable.dog,
            R.drawable.chimpanzee,
            R.drawable.cat,
            R.drawable.wolf,
            R.drawable.bear,
            R.drawable.bee,
            R.drawable.dolphin,
            R.drawable.dove,
            R.drawable.duck,
            R.drawable.eagle,
            R.drawable.elephant,
            R.drawable.fly,
            R.drawable.frog,
            R.drawable.horse,
            R.drawable.lion,
            R.drawable.orca,
            R.drawable.owl,
            R.drawable.parrot,
            R.drawable.penguin,
            R.drawable.pig,
            R.drawable.sheep,
            R.drawable.tiger
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageAnimals = findViewById(R.id.imageAnimals);
        tela = findViewById(R.id.tela);
        nomeAnimal = findViewById(R.id.nomeAnimal);
        //soundAnimals = findViewById(R.id.soundAnimals);
        i = new Random();
        mp = new MediaPlayer();
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
        tela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                    }
                    mp.reset();
                    if ( a == i.nextInt()){
                        a = i.nextInt(nomes.length)+1;
                    }else {
                        a = i.nextInt(nomes.length);
                    }
                    AssetFileDescriptor song = null;
                    switch (a) {
                        case 0:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.cow_song);
                            //soundAnimals.getResources().openRawResourceFd(R.raw.cow_song);
                            break;
                        case 1:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.dog);
                            break;
                        case 2:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.chimpanzee);
                            break;
                        case 3:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.cat);
                            break;
                        case 4:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.wolf);
                            break;
                        case 5:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.bear);
                            break;
                        case 6:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.bee);
                            break;
                        case 7:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.dolphin);
                            break;
                        case 8:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.dove);
                            break;
                        case 9:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.duck);
                            break;
                        case 10:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.eagle);
                            break;
                        case 11:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.elephant);
                            break;
                        case 12:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.fly);
                            break;
                        case 13:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.frog);
                            break;
                        case 14:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.horse);
                            break;
                        case 15:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.lion);
                            break;
                        case 16:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.orca);
                            break;
                        case 17:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.owl);
                            break;
                        case 18:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.parrot);
                            break;
                        case 19:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.penguin);
                            break;
                        case 20:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.pig);
                            break;
                        case 21:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.sheep);
                            break;
                        case 22:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.tiger);
                            break;
                        case 23:
                            imageAnimals.setImageResource(images[a]);
                            nomeAnimal.setText(nomes[a]);
                            song = getResources().openRawResourceFd(R.raw.rooster);
                            break;
                    }
                    if (song != null){
                        mp.setDataSource(song.getFileDescriptor(),song.getStartOffset(),song.getLength());
                        mp.prepareAsync();
                    }
                } catch (IOException e) {
                    Log.e("",e.getMessage());
                    e.printStackTrace();
                }
            }
        });

    }

}
