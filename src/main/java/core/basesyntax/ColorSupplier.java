package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String randomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].name().toLowerCase(Locale.ROOT);
    }
}