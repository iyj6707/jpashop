package jpabook.jpashop.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;

import lombok.Getter;

@Embeddable
@Getter
@DiscriminatorValue("A")
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
