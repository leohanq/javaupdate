package com.globant;

import com.globant.world.HelloWorld;
import com.globant.youtube.HelloYouTube;

public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();

        HelloYouTube helloYouTube = new HelloYouTube();
        helloYouTube.print();
    }
}
