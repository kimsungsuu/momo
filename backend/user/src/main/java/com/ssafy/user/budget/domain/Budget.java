package com.ssafy.user.budget.domain;

import com.ssafy.user.budget.dto.request.UpdateBudgetRequest;
import com.ssafy.user.common.BaseEntity;
import com.ssafy.user.groupInfo.domain.GroupInfo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "budget")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Budget extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budget_id")
    private int budgetId;

    @Column(name = "monthly_due_date")
    private int monthlyDueDate;

    @Column(length = 255, name = "name")
    private String name;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "final_money")
    private long finalMoney;

    @Column(name = "current_money")
    @ColumnDefault("0")
    private long currentMoney;

    @Column(name = "monthly_fee")
    private long monthlyFee;

    @ManyToOne
    @JoinColumn(name = "group_info_id")
    private GroupInfo groupInfo;

    public void updateCurrentMoney(long monthlyFee) {
        this.currentMoney += monthlyFee;
    }

    public void updateBudget(UpdateBudgetRequest request) {
        this.monthlyDueDate = request.monthlyDueDate();
        this.name = request.name();
        this.dueDate = request.finalDueDate();
        this.monthlyFee = (long) (request.finalFee() / leftCollectionDate(request.monthlyDueDate(),
            LocalDate.now(), request.finalDueDate()));
        ;
        this.finalMoney = request.finalFee();
    }

    public static int leftCollectionDate(int day, LocalDate today, LocalDate lastDay) {
        int cnt = 0;

        LocalDate tempDate = today.withDayOfMonth(day);

        if (tempDate.isBefore(today)) {
            tempDate = tempDate.plusMonths(1);
        }

        while (!tempDate.isAfter(lastDay)) {
            if (tempDate.getDayOfMonth() == day) {
                cnt++;
            }
            tempDate = tempDate.plusMonths(1);
        }

        return cnt;
    }
}
