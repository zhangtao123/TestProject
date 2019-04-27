package src.leetcode;

public class algorithm08 {
    public int myAtoi(String str) {
        int len;
        int flag = -1;
        int num;
        str = str.trim();
        if (str == null || (len = str.length()) == 0) {
            return 0;
        } else if (len > 0) {
            char c = str.charAt(0);
            num = (int) c;
            if (!(num == 43 || num == 45 || (num > 47 && num < 58))) {
                return 0;
            }
            if (c == '-') {
                flag = 0;
            } else if (c == '+') {
                flag = 1;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < len; i++) {
                num = (int) str.charAt(i);
                if (i == 0) {
                    if (num == 43 || num == 45 || (num > 47 && num < 58)) {
                        sb.append(str.charAt(i));
                    } else {
                        break;
                    }
                } else {
                    if (num > 47 && num < 58) {
                        sb.append(str.charAt(i));
                    } else {
                        break;
                    }
                }
            }
            if (sb != null && sb.length() == 0) {
                return 0;
            } else {
                str = sb.toString();
                if (flag != -1) {
                    str = str.substring(1);
                    if (str.length() == 0) {
                        return 0;
                    }
                    try {
                        num = Integer.valueOf(str);
                    } catch (NumberFormatException e) {
                        if (flag == 0) {
                            return Integer.MIN_VALUE;
                        } else {
                            return Integer.MAX_VALUE;
                        }

                    }
                    if (flag == 0) {
                        return 0 - num;
                    } else {
                        return num;
                    }
                } else {
                    try {
                        return Integer.valueOf(str);
                    } catch (NumberFormatException e) {
                        return Integer.MAX_VALUE;
                    }
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(new algorithm08().myAtoi("-2147483648"));
    }
}
