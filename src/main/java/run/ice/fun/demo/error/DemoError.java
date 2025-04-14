package run.ice.fun.demo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import run.ice.fun.demo.constant.ServiceCode;

/**
 * @author DaoDao
 */
@Getter
@AllArgsConstructor
public enum DemoError implements ErrorEnum {

    /**
     * ERROR
     */
    ERROR(code("001"), "DEMO ERROR"),

    ;

    /**
     * 错误编码
     */
    public final String code;

    /**
     * 错误信息
     */
    public final String message;

    private static String code(String code) {
        return ServiceCode.DEMO + code;
    }

}
