package com.ssafy.bank.card.domain;

import com.ssafy.bank.account.domain.Account;
import com.ssafy.bank.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "card_info")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_info_id")
    private int cardInfoId;

    @Column(length = 255, name = "card_info_num", nullable = false)
    private String cardInfoNum;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "card_product_id", nullable = false)
    private CardProduct cardProduct;
}
