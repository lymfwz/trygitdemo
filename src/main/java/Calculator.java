/**
 * @AUTHOR: qiukui
 * @CREATE: 2024-04-14-21:58
 */
public class Calculator {
    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        // 1. 使用工厂模式获取对应的计算类 ==> 不好在于每次新增一个计算类都需要修改工厂类
//        Computable computable = ComputeFactory.getComputable(symbol);
        // 2. 使用反射获取对应的计算类 ==> 不好在于反射效率低
        Computable computable = ComputeFactory.getComputableByReflect(symbol);
        return computable.compute(num1, num2);
    }
}
