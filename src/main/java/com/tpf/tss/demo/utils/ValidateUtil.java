package com.tpf.tss.demo.utils;

import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import javax.validation.ValidatorFactory;

/**
 * <p> </p>
 * @auther : ${USER}
 * @version : $Id ${NAME}.java,v 1.0, ${DATE}-${TIME} ${USER} Exp $
 */
public class ValidateUtil {
    private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    /**
     * 校验对象所有字段
     * @param t
     * @param <T>
     * @return 错误信息列表
     */
    public static <T> List<String> validateAll(T t) {
        List<String> errorList = new ArrayList<String>();
        Set<ConstraintViolation<T>> violations = factory.getValidator().validate(t);
        if (!CollectionUtils.isEmpty(violations)) {
            for (ConstraintViolation<T> violation : violations) {
                errorList.add(violation.getMessage());
            }
        }

        return null;
    }
}