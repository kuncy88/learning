package hu.kuncystem.designpattern.adapter;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class MP4Player implements AdvancedMediaPlayer {
    
    public void playMedia(String filename) {
        System.out.println("Playing mp4 file. Name: " + filename);
    }

}
