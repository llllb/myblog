package com.studyinghome.myblog.helper;

import com.studyinghome.myblog.entity.User;
import com.studyinghome.myblog.common.util.DozerUtil;
import com.studyinghome.myblog.model.dto.UserDTO;

/**
 *
 * @author panxiang
 * @create 2018-04-18 10:25
 */
public final class UserConvertUtil {
    
    public static User userDTO2User(UserDTO userDTO, User user) {
        if(user == null) {
            user = new User();
        }
        DozerUtil.map(userDTO, user);
        return user;
    }

}
