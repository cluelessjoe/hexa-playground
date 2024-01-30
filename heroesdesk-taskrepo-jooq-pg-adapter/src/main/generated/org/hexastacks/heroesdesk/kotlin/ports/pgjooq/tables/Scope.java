/*
 * This file is generated by jOOQ.
 */
package org.hexastacks.heroesdesk.kotlin.ports.pgjooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.hexastacks.heroesdesk.kotlin.ports.pgjooq.Heroesdeskschema;
import org.hexastacks.heroesdesk.kotlin.ports.pgjooq.Keys;
import org.hexastacks.heroesdesk.kotlin.ports.pgjooq.tables.records.ScopeRecord;
import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Scope extends TableImpl<ScopeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>heroesdeskschema.Scope</code>
     */
    public static final Scope SCOPE = new Scope();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScopeRecord> getRecordType() {
        return ScopeRecord.class;
    }

    /**
     * The column <code>heroesdeskschema.Scope.key</code>.
     */
    public final TableField<ScopeRecord, String> KEY = createField(DSL.name("key"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>heroesdeskschema.Scope.name</code>.
     */
    public final TableField<ScopeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Scope(Name alias, Table<ScopeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scope(Name alias, Table<ScopeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>heroesdeskschema.Scope</code> table reference
     */
    public Scope(String alias) {
        this(DSL.name(alias), SCOPE);
    }

    /**
     * Create an aliased <code>heroesdeskschema.Scope</code> table reference
     */
    public Scope(Name alias) {
        this(alias, SCOPE);
    }

    /**
     * Create a <code>heroesdeskschema.Scope</code> table reference
     */
    public Scope() {
        this(DSL.name("Scope"), null);
    }

    public <O extends Record> Scope(Table<O> child, ForeignKey<O, ScopeRecord> key) {
        super(child, key, SCOPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Heroesdeskschema.HEROESDESKSCHEMA;
    }

    @Override
    public UniqueKey<ScopeRecord> getPrimaryKey() {
        return Keys.PK_SCOPE;
    }

    @Override
    public List<UniqueKey<ScopeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CHK_NAME_UNIQUE);
    }

    @Override
    public List<Check<ScopeRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("CHK_key_LENGTH"), "((char_length('key'::text) >= 1))", true),
            Internal.createCheck(this, DSL.name("CHK_name_MIN_LENGTH"), "((char_length('name'::text) >= 1))", true)
        );
    }

    @Override
    public Scope as(String alias) {
        return new Scope(DSL.name(alias), this);
    }

    @Override
    public Scope as(Name alias) {
        return new Scope(alias, this);
    }

    @Override
    public Scope as(Table<?> alias) {
        return new Scope(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scope rename(String name) {
        return new Scope(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scope rename(Name name) {
        return new Scope(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scope rename(Table<?> name) {
        return new Scope(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
