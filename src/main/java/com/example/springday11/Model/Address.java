package com.example.springday11.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    private Integer id;
    private Integer building_number;
    private String street;
    private String area;

    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;
}
