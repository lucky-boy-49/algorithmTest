package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2296Test {
    @Test
    void test() {
        S2296 s2296 = new S2296();
        s2296.addText("leetcode"); // 当前文本为 "leetcode|" 。
        Assertions.assertEquals(4, s2296.deleteText(4)); // 返回 4
        // 当前文本为 "leet|" 。
        // 删除了 4 个字符。
        s2296.addText("practice"); // 当前文本为 "leetpractice|" 。
        Assertions.assertEquals("etpractice", s2296.cursorRight(3)); // 返回 "etpractice"
        // 当前文本为 "leetpractice|".
        // 光标无法移动到文本以外，所以无法移动。
        // "etpractice" 是光标左边的 10 个字符。
        Assertions.assertEquals("leet", s2296.cursorLeft(8)); // 返回 "leet"
        // 当前文本为 "leet|practice" 。
        // "leet" 是光标左边的 min(10, 4) = 4 个字符。
        Assertions.assertEquals(4, s2296.deleteText(10)); // 返回 4
        // 当前文本为 "|practice" 。
        // 只有 4 个字符被删除了。
        Assertions.assertEquals("", s2296.cursorLeft(2)); // 返回 ""
        // 当前文本为 "|practice" 。
        // 光标无法移动到文本以外，所以无法移动。
        // "" 是光标左边的 min(10, 0) = 0 个字符。
        Assertions.assertEquals("practi", s2296.cursorRight(6)); // 返回 "practi"
        // 当前文本为 "practi|ce" 。
        // "practi" 是光标左边的 min(10, 6) = 6 个字符。
    }
}