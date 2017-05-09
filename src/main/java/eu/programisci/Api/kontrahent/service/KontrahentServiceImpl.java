package eu.programisci.Api.kontrahent.service;

import eu.programisci.Api.kontrahent.converters.KontrahentCoverter;
import eu.programisci.Api.kontrahent.dto.KontrahentDTO;
import eu.programisci.Api.kontrahent.dto.KontrahentForTableDTO;
import eu.programisci.Api.kontrahent.ob.KontrahentOB;
import eu.programisci.Api.kontrahent.repository.IKontrahentRepository;
import eu.programisci.Api.kontrahent.service.IKontrahentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class KontrahentServiceImpl implements IKontrahentService {

    @Autowired
    private IKontrahentRepository kontrahentRepository;

    @Autowired
    private KontrahentCoverter kontrahentCoverter;

    @Override
    public KontrahentDTO findOne(Long id) {
        KontrahentOB ob = kontrahentRepository.findOne(id);
        KontrahentDTO dto = kontrahentCoverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<KontrahentForTableDTO> findAllForTable() {
        List<KontrahentOB> obList = kontrahentRepository.findAll();
        List<KontrahentForTableDTO> dtoList = kontrahentCoverter.kontrahentObToUserForTable(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) {
        kontrahentRepository.delete(id);
    }

    @Override
    public KontrahentDTO save(KontrahentDTO dto) {
        if (dto.getId() == null) {
            return kontrahentCoverter.obToDto(create(dto));
        } else {
            return kontrahentCoverter.obToDto(update(dto));
        }
    }

    private KontrahentOB create(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentCoverter.dtoToOb(dto);
        ob = kontrahentRepository.save(ob);
        return ob;
    }

    private KontrahentOB update(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setAdres(dto.getAdres());
        ob.setNip(dto.getNip());
        ob = kontrahentRepository.save(ob);
        return ob;
    }
}
