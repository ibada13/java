
// package New.Test;

class Test {
    static int i;

    public class A {
        public int addition(int i, int d) {
            return i + d;
        }

        private static int addition(int i, double d) {
            return (i + (int) d);
        }

        protected double addition(double i, int d) {
            return i + d;
        }

        static double addition(double i, double d) {
            return i + d;
        }

        public static void main(String[] args) throws Exception {
            int[] x;
            Cha c1 = new Cha();
            System.out.println(c1.equals(c1));

        }
    }
}