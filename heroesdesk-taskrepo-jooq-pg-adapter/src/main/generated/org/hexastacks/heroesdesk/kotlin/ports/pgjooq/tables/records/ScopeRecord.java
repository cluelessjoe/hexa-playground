/*
 * This file is generated by jOOQ.
 */
package org.hexastacks.heroesdesk.kotlin.ports.pgjooq.tables.records;


import org.hexastacks.heroesdesk.kotlin.ports.pgjooq.tables.Scope;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScopeRecord extends UpdatableRecordImpl<ScopeRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>heroesdeskschema.Scope.key</code>.
     */
    public void setKey(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>heroesdeskschema.Scope.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>heroesdeskschema.Scope.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>heroesdeskschema.Scope.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Scope.SCOPE.KEY;
    }

    @Override
    public Field<String> field2() {
        return Scope.SCOPE.NAME;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public ScopeRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public ScopeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ScopeRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScopeRecord
     */
    public ScopeRecord() {
        super(Scope.SCOPE);
    }

    /**
     * Create a detached, initialised ScopeRecord
     */
    public ScopeRecord(String key, String name) {
        super(Scope.SCOPE);

        setKey(key);
        setName(name);
        resetChangedOnNotNull();
    }
}
