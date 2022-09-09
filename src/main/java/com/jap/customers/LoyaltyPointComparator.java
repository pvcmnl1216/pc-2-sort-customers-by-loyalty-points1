package com.jap.customers;


// Implement the Comparator interface
public class LoyaltyPointComparator {
    public int compare(Customer o1, Customer o2) {
        if(o1.getLoyaltyPoints() ==  o2.getLoyaltyPoints()){
            return 0;
        }
       if (o1.getLoyaltyPoints() > o2.getLoyaltyPoints()){
           return -1;
        }
       else{
           return 1;
        }
    }
}
