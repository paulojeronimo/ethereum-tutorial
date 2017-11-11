package com.paulojeronimo.web3j;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.NetVersion;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

public class VersionInfo {
    public static void main(String[] args) throws Exception {
        // Create Web3j client. The below will default to http://localhost:8545
        Web3j web3j = Web3j.build(new HttpService());
        NetVersion netVersion = web3j.netVersion().send();
        Web3ClientVersion clientVersion = web3j.web3ClientVersion().send();

        System.out.println("Client version: " + clientVersion.getWeb3ClientVersion());
        System.out.println("Network version: " + netVersion.getNetVersion());
    }
}
