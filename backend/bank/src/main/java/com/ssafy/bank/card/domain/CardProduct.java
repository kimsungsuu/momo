package com.ssafy.bank.card.domain;

import com.ssafy.bank.account.domain.Bank;
import com.ssafy.bank.common.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "card_product")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardProduct extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_product_id")
    private int cardProductId;

    @Column(length = 255, name = "card_product_img")
    private String cardInfoImg;

    @Column(length = 255, name = "name", nullable = false)
    private String name;

    @Column(length = 500, name = "description", nullable = false)
    private String description;

    @Column(name = "card_product_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private CardType cardProductType;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

    @OneToMany(mappedBy = "cardProduct", cascade = CascadeType.REFRESH)
    private List<CardInfo> cardInfos;

    public enum CardType{
        체크, 신용
    }
}
