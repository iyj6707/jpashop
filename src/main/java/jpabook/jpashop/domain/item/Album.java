package jpabook.jpashop.domain.item;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Album {

    private String artist;
    private String etc;
}
