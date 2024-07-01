package com.cavapy.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationMCN {

    @Id
    private Integer id;

    private String mecanismo;

    private Date fechaOperacion;

    private Date fechaOperacionMecanismo;

    private String tipoDeCambio;

    private String depositanteVendedor;

    private String codigoValor;

    private BigDecimal valorNominalActual;

    private String moneda;

    private Integer cantidad;

    private String tasaDeRendimiento;

    private BigDecimal precioLimpio;

    private Date FechaLiquidacionContado;

    private String modalidad;

    private Integer nroOperacion;

    private String nroOperacionMecanismo;

    private String Instrumento;

    private String DepositanteComprador;

    private String monedaOperacion;

    private String estado;

    private BigDecimal montoLimpio;

    private String cambioDeMonedaContado;

    private Integer diasDeLiquidacionContado;

    private boolean ampliacion;

    private BigDecimal precioContado;

    private String indicavorDeValores;

    private String tipoDeLiquidacionContado;

    private String monedaLiquidacion;

    private Date fechaLiquidacion;

    private boolean anticipacion;

    private BigDecimal montoNegociado;

    private boolean indicadorDeFondos;

    private String liquidacionNeta;


    private String codigoAlterno;

    private String RUT;

    private String encargadoValores;

    private String rol;

    private Integer cantidadLiquidada;

    private Integer pendienteDeLiquidar;

    private String INDValores;

    private String INDFondos;

    private String margenGarantias;

    private String parteNegociacion;

}
