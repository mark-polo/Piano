package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    private final Player player = new Player();

    @FXML private Button cBtn;

    @FXML private Button dBtn;

    @FXML private Button eBtn;

    @FXML private Button fBtn;

    @FXML private Button gBtn;

    @FXML private Button aBtn;

    @FXML private Button bBtn;

    @FXML private Button cBtnS;

    @FXML private Button dBtnS;

    @FXML private Button eBtnS;

    @FXML void initialize() throws InterruptedException {

        // realization the song "Jasper Forks — River Flows In You"

        cBtn.setOnAction(event -> {
            player.play(1,470,90,81); //60
        });

        dBtn.setOnAction(event -> {
            player.play(1,230,90,80); //62
        });

        eBtn.setOnAction(event -> {
            player.play(1,470,90,81); //64
        });

        fBtn.setOnAction(event -> {
            player.play(1,230,120, 80); //65
        });

        gBtn.setOnAction(event -> {
            player.play(1,470,90,81); //67
        });

        aBtn.setOnAction(event -> {
            player.play(1,230,90,69); //69
        });

        bBtn.setOnAction(event -> {
            player.play(1,230,90,76); //71
        });

        cBtnS.setOnAction(event -> {
            player.play(1,470,90,81); //72
        });

        dBtnS.setOnAction(event -> {
            player.play(1,230,90, 69); //74
        });

        eBtnS.setOnAction(event -> {
            player.play(1,470,90,73); //76
        });

        soundEx();
    }

    private void soundEx() {

        // realization the song "Jasper Forks — River Flows In You"

        int[][] notes = {{470, 81}, {230, 80}, {470, 81}, {250, -1}, {230, 80}, {470, 81}, {230, 69}, {230, 76}, {470, 81}, {230, 69}, {470, 74}, {470, 73}, {470, 74}, {470, 76}, {470, 73}, {470, 71}, {970, -1}, {230, 69}, {230, 68}, {470, 69}, {730, -1}, {230, 64}, {230, 69}, {230, 71}, {470, 73}, {970, -1}, {230, 73}, {230, 74}, {470, 76}, {730, -1}, {230, 69}, {230, 74}, {230, 73}, {470, 71}, {1450, -1}, {470, 81}, {230, 80}, {470, 81}, {250, -1}, {230, 80}, {470, 81}, {230, 69}, {230, 76}, {470, 81}, {230, 69}, {470, 74}, {470, 73}, {470, 74}, {470, 76}, {470, 73}, {470, 71}, {970, -1}, {230, 69}, {230, 68}, {470, 69}, {730, -1}, {230, 64}, {230, 69}, {230, 71}, {470, 73}, {970, -1}, {230, 73}, {230, 74}, {470, 76}, {730, -1}, {230, 69}, {230, 74}, {230, 73}, {470, 71}, {250, -1}};
        Player player = new Player();
        for (int[] note : notes) {
            if (note[1] != -1) {
                player.play(0, note[0], 80, note[1]);
            } else {
                try {
                    Thread.sleep(note[0]);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        player.close();
    }


}