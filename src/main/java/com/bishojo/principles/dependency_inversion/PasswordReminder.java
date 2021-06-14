package com.bishojo.principles.dependency_inversion;

public class PasswordReminder {
    private Connection entityManager;

    public PasswordReminder(Connection entityManager) {
        this.entityManager = entityManager;
    }
}
