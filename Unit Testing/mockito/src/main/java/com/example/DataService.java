package com.example;

public class DataService {
    private final ExternalAPI externalAPI;

    public DataService(ExternalAPI externalAPI) {
        this.externalAPI = externalAPI;
    }

    public String fetchData() {
        return externalAPI.getData();
    }
}
