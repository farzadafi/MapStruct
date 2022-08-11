package mapper.interfaces;

import dto.UserDto;
import model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User dtoToModel(UserDto userDto);

    @Mapping(target="lastName", source="firstName")
    @Mapping(target="firstName", source="lastName")
    User dtoToModelWithChangeLFName(UserDto userDto);
}
