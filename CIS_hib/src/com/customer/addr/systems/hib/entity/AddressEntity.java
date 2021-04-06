package com.customer.addr.systems.hib.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.GenericGenerator;

import com.customer.inf.systems.hib.entity.CisEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "XTMPADDRESS")
public class AddressEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "generator", strategy ="increment")
	//@SequenceGenerator(name = "generator", sequenceName = "ID_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
	@ManyToOne(targetEntity = CisEntity.class)
	//@JoinColumn(name = "XTMPCISADDRESS")
//	@Column(name = "ADDRESS_ID")
	private int addressId;
	@Column(name = "ADDRESS1")
	private String address1;
	@Column(name = "ADDRESS2")
	private String address2;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "ZIPCODE")
	private int zipCode;
	
	// @Column(name = "PERSON_ID")
//	@ManyToMany(mappedBy = "perId")
//	@MapsId("perId")
	// private List<CisEntity> person;
//	private CisEntity person;

}
