package mx.hackathonmorelos.Iximati.Informacion.model;

import java.sql.Date;

public class Informacion {
    private int idReporte;
    private String municipio;
    private String tipoAJ;
    private String objetoAJ;
    private String fundamentoAJ;
    private String responsableInstrumentacion;
    private String sectorAJ;
    private String titularAJ;
    private Date vigenciaIncio;
    private Date vigenciaFin;
    private String clausula;
    private String linkDocumento;
    private String linkConvenioModificatorio;
    private float montoRecursoTotal;
    private float montoRecursoEntregado;
    private String areaResponsableInformacion;
    private Date periodoInformeInicio;
    private Date periodoInformeFinal;
    private Date fechaValidacion;
    private Date fechaActualizacion;
    private String nota;

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoAJ() {
        return tipoAJ;
    }

    public void setTipoAJ(String tipoAJ) {
        this.tipoAJ = tipoAJ;
    }

    public String getObjetoAJ() {
        return objetoAJ;
    }

    public void setObjetoAJ(String objetoAJ) {
        this.objetoAJ = objetoAJ;
    }

    public String getFundamentoAJ() {
        return fundamentoAJ;
    }

    public void setFundamentoAJ(String fundamentoAJ) {
        this.fundamentoAJ = fundamentoAJ;
    }

    public String getResponsableInstrumentacion() {
        return responsableInstrumentacion;
    }

    public void setResponsableInstrumentacion(String responsableInstrumentacion) {
        this.responsableInstrumentacion = responsableInstrumentacion;
    }

    public String getSectorAJ() {
        return sectorAJ;
    }

    public void setSectorAJ(String sectorAJ) {
        this.sectorAJ = sectorAJ;
    }

    public String getTitularAJ() {
        return titularAJ;
    }

    public void setTitularAJ(String titularAJ) {
        this.titularAJ = titularAJ;
    }

    public Date getVigenciaIncio() {
        return vigenciaIncio;
    }

    public void setVigenciaIncio(Date vigenciaIncio) {
        this.vigenciaIncio = vigenciaIncio;
    }

    public Date getVigenciaFin() {
        return vigenciaFin;
    }

    public void setVigenciaFin(Date vigenciaFin) {
        this.vigenciaFin = vigenciaFin;
    }

    public String getClausula() {
        return clausula;
    }

    public void setClausula(String clausula) {
        this.clausula = clausula;
    }

    public String getLinkDocumento() {
        return linkDocumento;
    }

    public void setLinkDocumento(String linkDocumento) {
        this.linkDocumento = linkDocumento;
    }

    public String getLinkConvenioModificatorio() {
        return linkConvenioModificatorio;
    }

    public void setLinkConvenioModificatorio(String linkConvenioModificatorio) {
        this.linkConvenioModificatorio = linkConvenioModificatorio;
    }

    public float getMontoRecursoTotal() {
        return montoRecursoTotal;
    }

    public void setMontoRecursoTotal(float montoRecursoTotal) {
        this.montoRecursoTotal = montoRecursoTotal;
    }

    public float getMontoRecursoEntregado() {
        return montoRecursoEntregado;
    }

    public void setMontoRecursoEntregado(float montoRecursoEntregado) {
        this.montoRecursoEntregado = montoRecursoEntregado;
    }

    public String getAreaResponsableInformacion() {
        return areaResponsableInformacion;
    }

    public void setAreaResponsableInformacion(String areaResponsableInformacion) {
        this.areaResponsableInformacion = areaResponsableInformacion;
    }

    public Date getPeriodoInformeInicio() {
        return periodoInformeInicio;
    }

    public void setPeriodoInformeInicio(Date periodoInformeInicio) {
        this.periodoInformeInicio = periodoInformeInicio;
    }

    public Date getPeriodoInformeFinal() {
        return periodoInformeFinal;
    }

    public void setPeriodoInformeFinal(Date periodoInformeFinal) {
        this.periodoInformeFinal = periodoInformeFinal;
    }

    public Date getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Informacion{" +
                "idReporte=" + idReporte +
                ", municipio='" + municipio + '\'' +
                ", tipoAJ='" + tipoAJ + '\'' +
                ", objetoAJ='" + objetoAJ + '\'' +
                ", fundamentoAJ='" + fundamentoAJ + '\'' +
                ", responsableInstrumentacion='" + responsableInstrumentacion + '\'' +
                ", sectorAJ='" + sectorAJ + '\'' +
                ", titularAJ='" + titularAJ + '\'' +
                ", vigenciaIncio=" + vigenciaIncio +
                ", vigenciaFin=" + vigenciaFin +
                ", clausula='" + clausula + '\'' +
                ", linkDocumento='" + linkDocumento + '\'' +
                ", linkConvenioModificatorio='" + linkConvenioModificatorio + '\'' +
                ", montoRecursoTotal=" + montoRecursoTotal +
                ", montoRecursoEntregado=" + montoRecursoEntregado +
                ", areaResponsableInformacion='" + areaResponsableInformacion + '\'' +
                ", periodoInformeInicio=" + periodoInformeInicio +
                ", periodoInformeFinal=" + periodoInformeFinal +
                ", fechaValidacion=" + fechaValidacion +
                ", fechaActualizacion=" + fechaActualizacion +
                ", nota='" + nota + '\'' +
                '}';
    }
}
