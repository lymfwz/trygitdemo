/**
 * @AUTHOR: qiukui
 * @CREATE: 2024-04-14-22:05
 */
public class Div implements Computable{
    @Override
    public int compute(int a, int b) {
        return b != 0 ? a / b : 0;
    }
}
