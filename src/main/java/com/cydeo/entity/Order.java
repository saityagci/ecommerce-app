package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
@Table(name = "tables")
public class Order extends BaseEntity{

   private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    @OneToOne
    private Cart cart;
    @OneToOne
    private Payment payment;
    @ManyToOne
    private Customer customer;

}
