package org.example;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


@ITabela(value = 79, names = {"Davyzão mil grau"},
        value2 = {RetentionPolicy.RUNTIME},
        value3 = {RetentionPolicy.RUNTIME})
public class AppRefletions {

    public static void main(String[] args) {
        Class<AppRefletions> clazz = AppRefletions.class;

        try {
            Constructor cons = clazz.getConstructor();
            ITabela tabela = clazz.getAnnotation(ITabela.class);
            System.out.println(tabela.getClass().getName());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
