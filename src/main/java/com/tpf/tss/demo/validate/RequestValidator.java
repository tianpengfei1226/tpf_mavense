package com.tpf.tss.demo.validate;

import com.tpf.tss.demo.utils.ValidateUtil;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * <p> </p>
 *
 * @version : $Id RequestValidator.java,v 1.0, 2018/4/25-17:34 tianpengfei Exp $
 * @auther : tianpengfei
 */
public abstract class RequestValidator<T> {



    public void validateAll(T t){
        try {
            this.validParam(t);
            this.validate(t);// 让子类实现
        } catch (Exception e) {

        }
    }

    /**
     * 校验所有传入参数
     * @param t
     */
    private void validParam(T t) {
        List<String> errorList = ValidateUtil.validateAll(t);
        Assert.isTrue(CollectionUtils.isEmpty(errorList), errorList.toString());
    }

    protected abstract void validate(T param);
}