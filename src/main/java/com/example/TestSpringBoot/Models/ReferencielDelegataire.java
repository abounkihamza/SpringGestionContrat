package com.example.TestSpringBoot.Models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class ReferencielDelegataire implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	   private String raisonSocial;
	   
	   private String rc;
	  
	   private String IF;
	   
	   private String ice;
	   
	   private String numCnss;
	   
	   private String adresse;
	   
	   private String tel;
	  
	   private String fax;
	   
	   private String email;
	   
	   private Double capitale;
	  
	   private Double capitaleParActionnaire;
	   
	   private String secteurActivitee;
	   
	   private boolean FillialeScEtrangere;
	   
	   private Document Status;
	   
	   private Document ModeleJ;
	   
	   @ManyToOne
		private Gerant gerant;
	   
	   @ManyToOne
		private Structure structure;
	   
	   @ManyToOne
	   private SocieteMere societeMere;

	   public ReferencielDelegataire() {
			// TODO Auto-generated constructor stub
		}
	

	public ReferencielDelegataire(String raisonSocial, String rc, String iF, String ice, String numCnss, String adresse,
			String tel, String fax, String email, Double capitale, Double capitaleParActionnaire,
			String secteurActivitee, boolean fillialeScEtrangere, Document status, Document modeleJ, Gerant gerant,
			Structure structure, SocieteMere societeMere) {
		super();
		this.raisonSocial = raisonSocial;
		this.rc = rc;
		IF = iF;
		this.ice = ice;
		this.numCnss = numCnss;
		this.adresse = adresse;
		this.tel = tel;
		this.fax = fax;
		this.email = email;
		this.capitale = capitale;
		this.capitaleParActionnaire = capitaleParActionnaire;
		this.secteurActivitee = secteurActivitee;
		FillialeScEtrangere = fillialeScEtrangere;
		Status = status;
		ModeleJ = modeleJ;
		this.gerant = gerant;
		this.structure = structure;
		this.societeMere = societeMere;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}
	
	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public String getRc() {
		return rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}

	public String getIF() {
		return IF;
	}

	public void setIF(String IF) {
		this.IF = IF;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	public String getNumCnss() {
		return numCnss;
	}

	public void setNumCnss(String numCnss) {
		this.numCnss = numCnss;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getCapitale() {
		return capitale;
	}

	public void setCapitale(Double capitale) {
		this.capitale = capitale;
	}

	public Double getCapitaleParActionnaire() {
		return capitaleParActionnaire;
	}

	public void setCapitaleParActionnaire(Double capitaleParActionnaire) {
		this.capitaleParActionnaire = capitaleParActionnaire;
	}

	public String getSecteurActivitee() {
		return secteurActivitee;
	}

	public void setSecteurActivitee(String secteurActivitee) {
		this.secteurActivitee = secteurActivitee;
	}

	public Document getStatus() {
		return Status;
	}

	public void setStatus(Document status) {
		Status = status;
	}

	public Document getModeleJ() {
		return ModeleJ;
	}

	public void setModeleJ(Document modeleJ) {
		ModeleJ = modeleJ;
	}


	public boolean isFillialeScEtrangere() {
		return FillialeScEtrangere;
	}


	public void setFillialeScEtrangere(boolean fillialeScEtrangere) {
		FillialeScEtrangere = fillialeScEtrangere;
	}


	public Gerant getGerant() {
		return gerant;
	}


	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}


	public Structure getStructure() {
		return structure;
	}


	public void setStructure(Structure structure) {
		this.structure = structure;
	}


	public SocieteMere getSocieteMere() {
		return societeMere;
	}


	public void setSocieteMere(SocieteMere societeMere) {
		this.societeMere = societeMere;
	}

	
	
}
