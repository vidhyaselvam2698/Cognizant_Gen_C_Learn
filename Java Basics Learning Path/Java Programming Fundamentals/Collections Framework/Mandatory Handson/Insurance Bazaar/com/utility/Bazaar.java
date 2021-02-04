package com.utility;

import java.util.*;

public class Bazaar {
    private Map<Integer, String> policyMap;

    public Map<Integer, String> getPolicyMap() {
        return policyMap;
    }

    public void setPolicyMap(Map<Integer, String> policyMap) {
        this.policyMap = policyMap;
    }

    public void addPolicyDetails(int policyId, String policyName) {
        policyMap.put(policyId, policyName);
    }

    public List<Integer> searchBasedOnPolicyType(String policyType) {
        return policyMap.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue().equals(policyType))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
    }
}
