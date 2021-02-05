package nenu.ists.service.impl;

import nenu.ists.mapper.UsersMapper;
import nenu.ists.pojo.Users;
import nenu.ists.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    private UsersMapper usersMapper;

    @Autowired
    public UsersServiceImpl(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    public UsersServiceImpl() {}

    @Override
    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }
}
