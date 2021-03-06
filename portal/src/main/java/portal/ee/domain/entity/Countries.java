package portal.ee.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "countries")
@Table(name = "COUNTRIES", schema = "hr")
public class Countries {
	
	@Id
	@Column(name = "COUNTRY_ID")
	private String countryId;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "REGION_ID")
	private int regionId;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	
}
