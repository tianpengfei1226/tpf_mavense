package com.tpf.tss.demo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * <p> </p>
 * @auther : tianpengfei
 * @version : $Id TradeRequest.java,v 1.0, 2018/4/25-16:43 tianpengfei Exp $
 */
public class TradeRequest {
    /**
     * 买家客户ID
     */
    @NotNull(message = "买家ID不能为空")
    @Size(min = 1, max = 12, message = "买家ID长度校验失败,要求1-12位")
    private String buyerId;

    /**
     * 终端类型
     */
    @NotNull(message = "终端不能为空")
    @Size(min = 1, max = 16, message = "终端长度校验失败,要求1-16位")
    private String accessChannel;

    /**
     * 商户提交时间
     */
    @NotNull(message = "提交时间不能为空")
    private Date gmtSubmit;

    /**
     * 扩展参数 json map
     */
    @Size(min = 0, max = 2000, message = "扩展参数长度校验失败，要求0-2000位")
    private String extension;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

