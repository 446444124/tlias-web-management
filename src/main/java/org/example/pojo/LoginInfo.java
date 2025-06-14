package org.example.pojo;

public class LoginInfo {
    private Integer id;
    private String username;
    private String name;
    private String token;


    public LoginInfo() {
    }

    public LoginInfo(Integer id, String username, String name, String token) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.token = token;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    public String toString() {
        return "LoginInfo{id = " + id + ", username = " + username + ", name = " + name + ", token = " + token + "}";
    }
}
