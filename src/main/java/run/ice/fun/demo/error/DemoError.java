package run.ice.fun.demo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import run.ice.lib.core.error.ErrorEnum;

/**
 * @author DaoDao
 */
@Getter
@AllArgsConstructor
public enum DemoError implements ErrorEnum {

    /**
     * ERROR
     */
    ERROR("100001", "DEMO ERROR"),

    ;

    /**
     * 错误编码
     */
    public final String code;

    /**
     * 错误信息
     */
    public final String message;

}
