package com.example.prospectomock.dto.prospectus;

import com.example.prospectomock.dto.generic.ProspectusCommonDTO;

public class BankDTO extends ProspectusCommonDTO {
    private static final long serialVersionUID = 1L;
    private BranchDTO branch;
    private BusinessAgentDTO businessAgent;


    public BusinessAgentDTO getBusinessAgent() {
        return businessAgent;
    }

    public void setBusinessAgent(BusinessAgentDTO businessAgent) {
        this.businessAgent = businessAgent;
    }

    public BranchDTO getBranch() {
        return branch;
    }

    public void setBranch(BranchDTO branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "BankDTO{" +
                "businessAgent=" + businessAgent +
                ", branch=" + branch +
                '}';
    }
}
