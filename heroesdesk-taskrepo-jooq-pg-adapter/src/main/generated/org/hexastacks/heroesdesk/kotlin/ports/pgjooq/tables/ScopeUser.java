/*
 * This file is generated by jOOQ.
 */
package org.hexastacks.heroesdesk.kotlin.ports.pgjooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.hexastacks.heroesdesk.kotlin.ports.pgjooq.Heroesdeskschema;
import org.hexastacks.heroesdesk.kotlin.ports.pgjooq.Keys;
import org.hexastacks.heroesdesk.kotlin.ports.pgjooq.tables.records.ScopeUserRecord;
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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScopeUser extends TableImpl<ScopeUserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>heroesdeskschema.Scope_User</code>
     */
    public static final ScopeUser SCOPE_USER = new ScopeUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScopeUserRecord> getRecordType() {
        return ScopeUserRecord.class;
    }

    /**
     * The column <code>heroesdeskschema.Scope_User.scope_key</code>.
     */
    public final TableField<ScopeUserRecord, String> SCOPE_KEY = createField(DSL.name("scope_key"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>heroesdeskschema.Scope_User.id</code>.
     */
    public final TableField<ScopeUserRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    private ScopeUser(Name alias, Table<ScopeUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScopeUser(Name alias, Table<ScopeUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>heroesdeskschema.Scope_User</code> table
     * reference
     */
    public ScopeUser(String alias) {
        this(DSL.name(alias), SCOPE_USER);
    }

    /**
     * Create an aliased <code>heroesdeskschema.Scope_User</code> table
     * reference
     */
    public ScopeUser(Name alias) {
        this(alias, SCOPE_USER);
    }

    /**
     * Create a <code>heroesdeskschema.Scope_User</code> table reference
     */
    public ScopeUser() {
        this(DSL.name("Scope_User"), null);
    }

    public <O extends Record> ScopeUser(Table<O> child, ForeignKey<O, ScopeUserRecord> key) {
        super(child, key, SCOPE_USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Heroesdeskschema.HEROESDESKSCHEMA;
    }

    @Override
    public UniqueKey<ScopeUserRecord> getPrimaryKey() {
        return Keys.PK_SCOPE_USER;
    }

    @Override
    public List<ForeignKey<ScopeUserRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SCOPE_USER__FK_SCOPE, Keys.SCOPE_USER__FK_USER);
    }

    private transient Scope _scope;
    private transient User _user;

    /**
     * Get the implicit join path to the <code>heroesdeskschema.Scope</code>
     * table.
     */
    public Scope scope() {
        if (_scope == null)
            _scope = new Scope(this, Keys.SCOPE_USER__FK_SCOPE);

        return _scope;
    }

    /**
     * Get the implicit join path to the <code>heroesdeskschema.User</code>
     * table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.SCOPE_USER__FK_USER);

        return _user;
    }

    @Override
    public ScopeUser as(String alias) {
        return new ScopeUser(DSL.name(alias), this);
    }

    @Override
    public ScopeUser as(Name alias) {
        return new ScopeUser(alias, this);
    }

    @Override
    public ScopeUser as(Table<?> alias) {
        return new ScopeUser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScopeUser rename(String name) {
        return new ScopeUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScopeUser rename(Name name) {
        return new ScopeUser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScopeUser rename(Table<?> name) {
        return new ScopeUser(name.getQualifiedName(), null);
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
