public class TestScoping {
    public static void main(String[] args) {
        ScopeExample scope = new ScopeExample();
        scope.firstMethod();
        scope.secondMethod(9);
    }
}