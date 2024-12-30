package org.example.zhongdeng;

import org.example.ListNode;
import org.example.ListNodeConverter;
import org.example.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S1367Test {

    @ParameterizedTest
    @CsvFileSource(resources = "/S1367Test.csv", delimiterString = "|")
    void isSubPath(@ConvertWith(ListNodeConverter.class) ListNode head,
                   @ConvertWith(TreeNodeConverter.class) TreeNode root) {
        S1367 s1367 = new S1367();
        Assertions.assertFalse(s1367.isSubPath(head, root));
    }
}