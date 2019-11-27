import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {


        Scanner sc = new Scanner(System.in);

        Class reflections = Reflection.class;


        Method[] methods = reflections.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if (isItGetter(method)) {
                getters.add(method);
            } else if (isItSetters(method)) {
                setters.add(method);
            }
        }
        getters.sort(Comparator.comparing(Method::getName));
        setters.sort(Comparator.comparing(Method::getName));

        getters.forEach( e-> System.out.println(
                String.format
                        ("%s will return class %s"
                        ,e.getName(), e.getReturnType().getName())));

        setters.forEach( e-> System.out.println(
                String.format
                        ("%s and will set field of class %s"
                                ,e.getName(), e.getParameterTypes()[0].getName())));


    }

    private static boolean isItSetters(Method method) {
        if (!method.getName().startsWith("set")) { return false; }
        if (method.getParameterCount() != 1) { return false; }
        if (method.getReturnType() != void.class) { return false; }

        return true;
    }

    private static boolean isItGetter(Method method) {
        if (!method.getName().startsWith("get")) { return false; }
        if (method.getParameterCount() != 0) { return false; }
        if (method.getReturnType() == void.class) { return false; }

        return true;
    }
}
