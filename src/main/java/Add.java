/**
 * @AUTHOR: qiukui
 * @CREATE: 2024-04-14-21:46
 */
public class Add implements Computable { // extract interface ==> alt + i
    @Override
    public int compute(int a, int b) { // pull members up ==> alt + u
        return a + b;
    }
}
