package mapper.interfaces;

import dto.UserDto;
import model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User dtoToModel(UserDto userDto);
}
