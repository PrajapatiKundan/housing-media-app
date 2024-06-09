package com.kp.housingmedia.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
    @Id
    @SequenceGenerator(
            name = "address_seq",
            sequenceName = "address_seq"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "address_seq"
    )
    private Long addressId;
    private String state;
    private String city;

    @Column(nullable = false)
    private String pincode;

    @Column(nullable = false)
    private String line1;
    private String line2;
}

//-----------------------------------Builder pattern---------------------------------
/*
class Address {
    private Long id;
    private String state;
    private String city;
    private String pincode;
    private String line1;
    private String line2;

    public Address(Builder builder) {
        id = builder.id;
        state = builder.state;
        city = builder.city;
        pincode = builder.pincode;
        line1 = builder.line1;
        line2 = builder.line2;
    }

    public static class Builder {
        private Long id;
        private String state;
        private String city;
        private String pincode;
        private String line1;
        private String line2;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder pincode(String pincode) {
            this.pincode = pincode;
            return this;
        }

        public Builder line1(String line1) {
            this.line1 = line1;
            return this;
        }

        public Builder line2(String line2) {
            this.line2 = line2;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                '}';
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        // Example usage:
        Address address = new Address.Builder()
                .id(1234L)
                .state("MyState")
                .city("MyCity")
                .pincode("123456")
                .line1("Line 1")
                .line2("Line 2")
                .build();

        System.out.println(address);
    }
}
 */