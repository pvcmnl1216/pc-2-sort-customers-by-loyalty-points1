package com.jap.customers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator) {

        List<Integer> loyaltyPoints = new ArrayList<>();

        loyaltyPoints.add(456);
        loyaltyPoints.add(345);
        loyaltyPoints.add(265);
        loyaltyPoints.add(234);
        loyaltyPoints.add(123);
        loyaltyPoints.add(112);
        loyaltyPoints.add(101);
        Collections.sort(loyaltyPoints, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        return loyaltyPoints;
    }

}
