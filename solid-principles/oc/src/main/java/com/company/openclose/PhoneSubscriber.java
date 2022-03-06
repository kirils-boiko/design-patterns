package com.company.openclose;

import java.util.List;

// derived class
public class PhoneSubscriber extends Subscriber {



    // open for modification
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}