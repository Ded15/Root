package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void FindingTheRootOfBoundaryValues() {
        SQRService service = new SQRService();

        int actual = service.TheBorders(500, 700);
        int expected = 4;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void FindingTheRootByOtherParameters() {
        SQRService service = new SQRService();

        int actual = service.TheBorders(1_000, 1_500);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
}
