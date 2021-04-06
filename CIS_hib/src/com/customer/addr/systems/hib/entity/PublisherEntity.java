package com.customer.addr.systems.hib.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Embeddable
@Entity
@Table(name="XTEMPPUBLISHER")
	public class PublisherEntity {
		
		private String name;

		private Location location;

		public PublisherEntity(String name, Location location) {
			this.name = name;
			this.location = location;
		}

	



		//Getters and setters are omitted for brevity
	}

	@Embeddable
	@Data
	class Location extends PublisherEntity{

		private String country;

		private String city;

		public Location(String country, String city) {
			this.country = country;
			this.city = city;
		}

		private Location() {}

		//Getters and setters are omitted for brevity
	}
