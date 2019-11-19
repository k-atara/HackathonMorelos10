package mx.hackathonmorelos.Iximati.Informacion.dao;

import mx.hackathonmorelos.Iximati.Informacion.model.Informacion;
import mx.hackathonmorelos.Iximati.Utility.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InformacionDao implements IInformacionDao{

    @Override
    public List<Informacion> obtenerReportesAutorizacion() {
        String sql="SELECT r.idReporteGeneral, m.nombre AS municipio, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link AS link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN municipio m ON r.idMunicipio = m.idMunicipio\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "WHERE idTipoAJ = 1;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setMunicipio(resultSet.getString("municipio"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesConvenio() {
        String sql="SELECT r.idReporteGeneral, m.nombre AS municipio, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link AS link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN municipio m ON r.idMunicipio = m.idMunicipio\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "WHERE idTipoAJ = 2;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setMunicipio(resultSet.getString("municipio"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesLicencia() {
        String sql="SELECT r.idReporteGeneral, m.nombre AS municipio, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link AS link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN municipio m ON r.idMunicipio = m.idMunicipio\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "WHERE idTipoAJ = 3;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setMunicipio(resultSet.getString("municipio"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesContrato() {
        String sql="SELECT r.idReporteGeneral, m.nombre AS municipio, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link AS link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN municipio m ON r.idMunicipio = m.idMunicipio\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "WHERE idTipoAJ = 4;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setMunicipio(resultSet.getString("municipio"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesPermiso() {
        String sql="SELECT r.idReporteGeneral, m.nombre AS municipio, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link AS link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN municipio m ON r.idMunicipio = m.idMunicipio\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "WHERE idTipoAJ = 5;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setMunicipio(resultSet.getString("municipio"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesConcesion() {
        String sql="SELECT r.idReporteGeneral, m.nombre AS municipio, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link AS link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN municipio m ON r.idMunicipio = m.idMunicipio\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "WHERE idTipoAJ = 6;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setMunicipio(resultSet.getString("municipio"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesAsignaciones() {
        String sql="SELECT r.idReporteGeneral, m.nombre AS municipio, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link AS link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN municipio m ON r.idMunicipio = m.idMunicipio\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "WHERE idTipoAJ = 7;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setMunicipio(resultSet.getString("municipio"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesMunicipio(int idMunicipio) {
        String sql="SELECT r.idReporteGeneral, t.nombre AS tipoAJ, o.nombre AS objetoAJ, f.nombre AS fundamentoAJ, e.nombre AS responsableInstrumentacion,\n" +
                "       s.nombre AS sector, l.link, r.periodoInformeInicio, r.periodoInformeFinal, r.fechaValidacion, r.fechaActualizacion, r.nota\n" +
                "    FROM reportegeneral r\n" +
                "    JOIN tipoaj t ON t.idTipoAJ = r.idTipoAJ\n" +
                "    JOIN objetoaj o on r.idObjetoAJ = o.idObjetoAJ\n" +
                "    JOIN fundamentoaj f ON r.idFundamentoAJ = f.idFundamentoAJ\n" +
                "    JOIN responsableinstrumentacion e ON r.idResponsableInstrumentacion = e.idResponsableInstrumentacion\n" +
                "    JOIN sectoraj s ON r.idSectorAJ = s.idSectorAJ\n" +
                "    JOIN linkdocumento l ON r.idLinkDocumento = l.idLinkDocumento\n" +
                "    JOIN municipio m on r.idMunicipio = m.idMunicipio\n" +
                "WHERE m.idMunicipio = ?;";
        List<Informacion> reportes = new ArrayList<>();
        try{
            Connection conexion = new Conexion().obtenerConexion();
            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, idMunicipio);
            ResultSet resultSet = preparedStatement.executeQuery();
            Informacion reporte = null;

            while(resultSet.next()) {
                reporte = new Informacion();

                reporte.setIdReporte(resultSet.getInt("idReporteGeneral"));
                reporte.setTipoAJ(resultSet.getString("tipoAJ"));
                reporte.setObjetoAJ(resultSet.getString("objetoAJ"));
                reporte.setFundamentoAJ(resultSet.getString("fundamentoAJ"));
                reporte.setResponsableInstrumentacion(resultSet.getString("responsableInstrumentacion"));
                reporte.setSectorAJ(resultSet.getString("sector"));
                reporte.setLinkDocumento(resultSet.getString("link"));
                reporte.setPeriodoInformeInicio(resultSet.getDate("periodoInformeInicio"));
                reporte.setPeriodoInformeFinal(resultSet.getDate("periodoInformeFinal"));
                reporte.setFechaValidacion(resultSet.getDate("fechaValidacion"));
                reporte.setFechaActualizacion(resultSet.getDate("fechaActualizacion"));
                reporte.setNota(resultSet.getString("nota"));
                System.out.println(reporte);
                reportes.add(reporte);
            }
        }catch (SQLException ex){
            System.out.println(this.getClass().getCanonicalName() + "->" + ex.getMessage());
        }

        return reportes;
    }

    @Override
    public List<Informacion> obtenerReportesEstado(int idEstado) {
        return null;
    }

}
