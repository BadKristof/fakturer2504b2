package eu.programisci.Api.towar.dto;

public class TowarForTableDTO {

    private Long id;
    private String nazwa;
    private String adres;
    private String nip;


    public Long getId() {return id;}

    public void setId(Long aId) {
        id = aId;
    }

    public String getNazwa() {return nazwa;}

    public void setNazwa(String aNazwa) {nazwa = aNazwa;}

    public String getAdres() {return adres;}

    public void setAdres(String aAdres) {adres = aAdres;}

    public String getNip() {return nip;}

    public void setNip(String aNip) {nip = aNip;}

    public TowarForTableDTO() {}


}
