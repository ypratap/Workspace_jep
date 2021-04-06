package com.shiprock.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class CvsStore {

	@Id
	int reqId;
	@Column
	String storeLocation;
	@Column
	String userLocation;
	@Column
	String availablityStatus;
	@Column
	String state;
	@Column
	long distance;

}
