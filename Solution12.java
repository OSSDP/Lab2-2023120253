import java.util.*;
/*
 * @Description:
 * ## 字符串相乘
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
 * 
 *  示例 1:
 *  输入: num1 = "2", num2 = "3"
 * 输出: "6"
 *
 * 示例 2:
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 *
 */

class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n]; // 用于存储每一位乘积的结果
        
        // 逐位计算乘积
        for (int i = m - 1; i >= 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int y = num2.charAt(j) - '0';
                int product = x * y + result[i + j + 1];
                
                result[i + j + 1] = product % 10; // 当前位
                result[i + j] += product / 10;   // 进位
            }
        }
        
        // 转换结果为字符串
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            // 跳过开头的 0
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
