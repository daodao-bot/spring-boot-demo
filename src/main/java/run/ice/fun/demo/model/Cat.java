package run.ice.fun.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import run.ice.lib.core.serialize.Serializer;

/**
 * @author DaoDao
 */
@Schema(name = "Cat", description = "猫")
@Data
public class Cat implements Serializer {

    @Schema(name = "name", description = "名字", example = "喵喵")
    @NotBlank
    @Size(min = 1, max = 64)
    private String name;

}
