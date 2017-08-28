package org.NeilAlishev.blockchain.dto.enums;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public enum Status {

    IN("Работаю"), OUT("Уволился по собственному желанию"), FIRED("Был уволен");

    private String message;

    Status(String message) {
        this.message = message;
    }

    public static Status of(int ordinal) {
        return values()[ordinal];
    }

    public String getMessage() {
        return message;
    }
}
