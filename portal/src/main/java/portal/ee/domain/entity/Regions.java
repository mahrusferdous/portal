package portal.ee.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "regions")
@Table(name = "REGIONS", schema = "HR")
public class Regions {

	@Column(name = "REGION_ID")
	private int regionId;
	
	@Column(name = "REGION_NAME")
	private String regionName;

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
}
