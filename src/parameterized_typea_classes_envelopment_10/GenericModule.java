package parameterized_typea_classes_envelopment_10;

public class GenericModule {


    public static class Box<T>{
        private T value;
        private String sourse;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }


        public static <T> void doSomething(T t){
            if (t instanceof Double){
                double i = (Double) t;
                System.out.println(i * 900.000_000);
            } else if (t instanceof String){
                String i = (String) t;
                System.out.println(i + "$Biataru$");
            }else {
                System.out.println("GG");
            }
        }
    }

    public static class Box1<T extends Number>{
        private T value;
        private T max;
        private T min;
    }

    public static class Box3<T extends Comparable>{
        private T max;

        public Box3(T max) {
            max = max;
        }

        public T getMax() {
            return max;
        }
        public void put(T x) {
            if (x.compareTo(max) > 0) {
                max = x;
            }
        }
    }
    public interface Box2<T,N>{
        T convert(N x);
    }
    
}
