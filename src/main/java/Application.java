import dto.UserDto;
import mapper.interfaces.UserMapper;
import model.User;

public class Application {
    public static void main(String[] args) {
        UserDto userDto = new UserDto("farzad","afshar","farzadAfi");
        User user = UserMapper.INSTANCE.dtoToModel(userDto);
        System.out.println("userDto is " + userDto);
        System.out.println("user is(map)" + user);
    }
}
