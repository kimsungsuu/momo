package com.ssafy.bank.account.domain.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.bank.account.domain.AccountProduct.AccountType;
import com.ssafy.bank.account.domain.QAccountProduct;
import com.ssafy.bank.account.domain.QBank;
import com.ssafy.bank.account.dto.response.BankResponse;
import com.ssafy.bank.account.dto.response.GetAccountProductListResponse;
import com.ssafy.bank.account.dto.response.GetAccountProductResponse;
import com.ssafy.bank.account.dto.response.QBankResponse;
import com.ssafy.bank.account.dto.response.QGetAccountProductResponse;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public List<GetAccountProductListResponse> findProductListByType() {

        QAccountProduct accountProduct = QAccountProduct.accountProduct;

        List<GetAccountProductListResponse> response = new ArrayList<>();

        for (AccountType type : AccountType.values()) {
            List<GetAccountProductResponse> products = queryFactory
                .select(new QGetAccountProductResponse(
                    accountProduct.accountProductId,
                    accountProduct.name,
                    accountProduct.bank.bankName,
                    accountProduct.description,
                    accountProduct.interestRate))
                .from(accountProduct)
                .where(accountProduct.accountType.eq(type))
                .fetch();
            response.add(new GetAccountProductListResponse(products, type));
        }

        return response;
    }

    public List<BankResponse> getBank() {
        QBank bank = QBank.bank;
        return queryFactory
            .select(new QBankResponse(
                bank.bankId,
                bank.bankName
            ))
            .from(bank)
            .fetch();
    }
}
