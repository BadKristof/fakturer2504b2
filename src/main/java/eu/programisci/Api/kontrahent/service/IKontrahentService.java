package eu.programisci.Api.kontrahent.service;

import eu.programisci.Api.kontrahent.dto.KontrahentDTO;
import eu.programisci.Api.kontrahent.dto.KontrahentForTableDTO;

import java.util.List;

public interface IKontrahentService {

    KontrahentDTO findOne(Long id);

    List<KontrahentForTableDTO> findAllForTable();

    void deleteOne(Long id);

    KontrahentDTO save(KontrahentDTO userDTO);
}
