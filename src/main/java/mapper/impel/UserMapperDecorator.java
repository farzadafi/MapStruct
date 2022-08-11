package mapper.impel;

import dto.UserDto;
import mapper.interfaces.UserMapper;
import model.User;
import org.json.JSONObject;

public class UserMapperDecorator implements UserMapper {
    @Override
    public User dtoToModel(UserDto userDto) {
        return null;
    }

    @Override
    public User dtoToModelWithChangeLFName(UserDto userDto) {
        return null;
    }

    @Override
    public User jsonToModel(JSONObject jsonObject) {
        User user = new User();
        user.setFirstName(jsonObject.getString("firstName"));
        user.setLastName(jsonObject.getString("lastName"));
        user.setUserName(jsonObject.getString("userName"));
        return user;
    }
}
