package hu.kuncystem.designpattern.adapter;

import hu.kuncystem.designpattern.PatternTest;

/**
 * We use this pattern if we have two incompatible interfaces and we want to use
 * these together. Example: We have an AudioPlayer class which can play mp3
 * files. We have other class which can play video files. We create an Adapter
 * class through which we can play video files. We insert this class in the
 * AudioPlayer class.
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 * 
 * @version 1.0
 */
public class Adapter implements PatternTest {

    public void test() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "test music.mp3");
        audioPlayer.play("mp4", "testvideo.mp4");
        audioPlayer.play("vlc", "file.vlc");
        audioPlayer.play("avi", "testmovie.avi");

    }

}
