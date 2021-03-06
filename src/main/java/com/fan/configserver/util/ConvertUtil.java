package com.fan.configserver.util;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertUtil {


    /**
     * 复制集合
     *
     * @param <E>
     * @param source
     * @param destinationClass
     * @return
     * @throws InstantiationException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static <E> List<E> copyTo(List<?> source, Class<E> destinationClass) {
        if (source.size() == 0)
            return Collections.emptyList();
        List<E> res = new ArrayList<E>(source.size());
        try {
            for (Object o : source) {
                E e = destinationClass.newInstance();
                BeanUtils.copyProperties(e, o);
                res.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
