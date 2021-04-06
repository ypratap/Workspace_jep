package com.customer.inf.systems.hib.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.customer.addr.systems.hib.entity.AddressEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "XTMPPERSON_TBL")
public class CisEntity {

	@Id
//	@GenericGenerator(name = "generator", strategy = "increment")

//	@SequenceGenerator(name = "generator", sequenceName = "ID_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "PERSON_ID")

	private int  perId;

//	private Name name;
	@Column(name = "FIRST_NAME")
	private String perFirstName;
//	@Column(name = "MIDDLE_NAME")
//	private String perMiddleName;
	@Column(name = "LAST_NAME")
	private String perLastName;

	@Column(name = "EMAIL")
	private String perEmail;
	@Column(name = "PHONE_1")
	private String perPrimaryPh;
	@Column(name = "PHONE_2")
	private String perSecondaryPh;
	// @ManyToMany(mappedBy = "addressId")
	// @MapsId("addressId")
	@OneToMany(targetEntity = AddressEntity.class, mappedBy = "addressId", fetch = FetchType.EAGER)
//	@JoinColumn(name = "XTMPCISADDRESS")
//	@Column(name = "ADDRESS_ID")
	private List<AddressEntity> address = new ArrayList<>();
//	private AddressEntity addressId;

	@Column(name = "VERSION")
	private int version;

	public List<AddressEntity> getAddressEntity() {
		// TODO Auto-generated method stub
		return address;
	}

	public void setAddressEntity(List<AddressEntity> address) {
		// TODO Auto-generated method stub
		this.address = address;
	}

}

//@Data
//@NoArgsConstructor
//@Embeddable
//class Name {
//	@Column(name = "FIRST_NAME")
//	private String perFirstName;
//	@Column(name = "MIDDLE_NAME")
//	private String perMiddleName;
//	@Column(name = "LAST_NAME")
//	private String perLastName;
//
//	// getters and setters omitted
//}