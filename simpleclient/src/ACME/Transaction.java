/**
 * Transaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ACME;

public class Transaction  implements java.io.Serializable {
    private long id;

    private java.lang.String fecha;

    private java.lang.String hora;

    private java.lang.String tipo;

    private java.lang.String codigoComercio;

    private java.lang.String nombreComercio;

    private java.lang.String mumeroTarjeta;

    private java.lang.String tipoTarjeta;

    private java.lang.String codigoMoneda;

    private java.lang.String tipoDispositivo;

    private java.math.BigDecimal monto;

    public Transaction() {
    }

    public Transaction(
           long id,
           java.lang.String fecha,
           java.lang.String hora,
           java.lang.String tipo,
           java.lang.String codigoComercio,
           java.lang.String nombreComercio,
           java.lang.String mumeroTarjeta,
           java.lang.String tipoTarjeta,
           java.lang.String codigoMoneda,
           java.lang.String tipoDispositivo,
           java.math.BigDecimal monto) {
           this.id = id;
           this.fecha = fecha;
           this.hora = hora;
           this.tipo = tipo;
           this.codigoComercio = codigoComercio;
           this.nombreComercio = nombreComercio;
           this.mumeroTarjeta = mumeroTarjeta;
           this.tipoTarjeta = tipoTarjeta;
           this.codigoMoneda = codigoMoneda;
           this.tipoDispositivo = tipoDispositivo;
           this.monto = monto;
    }


    /**
     * Gets the id value for this Transaction.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Transaction.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the fecha value for this Transaction.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Transaction.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the hora value for this Transaction.
     * 
     * @return hora
     */
    public java.lang.String getHora() {
        return hora;
    }


    /**
     * Sets the hora value for this Transaction.
     * 
     * @param hora
     */
    public void setHora(java.lang.String hora) {
        this.hora = hora;
    }


    /**
     * Gets the tipo value for this Transaction.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Transaction.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the codigoComercio value for this Transaction.
     * 
     * @return codigoComercio
     */
    public java.lang.String getCodigoComercio() {
        return codigoComercio;
    }


    /**
     * Sets the codigoComercio value for this Transaction.
     * 
     * @param codigoComercio
     */
    public void setCodigoComercio(java.lang.String codigoComercio) {
        this.codigoComercio = codigoComercio;
    }


    /**
     * Gets the nombreComercio value for this Transaction.
     * 
     * @return nombreComercio
     */
    public java.lang.String getNombreComercio() {
        return nombreComercio;
    }


    /**
     * Sets the nombreComercio value for this Transaction.
     * 
     * @param nombreComercio
     */
    public void setNombreComercio(java.lang.String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }


    /**
     * Gets the mumeroTarjeta value for this Transaction.
     * 
     * @return mumeroTarjeta
     */
    public java.lang.String getMumeroTarjeta() {
        return mumeroTarjeta;
    }


    /**
     * Sets the mumeroTarjeta value for this Transaction.
     * 
     * @param mumeroTarjeta
     */
    public void setMumeroTarjeta(java.lang.String mumeroTarjeta) {
        this.mumeroTarjeta = mumeroTarjeta;
    }


    /**
     * Gets the tipoTarjeta value for this Transaction.
     * 
     * @return tipoTarjeta
     */
    public java.lang.String getTipoTarjeta() {
        return tipoTarjeta;
    }


    /**
     * Sets the tipoTarjeta value for this Transaction.
     * 
     * @param tipoTarjeta
     */
    public void setTipoTarjeta(java.lang.String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }


    /**
     * Gets the codigoMoneda value for this Transaction.
     * 
     * @return codigoMoneda
     */
    public java.lang.String getCodigoMoneda() {
        return codigoMoneda;
    }


    /**
     * Sets the codigoMoneda value for this Transaction.
     * 
     * @param codigoMoneda
     */
    public void setCodigoMoneda(java.lang.String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }


    /**
     * Gets the tipoDispositivo value for this Transaction.
     * 
     * @return tipoDispositivo
     */
    public java.lang.String getTipoDispositivo() {
        return tipoDispositivo;
    }


    /**
     * Sets the tipoDispositivo value for this Transaction.
     * 
     * @param tipoDispositivo
     */
    public void setTipoDispositivo(java.lang.String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }


    /**
     * Gets the monto value for this Transaction.
     * 
     * @return monto
     */
    public java.math.BigDecimal getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this Transaction.
     * 
     * @param monto
     */
    public void setMonto(java.math.BigDecimal monto) {
        this.monto = monto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transaction)) return false;
        Transaction other = (Transaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.hora==null && other.getHora()==null) || 
             (this.hora!=null &&
              this.hora.equals(other.getHora()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.codigoComercio==null && other.getCodigoComercio()==null) || 
             (this.codigoComercio!=null &&
              this.codigoComercio.equals(other.getCodigoComercio()))) &&
            ((this.nombreComercio==null && other.getNombreComercio()==null) || 
             (this.nombreComercio!=null &&
              this.nombreComercio.equals(other.getNombreComercio()))) &&
            ((this.mumeroTarjeta==null && other.getMumeroTarjeta()==null) || 
             (this.mumeroTarjeta!=null &&
              this.mumeroTarjeta.equals(other.getMumeroTarjeta()))) &&
            ((this.tipoTarjeta==null && other.getTipoTarjeta()==null) || 
             (this.tipoTarjeta!=null &&
              this.tipoTarjeta.equals(other.getTipoTarjeta()))) &&
            ((this.codigoMoneda==null && other.getCodigoMoneda()==null) || 
             (this.codigoMoneda!=null &&
              this.codigoMoneda.equals(other.getCodigoMoneda()))) &&
            ((this.tipoDispositivo==null && other.getTipoDispositivo()==null) || 
             (this.tipoDispositivo!=null &&
              this.tipoDispositivo.equals(other.getTipoDispositivo()))) &&
            ((this.monto==null && other.getMonto()==null) || 
             (this.monto!=null &&
              this.monto.equals(other.getMonto())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getId()).hashCode();
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getHora() != null) {
            _hashCode += getHora().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getCodigoComercio() != null) {
            _hashCode += getCodigoComercio().hashCode();
        }
        if (getNombreComercio() != null) {
            _hashCode += getNombreComercio().hashCode();
        }
        if (getMumeroTarjeta() != null) {
            _hashCode += getMumeroTarjeta().hashCode();
        }
        if (getTipoTarjeta() != null) {
            _hashCode += getTipoTarjeta().hashCode();
        }
        if (getCodigoMoneda() != null) {
            _hashCode += getCodigoMoneda().hashCode();
        }
        if (getTipoDispositivo() != null) {
            _hashCode += getTipoDispositivo().hashCode();
        }
        if (getMonto() != null) {
            _hashCode += getMonto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("ACME", "transaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoComercio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoComercio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreComercio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreComercio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mumeroTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mumeroTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMoneda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoMoneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDispositivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDispositivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
