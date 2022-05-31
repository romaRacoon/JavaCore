public class Test {
    public static void main(String[] args) {
        double a = 3.4;
        int b = (int) a;
        System.out.println(b);
    }
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            ComplexNumber complexNumber = (ComplexNumber) object;
            if (Double.compare(complexNumber.re, re) != 0) {
                return false;
            }
            return Double.compare(complexNumber.getRe(), getRe()) == 0 && Double.compare(complexNumber.getIm(), getIm()) == 0;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            temp = Double.doubleToLongBits(re);
            result = (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(im);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }
}
