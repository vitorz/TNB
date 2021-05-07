package org.jboss.fuse.tnb.azure.account;

import org.jboss.fuse.tnb.common.account.Account;

public class StorageBlobAccount implements Account {
    private String access_key;
    private String account_name;

    public String credentialsId() {
        return "azure-tnb";
    }

    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String accessKey() {
        return access_key;
    }

    public String accountName() {
        return account_name;
    }
}
