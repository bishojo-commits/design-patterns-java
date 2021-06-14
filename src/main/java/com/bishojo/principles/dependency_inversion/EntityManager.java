package com.bishojo.principles.dependency_inversion;

public class EntityManager implements Connection {

    @Override
    public boolean connect() {
        return true;
    }
}
