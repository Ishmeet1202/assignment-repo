package com.springboot.rest_services_part_two.Model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.springboot.rest_services_part_two.views.Views;
import io.swagger.v3.oas.annotations.media.Schema;

@JacksonXmlRootElement(localName = "user")
@Schema(description = "User entity representing application user")
public class User {

    @Schema(description = "User ID", example = "1")
    @JsonView(Views.View1.class)
    private Integer id;

    @JsonView(Views.View1.class)
    @Schema(description = "User name", example = "Rahul")
    private String name;

    @JsonView(Views.View1.class)
    @Schema(description = "User email", example = "Rahul@gmail.com")
    private String email;

    @JsonIgnore
    @Schema(description = "User password", example = "rahul@password1234")
    private String password;


    public User() {}

    public User(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

