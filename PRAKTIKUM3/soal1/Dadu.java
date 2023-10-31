package soal1;

import java.util.Random;

public class Dadu {
    int nilai;

    public Dadu() {
        nilai = lemparDadu();
    }

    public int getNilai() {
        return nilai;
    }

    private int lemparDadu() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
