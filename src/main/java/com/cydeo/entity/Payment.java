package com.cydeo.entity;

import com.cydeo.enums.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Payment extends BaseEntity{
    private BigDecimal price;
    @Enumerated(value = EnumType.STRING)
    private PaymentMethod paymentMethod;
}
