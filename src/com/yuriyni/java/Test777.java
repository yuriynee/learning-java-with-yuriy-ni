package com.yuriyni.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test777 {
    public static void main(String[] args) {

        BigDecimal currentDayGroupMemberSale = new BigDecimal(23372000);
        BigDecimal currentDayGroupMemberIncome = currentDayGroupMemberSale.multiply(new BigDecimal(200000));

        currentDayGroupMemberIncome = currentDayGroupMemberIncome.multiply(new BigDecimal(14.2));
        currentDayGroupMemberIncome = currentDayGroupMemberIncome.divide(new BigDecimal(10000000), 0, RoundingMode.HALF_UP);
        currentDayGroupMemberIncome = currentDayGroupMemberIncome.multiply(new BigDecimal(0.95));
        System.out.println(currentDayGroupMemberIncome);


        BigDecimal db = new BigDecimal(6305765);
        BigDecimal db2 = new BigDecimal(124139566);
        System.out.println( db.add(db2));
    }
}
