package org.test.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.test.domain.User;

import java.util.List;
@Repository
public interface UserDao  {

    @Select("select * from users")
    public List<User> findAll();

    @Insert("insert into users(uid, uuid) values (#{uid}, #{uuid})")
    public void saveUser(User user);
}
