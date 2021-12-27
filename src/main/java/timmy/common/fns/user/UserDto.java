package timmy.common.fns.user;

import lombok.Data;

@Data
public class UserDto {

    private String name;
    private String password;

    public UserDto(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
