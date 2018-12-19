package com.marklogzhu.designpatterns.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {


    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 生成代理对象
     *注意Proxy.newProxyInstance()方法接受三个参数：
     *      ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
     *      Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
     *      InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        return returnValue;
                    }
                }
        );
    }
}
