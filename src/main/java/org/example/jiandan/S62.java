package org.example.jiandan;

public class S62 {

    public String addBinary(String a, String b) {
        int l1 = a.length() - 1, l2 = b.length() - 1, s = 0;
        StringBuilder res = new StringBuilder();
        while (l1 >= 0 && l2 >= 0) {
            int i = a.charAt(l1) - '0';
            int i2 = b.charAt(l2) - '0';
            int sum = i + i2 + s;
            s = 0;
            if (sum == 0 || sum == 1) {
                res.append(sum);
            } else if (sum == 2) {
                res.append(0);
                s = 1;
            } else if (sum == 3) {
                res.append(1);
                s = 1;
            }
            l1--;
            l2--;
        }
        if (l1 >= 0) {
            getRes(a, l1, s, res);
        } else if (l2 >= 0) {
            getRes(b, l2, s, res);
        } else if (s != 0) {
            res.append(s);
        }
        return res.reverse().toString();
    }

    private void getRes(String b, int l, int s, StringBuilder res) {
        while (l >= 0) {
            int i = b.charAt(l--) - '0';
            int sum = i + s;
            s = 0;
            if (sum == 0 || sum == 1) {
                res.append(sum);
            } else if (sum == 2) {
                res.append(0);
                s = 1;
            }
        }
        if (s != 0) {
            res.append(s);
        }
    }

}
