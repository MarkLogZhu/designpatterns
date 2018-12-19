package com.marklogzhu.designpatterns.structure.proxy.dynamic;

public class UserDaoProxy implements IUserDao {

    private IUserDao iUserDao;

    public UserDaoProxy(IUserDao iUserDao){
        this.iUserDao = iUserDao;
    }
    @Override
    public void save() {
        System.out.println("调用方法前处理");
        iUserDao.save();
        System.out.println("调用方法后处理");
    }
}
