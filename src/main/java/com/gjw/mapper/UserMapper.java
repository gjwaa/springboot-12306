package com.gjw.mapper;

import com.gjw.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//表示这是mybatis的mapper类
@Mapper
@Repository
public interface UserMapper {

    List<User> queryAllUser();

}
