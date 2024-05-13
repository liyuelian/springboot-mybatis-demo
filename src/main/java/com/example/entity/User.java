package com.example.entity;

/**
 * @author <a href="mailto:liyuelian.ke@gmail.com">liyuelian</a>
 */
public class User
{
    private Long id;
    
    private String name;

    private Integer age;

    public User() {}

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }
}
