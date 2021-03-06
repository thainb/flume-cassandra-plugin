/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class ColumnDef implements TBase<ColumnDef._Fields>, java.io.Serializable, Cloneable, Comparable<ColumnDef> {
  private static final TStruct STRUCT_DESC = new TStruct("ColumnDef");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField VALIDATION_CLASS_FIELD_DESC = new TField("validation_class", TType.STRING, (short)2);
  private static final TField INDEX_TYPE_FIELD_DESC = new TField("index_type", TType.I32, (short)3);
  private static final TField INDEX_NAME_FIELD_DESC = new TField("index_name", TType.STRING, (short)4);

  public byte[] name;
  public String validation_class;
  /**
   * 
   * @see IndexType
   */
  public IndexType index_type;
  public String index_name;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    VALIDATION_CLASS((short)2, "validation_class"),
    /**
     * 
     * @see IndexType
     */
    INDEX_TYPE((short)3, "index_type"),
    INDEX_NAME((short)4, "index_name");

    private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byId.put((int)field._thriftId, field);
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      return byId.get(fieldId);
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class) {{
    put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.VALIDATION_CLASS, new FieldMetaData("validation_class", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    put(_Fields.INDEX_TYPE, new FieldMetaData("index_type", TFieldRequirementType.OPTIONAL, 
        new EnumMetaData(TType.ENUM, IndexType.class)));
    put(_Fields.INDEX_NAME, new FieldMetaData("index_name", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(ColumnDef.class, metaDataMap);
  }

  public ColumnDef() {
  }

  public ColumnDef(
    byte[] name,
    String validation_class)
  {
    this();
    this.name = name;
    this.validation_class = validation_class;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnDef(ColumnDef other) {
    if (other.isSetName()) {
      this.name = new byte[other.name.length];
      System.arraycopy(other.name, 0, name, 0, other.name.length);
    }
    if (other.isSetValidation_class()) {
      this.validation_class = other.validation_class;
    }
    if (other.isSetIndex_type()) {
      this.index_type = other.index_type;
    }
    if (other.isSetIndex_name()) {
      this.index_name = other.index_name;
    }
  }

  public ColumnDef deepCopy() {
    return new ColumnDef(this);
  }

  @Deprecated
  public ColumnDef clone() {
    return new ColumnDef(this);
  }

  public byte[] getName() {
    return this.name;
  }

  public ColumnDef setName(byte[] name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getValidation_class() {
    return this.validation_class;
  }

  public ColumnDef setValidation_class(String validation_class) {
    this.validation_class = validation_class;
    return this;
  }

  public void unsetValidation_class() {
    this.validation_class = null;
  }

  /** Returns true if field validation_class is set (has been asigned a value) and false otherwise */
  public boolean isSetValidation_class() {
    return this.validation_class != null;
  }

  public void setValidation_classIsSet(boolean value) {
    if (!value) {
      this.validation_class = null;
    }
  }

  /**
   * 
   * @see IndexType
   */
  public IndexType getIndex_type() {
    return this.index_type;
  }

  /**
   * 
   * @see IndexType
   */
  public ColumnDef setIndex_type(IndexType index_type) {
    this.index_type = index_type;
    return this;
  }

  public void unsetIndex_type() {
    this.index_type = null;
  }

  /** Returns true if field index_type is set (has been asigned a value) and false otherwise */
  public boolean isSetIndex_type() {
    return this.index_type != null;
  }

  public void setIndex_typeIsSet(boolean value) {
    if (!value) {
      this.index_type = null;
    }
  }

  public String getIndex_name() {
    return this.index_name;
  }

  public ColumnDef setIndex_name(String index_name) {
    this.index_name = index_name;
    return this;
  }

  public void unsetIndex_name() {
    this.index_name = null;
  }

  /** Returns true if field index_name is set (has been asigned a value) and false otherwise */
  public boolean isSetIndex_name() {
    return this.index_name != null;
  }

  public void setIndex_nameIsSet(boolean value) {
    if (!value) {
      this.index_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((byte[])value);
      }
      break;

    case VALIDATION_CLASS:
      if (value == null) {
        unsetValidation_class();
      } else {
        setValidation_class((String)value);
      }
      break;

    case INDEX_TYPE:
      if (value == null) {
        unsetIndex_type();
      } else {
        setIndex_type((IndexType)value);
      }
      break;

    case INDEX_NAME:
      if (value == null) {
        unsetIndex_name();
      } else {
        setIndex_name((String)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case VALIDATION_CLASS:
      return getValidation_class();

    case INDEX_TYPE:
      return getIndex_type();

    case INDEX_NAME:
      return getIndex_name();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case NAME:
      return isSetName();
    case VALIDATION_CLASS:
      return isSetValidation_class();
    case INDEX_TYPE:
      return isSetIndex_type();
    case INDEX_NAME:
      return isSetIndex_name();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnDef)
      return this.equals((ColumnDef)that);
    return false;
  }

  public boolean equals(ColumnDef that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!java.util.Arrays.equals(this.name, that.name))
        return false;
    }

    boolean this_present_validation_class = true && this.isSetValidation_class();
    boolean that_present_validation_class = true && that.isSetValidation_class();
    if (this_present_validation_class || that_present_validation_class) {
      if (!(this_present_validation_class && that_present_validation_class))
        return false;
      if (!this.validation_class.equals(that.validation_class))
        return false;
    }

    boolean this_present_index_type = true && this.isSetIndex_type();
    boolean that_present_index_type = true && that.isSetIndex_type();
    if (this_present_index_type || that_present_index_type) {
      if (!(this_present_index_type && that_present_index_type))
        return false;
      if (!this.index_type.equals(that.index_type))
        return false;
    }

    boolean this_present_index_name = true && this.isSetIndex_name();
    boolean that_present_index_name = true && that.isSetIndex_name();
    if (this_present_index_name || that_present_index_name) {
      if (!(this_present_index_name && that_present_index_name))
        return false;
      if (!this.index_name.equals(that.index_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ColumnDef other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ColumnDef typedOther = (ColumnDef)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(name, typedOther.name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetValidation_class()).compareTo(isSetValidation_class());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(validation_class, typedOther.validation_class);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIndex_type()).compareTo(isSetIndex_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(index_type, typedOther.index_type);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIndex_name()).compareTo(isSetIndex_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(index_name, typedOther.index_name);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      _Fields fieldId = _Fields.findByThriftId(field.id);
      if (fieldId == null) {
        TProtocolUtil.skip(iprot, field.type);
      } else {
        switch (fieldId) {
          case NAME:
            if (field.type == TType.STRING) {
              this.name = iprot.readBinary();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case VALIDATION_CLASS:
            if (field.type == TType.STRING) {
              this.validation_class = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case INDEX_TYPE:
            if (field.type == TType.I32) {
              this.index_type = IndexType.findByValue(iprot.readI32());
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
          case INDEX_NAME:
            if (field.type == TType.STRING) {
              this.index_name = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
            break;
        }
        iprot.readFieldEnd();
      }
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeBinary(this.name);
      oprot.writeFieldEnd();
    }
    if (this.validation_class != null) {
      oprot.writeFieldBegin(VALIDATION_CLASS_FIELD_DESC);
      oprot.writeString(this.validation_class);
      oprot.writeFieldEnd();
    }
    if (this.index_type != null) {
      if (isSetIndex_type()) {
        oprot.writeFieldBegin(INDEX_TYPE_FIELD_DESC);
        oprot.writeI32(this.index_type.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (this.index_name != null) {
      if (isSetIndex_name()) {
        oprot.writeFieldBegin(INDEX_NAME_FIELD_DESC);
        oprot.writeString(this.index_name);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ColumnDef(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
        int __name_size = Math.min(this.name.length, 128);
        for (int i = 0; i < __name_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.name[i]).length() > 1 ? Integer.toHexString(this.name[i]).substring(Integer.toHexString(this.name[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.name[i]).toUpperCase());
        }
        if (this.name.length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("validation_class:");
    if (this.validation_class == null) {
      sb.append("null");
    } else {
      sb.append(this.validation_class);
    }
    first = false;
    if (isSetIndex_type()) {
      if (!first) sb.append(", ");
      sb.append("index_type:");
      if (this.index_type == null) {
        sb.append("null");
      } else {
        String index_type_name = index_type.name();
        if (index_type_name != null) {
          sb.append(index_type_name);
          sb.append(" (");
        }
        sb.append(this.index_type);
        if (index_type_name != null) {
          sb.append(")");
        }
      }
      first = false;
    }
    if (isSetIndex_name()) {
      if (!first) sb.append(", ");
      sb.append("index_name:");
      if (this.index_name == null) {
        sb.append("null");
      } else {
        sb.append(this.index_name);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (name == null) {
      throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (validation_class == null) {
      throw new TProtocolException("Required field 'validation_class' was not present! Struct: " + toString());
    }
  }

}

