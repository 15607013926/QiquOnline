package com.xuecheng.commons.utils;


import com.xuecheng.commons.model.vo.AuthInfo;


// ThreadLocal工具类
public class AuthInfoHolder {


    // 创建ThreadLocal
    private final static ThreadLocal<AuthInfo> threadLocal = new ThreadLocal<>();


    // 设置当前线程中的用户
    public static void setAuthInfo(AuthInfo info) {
        threadLocal.set(info);
    }


    // 获取线程中的用户
    public static AuthInfo getAuthInfo() {
        return threadLocal.get();
    }


    // 获取线程中的用户id
    public static Long getUserId() {
        return threadLocal.get().getUid();
    }

    // 获取线程中的企业id
    public static Long getCompanyId() {
        if(threadLocal.get() != null) {
            return threadLocal.get().getCompanyId();
        }else {
            return null;
        }

    }

    // 移除当前线程的用户
    public static void remove(){threadLocal.remove();}

}
