import dto.UserDto;
import mapper.impel.UserMapperDecorator;
import mapper.interfaces.UserMapper;
import model.User;
import org.json.JSONObject;

public class Application {
    public static void main(String[] args) {
        UserDto userDto = new UserDto("farzad","afshar","farzadAfi");
        User user = UserMapper.INSTANCE.dtoToModel(userDto);
        System.out.println("userDto is " + userDto);
        System.out.println("user is(map)" + user);
        System.out.println("-----------------------------------");
        User userMapAndChangeLFName = UserMapper.INSTANCE.dtoToModelWithChangeLFName(userDto);
        System.out.println("userDto is" + userDto);
        System.out.println("user is(map)" + userMapAndChangeLFName);
        System.out.println("-----------------------------------");
        UserMapperDecorator userMapperDecorator = new UserMapperDecorator();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstName","farzad");
        jsonObject.put("lastName","afshar");
        jsonObject.put("userName","farzadAfi");
        User userJson = userMapperDecorator.jsonToModel(jsonObject);
        System.out.println("json is " + jsonObject);
        System.out.println("user is(map)" + userJson);
        System.out.println("----------------------------------");
        userDto = UserMapper.INSTANCE.userToUserDtoWithChangeLFName(user);
        System.out.println(userDto);
    }
}
