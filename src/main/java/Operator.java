public enum Operator {

    ADD {
        @Override
        public int operation(int a, int b) {
            return a + b;
        }
    }, DIV {
        @Override
        public int operation(int a, int b) {
            return a / b;
        }
    }, MINUS {
        @Override
        public int operation(int a, int b) {
            return a - b;
        }
    }, MULTI {
        @Override
        public int operation(int a, int b) {
            return a * b;
        }
    };

    public abstract int operation(int a, int b);
}
