package chap02_function_interface.d_function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * java.util.function.Function<T,R>
 *
 * 1. 매개변수가 있고 반환값도 있는 메소드를 가진 인터페이스입니다.
 * 2. 추상메소드
 *    R apply(T t);
 * 3. 주요 인터페이스
 *   1) Function<T,R>          R apply(T t);
 *   2) BiFunction<T, U ,R>    R apply(T,U);
 *   3) IntFunction<R>         R apply(int);
 *   4) DoubleFunction<R>      R apply(double);
 *   5) ToIntFunction<T>       int apply(T);
 *   6) ToDoubleFunction<T>    double apply(T);
 **/
public class Main {
    public static void main(String[] args) {

        Function<String, Integer> f1 = str -> Integer.parseInt(str);
        System.out.println(f1.apply("123") + 10);

        BiFunction<Integer, Integer, Integer> f2 = (t, u) -> t + u;
        System.out.println(f2.apply(10, 20));

        System.out.println((int)applyFunction(10, x -> x * x)); // 100


        System.out.println((double)applyFunction(1.5, r -> r * Math.PI * Math.pow(r, 2))); // 부피 또는 원 관련 계산

        System.out.println((String) applyFunction("홍길동", name -> name + "님")); // "홍길동님"



}
    /**
     * 전달한 값(T t)을 함께 전달한 함수(Function<T, R> f)로 처리한 결과를 반환하는 메소드
     * @param t    처리할 값
     * @param f    처리할 함수
     * @return     값을 함수로 처리한 결과
     * @param <T>  Function으로 전달하는 인자
     * @param <R>  Function으로부터 받아오는 반환타입
     */
    public static <T, R> R applyFunction(T t, Function<T, R> f) {
        return f.apply(t);
    }
}


