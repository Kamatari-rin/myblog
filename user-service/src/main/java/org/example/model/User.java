package org.example.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.example.enums.AccountStatus;
import org.example.enums.Role;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private Long id;

    @NotNull(message = "Username cannot be null")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be at least 8 characters long")

    private String password;

    private Role role = Role.USER;

    private Set<Post> likedPosts = new HashSet<>();
    private Set<Post> dislikedPosts = new HashSet<>();
    private Set<Tag> tags = new HashSet<>();
    private Set<Post> posts = new HashSet<>();
    private Set<Comment> comments = new HashSet<>();

    private Long createdAt;
    private Long updatedAt;

    private AccountStatus status = AccountStatus.ACTIVE;
}