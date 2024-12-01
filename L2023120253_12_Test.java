import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类：SolutionTest
 * 用于测试 Solution 类中 multiply 方法的功能和边界情况。
 * 涉及等价类划分为有效输入和无效输入，重点验证方法的正确性、鲁棒性和异常处理。
 */
class L2023120253_12_Test {

    /**
     * 测试简单的有效等价类
     * 测试场景：输入两个小的非负整数字符串
     * 输入：num1 = "2", num2 = "3"
     * 预期输出："6"
     */
    @Test
    void testMultiplySimpleCase() {
        Solution solution = new Solution();
        String result = solution.multiply("2", "3");
        assertEquals("6", result, "测试 num1 = 2, num2 = 3 时的结果");
    }

    /**
     * 测试复杂的有效等价类
     * 测试场景：输入两个多位非负整数字符串
     * 输入：num1 = "123", num2 = "456"
     * 预期输出："56088"
     */
    @Test
    void testMultiplyComplexCase() {
        Solution solution = new Solution();
        String result = solution.multiply("123", "456");
        assertEquals("56088", result, "测试 num1 = 123, num2 = 456 时的结果");
    }

    /**
     * 测试特殊情况：乘数为零
     * 测试场景：其中一个输入为 0
     * 输入：num1 = "0", num2 = "1234"
     * 预期输出："0"
     * 说明：零乘以任何数都应返回 0
     */
    @Test
    void testMultiplyWithZero() {
        Solution solution = new Solution();
        String result = solution.multiply("0", "1234");
        assertEquals("0", result, "测试 num1 或 num2 为 0 的情况");
    }

    /**
     * 测试有效等价类：大数字字符串
     * 测试场景：输入两个非常大的非负整数字符串
     * 输入：num1 = "123456789", num2 = "987654321"
     * 预期输出："121932631112635269"
     * 说明：验证代码是否支持大数字的字符串运算并返回正确结果
     */
    @Test
    void testMultiplyWithLargeNumbers() {
        Solution solution = new Solution();
        String result = solution.multiply("123456789", "987654321");
        assertEquals("121932631112635269", result, "测试大数相乘的结果");
    }
}
