package com.bambademe.server.model;

import com.bambademe.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id//primary key
    @GeneratedValue(strategy = AUTO) // the way that the key is generated
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "IP address cannot be empty or null")
    private String ipAddress;

    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
