
/**
 * @AUTHOR: qiukui
 * @CREATE: 2024-04-14-22:00
 */
public class ComputeFactory {

    private static final Computable add = new Add();
    private static final Computable sub = new Sub();
    private static final Computable mul = new Mul();
    private static final Computable div = new Div();

    public static Computable getComputable(String symbol){
        switch (symbol){ // 使用工厂调用对应的类，然后使用对象方法
            case "Add":
                return add;
            case "Sub":
                return sub;
            case "Mul":
                return mul;
            case "Div":
                return div;
            default:
                throw new IllegalArgumentException("Invalid symbol: " + symbol);
        }
    }

    public static Computable getComputableByReflect(String symbol) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
