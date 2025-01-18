package SINARAHUATORRES.service;

import java.util.List;
import java.util.Optional;

import SINARAHUATORRES.model.modelProvedor;

public interface IProvedoresService {

    Optional<modelProvedor> findProveedorById(Integer id);

    public List<modelProvedor> findAll();

    Optional<modelProvedor> findById(int id);

    public modelProvedor add(modelProvedor provedor);

    public modelProvedor update(modelProvedor provedor);

    public Boolean delete(int id);

}
