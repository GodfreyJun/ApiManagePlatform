package org.huawei.singleLogin;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private String username;

    public UserService(){

    }

    public UserService(String username){
        this.username=username;
    }
    public Set<String> findRoles(String username) {
        Set<String> roles=new HashSet<String>();

        String roleName1="tourist";
        String roleName2="administrator";
        if (username.equals("godfrey")){
            roles.add(roleName2);
        }
        return roles;
    }

    public Set<String> findPermissions(String username){
        Set<String> permissions=new HashSet<String>();
        return  permissions;
    }

    @Override
    public String toString() {
        return "UserService{"+"username = "+username;
    }
}
