package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2353Test {

    @Test
    void test() {
        S2353 s2353 = new S2353(new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                new int[]{9, 12, 8, 15, 14, 7});
        Assertions.assertEquals("kimchi", s2353.highestRated("korean"));
        Assertions.assertEquals("ramen", s2353.highestRated("japanese"));
        s2353.changeRating("sushi", 16);
        Assertions.assertEquals("sushi", s2353.highestRated("japanese"));
        s2353.changeRating("ramen", 16);
        Assertions.assertEquals("ramen", s2353.highestRated("japanese"));
    }

}