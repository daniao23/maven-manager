package nenu.ists.mapper;

import nenu.ists.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
