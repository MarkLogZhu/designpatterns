package com.marklogzhu.designpatterns.principle.single.v1;

import com.marklogzhu.designpatterns.principle.single.User;

public interface UserService {

    void changeUserPassword(User user);

    void changeUserEmail(User user);
}
