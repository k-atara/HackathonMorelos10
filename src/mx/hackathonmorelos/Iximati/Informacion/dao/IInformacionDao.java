package mx.hackathonmorelos.Iximati.Informacion.dao;

import mx.hackathonmorelos.Iximati.Informacion.model.Informacion;

import java.util.List;

public interface IInformacionDao {
    List<Informacion> obtenerReportesAutorizacion();
    List<Informacion> obtenerReportesConvenio();
    List<Informacion> obtenerReportesLicencia();
    List<Informacion> obtenerReportesContrato();
    List<Informacion> obtenerReportesPermiso();
    List<Informacion> obtenerReportesConcesion();
    List<Informacion> obtenerReportesAsignaciones();
    List<Informacion> obtenerReportesMunicipio(int idMunicipio);
    List<Informacion> obtenerReportesEstado(int idEstado);
}
