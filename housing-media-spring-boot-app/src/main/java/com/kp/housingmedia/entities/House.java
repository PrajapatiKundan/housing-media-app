package com.kp.housingmedia.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class House {

    @Id
    @SequenceGenerator(
            name = "house_seq",
            sequenceName = "house_seq"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "house_seq"
    )
    private Long houseId;
    private Integer areaInSqFt;

    @Column(nullable = false)
    private String category;
    private Double rentPrice;
    private Double sellPrice;
    private String additionalDetails;

    @Column(nullable = false)
    private Long addressId;

    @Column(nullable = false)
    private Long userId;
}
