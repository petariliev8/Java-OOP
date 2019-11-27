import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
    public static void main(String[] args) throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {


        Scanner sc = new Scanner(System.in);

        Class reflections = Reflection.class;


        Arrays.stream(reflections.getAnnotations())
                .forEach(a-> System.out.println(a.annotationType()));
        System.out.println();
        Annotation annotation = reflections.getAnnotation(Subject.class);
        System.out.println(annotation.annotationType());
        System.out.println(annotation.toString());

//        Arrays.stream(reflections.getDeclaredFields())
//                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
//                .forEach(f -> System.out.println(f+" must be private!"));
//



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
//        System.out.println();
//        getters.forEach(f ->{
//            if(!Modifier.isPublic(f.getModifiers())){
//                System.out.println(f+" have to be public!");
//            }
//        });
//        System.out.println();
//        setters.forEach(f-> {
//            if(!Modifier.isPrivate(f.getModifiers())){
//                System.out.println(f+" have to be private!");
//            }
//        });


//        getters.forEach( e-> System.out.println(
//                String.format
//                        ("%s will return class %s"
//                        ,e.getName(), e.getReturnType().getName())));
//
//        setters.forEach( e-> System.out.println(
//                String.format
//                        ("%s and will set field of class %s"
//                                ,e.getName(), e.getParameterTypes()[0].getName())));
//
//        System.out.println();



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
