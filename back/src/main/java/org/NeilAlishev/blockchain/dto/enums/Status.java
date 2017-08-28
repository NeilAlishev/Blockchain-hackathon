package org.NeilAlishev.blockchain.dto.enums;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
public enum Status {

    IN, OUT, FIRED;

    public static Status of(int ordinal) {
        return values()[ordinal];
    }

}
