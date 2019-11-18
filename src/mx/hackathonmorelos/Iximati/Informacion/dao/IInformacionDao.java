package mx.hackathonmorelos.Iximati.Informacion.dao;

import mx.hackathonmorelos.Iximati.Informacion.model.Informacion;

import java.util.List;

public interface IInformacionDao {
    List<Informacion> obtenerReportes();
}
