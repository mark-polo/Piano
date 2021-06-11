package sample;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Player {
    private MidiChannel[] channels = null;
    private Synthesizer synthesizer = null;


    public Player() {
        try {

            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            channels = synthesizer.getChannels();
            channels[0].programChange(5);

        }catch (MidiUnavailableException e) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void close() {
        synthesizer.close();
    }

    public void play(int channel , int duration, int volume, int... notes) {
        for (int note : notes) {
            channels[channel].noteOn(note, volume);
        }
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int note : notes) {
            channels[channel].noteOff(note);
        }
    }
}