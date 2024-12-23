package body.movieSystem.mapper;

import body.movieSystem.dto.UserDTO;
import body.movieSystem.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-23T13:33:18+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( user.getId() );
        userDTO.name( user.getName() );
        userDTO.surName( user.getSurName() );
        userDTO.nick( user.getNick() );
        userDTO.email( user.getEmail() );
        userDTO.registrationTime( user.getRegistrationTime() );

        return userDTO.build();
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setName( userDTO.getName() );
        user.setSurName( userDTO.getSurName() );
        user.setNick( userDTO.getNick() );
        user.setEmail( userDTO.getEmail() );
        user.setRegistrationTime( userDTO.getRegistrationTime() );

        return user;
    }

    @Override
    public List<UserDTO> toDTOList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( users.size() );
        for ( User user : users ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> toEntityList(List<UserDTO> userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDTO.size() );
        for ( UserDTO userDTO1 : userDTO ) {
            list.add( toEntity( userDTO1 ) );
        }

        return list;
    }
}
