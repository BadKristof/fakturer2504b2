package eu.programisci.Api.towar.converters;

import eu.programisci.Api.kontrahent.dto.KontrahentDTO;
import eu.programisci.Api.kontrahent.dto.KontrahentForTableDTO;
import eu.programisci.Api.kontrahent.ob.KontrahentOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TowarCoverter {

    public KontrahentDTO obToDto(KontrahentOB in) {
        KontrahentDTO out = new KontrahentDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }

    public KontrahentOB dtoToOb(KontrahentDTO in) {
        KontrahentOB out = new KontrahentOB();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }


    public List<KontrahentForTableDTO> kontrahentObToUserForTable(List<KontrahentOB> inList) {
        if (inList == null) {
            return null;
        }
        List<KontrahentForTableDTO> outList = new ArrayList<>();
        for (KontrahentOB in : inList) {
            outList.add(kontrahentObToUserForTable(in));
        }
        return outList;
    }

    private KontrahentForTableDTO kontrahentObToUserForTable(KontrahentOB in) {
        KontrahentForTableDTO out = new KontrahentForTableDTO();
        out.setId(in.getId());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }
}
