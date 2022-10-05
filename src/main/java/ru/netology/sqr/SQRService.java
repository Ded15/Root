package ru.netology.sqr;

public class SQRService {

    public int TheBorders(int min, int max) {
        int beginning = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    beginning++;
                }
            }
        }
        return beginning;

    }
}
