package com.hillel.diakonov.homework.homework12.homework2;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = new MusicStyles[]{
                new ClassicMusic(), new PopMusic(), new RockMusic()
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
