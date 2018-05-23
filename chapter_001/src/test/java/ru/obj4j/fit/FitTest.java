package ru.obj4j.fit;

import org.junit.Test;
import ru.job4j.fit.Fit;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double result = fit.manWeight(180);
        assertThat(result, closeTo(92.0, 0.1));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double result = fit.womanWeight(170);
        assertThat(result, closeTo(69.0, 0.1));
    }
}
